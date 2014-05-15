/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *     Christoph Caks <ccaks@bestsolution.at> - finished implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.internal;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.sql.Blob;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;

public class LocalBlob implements Blob {
	private File storageFile;
	private RandomAccessFile storage;
	
	private boolean blobInvalid = false;
	
	private void checkInvalid() throws SQLException {
		if (blobInvalid) {
			throw new SQLException("BLOB invalid (already freed)");
		}
	}
	
	private void checkPointer(long pointer) throws SQLException {
		if (pointer < 1) {
			throw new SQLException("pointer must be >= 1");
		}
	}
	
	private File createStorageFile() throws IOException {
		final File storageFile = File.createTempFile("emap", "blob");
		storageFile.deleteOnExit();
		return storageFile;
	}
	
	private RandomAccessFile createStorage(File storageFile) throws IOException {
		return  new RandomAccessFile(storageFile, "rw");
	}
	
	private RandomAccessFile getStorage() throws IOException {
		if (storage == null) {
			storageFile = createStorageFile();
			storage = createStorage(storageFile);
		}
		return storage;
	}
	
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		try {
			if (storage != null) {
				storage.close();
				storage = null;
			}
		}
		catch (IOException e) {
		}
		if (storageFile != null) {
			if (storageFile.delete()) {
				storageFile = null;
			}
		}
	}
	
	@Override
	public void free() throws SQLException {
		try {
			if (storage != null) {
				storage.close();
				storage = null;
			}
			if (storageFile != null) {
				storageFile.delete();
				storageFile = null;
			}
		} catch (IOException e) {
			throw new SQLException(e);
		}
		finally {
			blobInvalid = true;
		}
	}

	@Override
	public InputStream getBinaryStream() throws SQLException {
		checkInvalid();
		try {
			return new RAF_InputStream(getStorage());
		}
		catch (IOException e) {
			throw new SQLException(e);
		}
	}

	@Override
	public InputStream getBinaryStream(long pos, long length) throws SQLException {
		checkInvalid();
		checkPointer(pos);
		throw new UnsupportedOperationException();
	}

	@Override
	public byte[] getBytes(long pos, int length) throws SQLException {
		checkInvalid();
		checkPointer(pos);
		try {
			byte[] buf = new byte[length];
			getStorage().seek(pos-1);
			getStorage().read(buf, 0, length);
			return buf;
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}

	@Override
	public long length() throws SQLException {
		checkInvalid();
		try {
			return getStorage().length();
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}

	@Override
	public long position(byte[] pattern, long start) throws SQLException {
		checkInvalid();
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public long position(Blob pattern, long start) throws SQLException {
		checkInvalid();
		throw new SQLFeatureNotSupportedException();
	}

	@Override
	public OutputStream setBinaryStream(long pos) throws SQLException {
		checkInvalid();
		checkPointer(pos);
		try {
			return new RAF_OutputStream(getStorage(), pos);
		}
		catch (IOException e) {
			throw new SQLException(e);
		}
	}

	@Override
	public int setBytes(long pos, byte[] bytes) throws SQLException {
		return this.setBytes(pos, bytes, 0, bytes.length);
	}

	@Override
	public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
		checkInvalid();
		checkPointer(pos);
		try {
			getStorage().seek(pos-1);
			getStorage().write(bytes, offset, len);
			return len;
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}

	@Override
	public void truncate(long len) throws SQLException {
		checkInvalid();
		try {
			getStorage().setLength(len);
		} catch (IOException e) {
			throw new SQLException(e);
		}
	}
	
	static class RAF_OutputStream extends OutputStream {
		private final RandomAccessFile raf;
		private long offset;
		
		public RAF_OutputStream(RandomAccessFile raf) {
			this(raf, 0);
		}
		
		public RAF_OutputStream(RandomAccessFile raf, long offset) {
			this.raf = raf;
			this.offset = offset;
		}
		
		@Override
		public void write(byte[] b) throws IOException {
			this.write(b, 0, b.length);
		}
		
		@Override
		public void write(byte[] b, int off, int len) throws IOException {
			raf.seek(offset);
			raf.write(b, off, len);
			offset += len;
		}
		
		@Override
		public void write(int b) throws IOException {
			raf.seek(offset);
			raf.write(b);
			offset += 1;
		}
		
	}
	
	static class RAF_InputStream extends InputStream {
		private final RandomAccessFile raf;
		private int offset;
		
		public RAF_InputStream(RandomAccessFile raf) {
			this.raf = raf;
			this.offset = 0;
		}
		
		@Override
		public int read(byte[] b) throws IOException {
			return read(b, offset, b.length);
		}
		
		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			if (offset >= raf.length()) {
				return -1;
			}
			
			raf.seek(offset);
			int readLen = raf.read(b, off, len);
			if (readLen != -1) {
				offset += readLen;
			}
			return readLen;
		}
		
		
		@Override
		public int read() throws IOException {
			if (offset >= raf.length()) {
				return -1;
			}
			
			raf.seek(offset);
			int r = raf.read();
			offset += 1;
			return r;
		}
	}
}