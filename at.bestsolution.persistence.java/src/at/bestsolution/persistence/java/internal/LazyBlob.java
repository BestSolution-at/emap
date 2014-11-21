/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import at.bestsolution.persistence.java.JavaSession;

public class LazyBlob implements Blob {
    private Object id;
    private String table;
    private String blobColumn;
    private String idColumn;
    
    private JavaSession session;

    private static final Logger LOGGER = Logger.getLogger(LazyBlob.class);

    public LazyBlob(JavaSession session, String table, String blobColumn, String idColumn, Object id) {
    	if( LOGGER.isDebugEnabled() ) {
    		LOGGER.debug("LazyBlob Table: '"+table+"', Id-Column: '"+idColumn+"' = '"+id+"', Blob-Column: '"+blobColumn+"' ");
    	}

        this.session = session;
        this.table = table;
        this.blobColumn = blobColumn;
        this.idColumn = idColumn;
        this.id = id;
    }

    @Override
    public void free() throws SQLException {
    }

    @Override
    public InputStream getBinaryStream() throws SQLException {
        return new BlobDataInputStream();
    }
    
    private class BlobDataInputStream extends InputStream {
    	private Connection blobConnection;
    	private Blob blob;
    	private InputStream realStream;
    	
    	public BlobDataInputStream() throws SQLException {
    		final boolean debug = LOGGER.isDebugEnabled();
    		if (debug) {
        		LOGGER.debug("begin binary stream for blob data: Table: '"+table+"', Id-Column: '"+idColumn+"' = '"+id+"', Blob-Column: '"+blobColumn+"' ");
        	}
    		
    		blobConnection = session.checkoutConnection();
    		
    		final String query = "SELECT \"" + blobColumn + "\" FROM " + table + " WHERE " + idColumn + " = ?";
            if( debug ) {
            	LOGGER.debug("Query:" + query);
            	LOGGER.debug("Parameter: " + id);
            }
    		
            final PreparedStatement stmt = blobConnection.prepareStatement(query);
            stmt.setObject(1, id);
            
            final ResultSet set = stmt.executeQuery();
            
            if( set.next() ) {
                blob = set.getBlob(1);
                
                realStream = blob.getBinaryStream();
            }
            else {
            	throw new SQLException("could not fetch blob!");
            }
    	}
    	
    	
		@Override
		public int read() throws IOException {
			return realStream.read();
		}
		
		@Override
		public int read(byte[] b) throws IOException {
			return realStream.read(b);
		}
		
		@Override
		public int read(byte[] b, int off, int len) throws IOException {
			return realStream.read(b, off, len);
		}
		
		@Override
		public synchronized void reset() throws IOException {
			realStream.reset();
		}
    	
		@Override
		public boolean markSupported() {
			return realStream.markSupported();
		}
		
		@Override
		public int available() throws IOException {
			return realStream.available();
		}
		
		@Override
		public synchronized void mark(int readlimit) {
			realStream.mark(readlimit);
		}
		
		@Override
		public long skip(long n) throws IOException {
			return realStream.skip(n);
		}
		
		@Override
		public void close() throws IOException {
			final boolean debug = LOGGER.isDebugEnabled();
	    	if (debug) {
	    		LOGGER.debug("end binary stream for blob data: Table: '"+table+"', Id-Column: '"+idColumn+"' = '"+id+"', Blob-Column: '"+blobColumn+"' ");
	    	}
			try {
				blob.free();
			} catch (SQLException e) {
			}
			session.returnConnection(blobConnection);
		}
    	
    }

    @Override
    public InputStream getBinaryStream(long pos, long length) throws SQLException {
    	throw new UnsupportedOperationException("This blob only supports an input stream");
    }

    @Override
    public byte[] getBytes(long pos, int length) throws SQLException {
    	throw new UnsupportedOperationException("This blob only supports an input stream");
    }

    @Override
    public long length() throws SQLException {
    	throw new UnsupportedOperationException("This blob only supports an input stream");
    }

    @Override
    public long position(byte[] pattern, long start) throws SQLException {
    	throw new UnsupportedOperationException("This blob only supports an input stream");
    }

    @Override
    public long position(Blob pattern, long start) throws SQLException {
    	throw new UnsupportedOperationException("This blob only supports an input stream");
    }

    @Override
    public OutputStream setBinaryStream(long pos) throws SQLException {
        throw new UnsupportedOperationException("This is a readonly blob");
    }

    @Override
    public int setBytes(long pos, byte[] bytes) throws SQLException {
        throw new UnsupportedOperationException("This is a readonly blob");
    }

    @Override
    public int setBytes(long pos, byte[] bytes, int offset, int len)
            throws SQLException {
        throw new UnsupportedOperationException("This is a readonly blob");
    }

    @Override
    public void truncate(long len) throws SQLException {
        throw new UnsupportedOperationException("This is a readonly blob");
    }

//    class WrappedInputStream extends InputStream {
//        private InputStream wrapped;
//
//        public WrappedInputStream(InputStream wrapped) {
//            this.wrapped = wrapped;
//        }
//
//        @Override
//        public int read() throws IOException {
//            return wrapped.read();
//        }
//
//        @Override
//        public int available() throws IOException {
//            return wrapped.available();
//        }
//
//        @Override
//        public void close() throws IOException {
//        	wrapped.close();
//        }
//
//        @Override
//        public synchronized void mark(int readlimit) {
//        	wrapped.mark(readlimit);
//        }
//
//        @Override
//        public boolean markSupported() {
//        	return wrapped.markSupported();
//        }
//
//        @Override
//        public int read(byte[] b) throws IOException {
//        	return wrapped.read(b);
//        }
//
//        @Override
//        public int read(byte[] b, int off, int len) throws IOException {
//        	return wrapped.read(b, off, len);
//        }
//
//        @Override
//        public boolean equals(Object obj) {
//        	return wrapped.equals(obj);
//        }
//
//        @Override
//        public int hashCode() {
//        	return wrapped.hashCode();
//        }
//
//        @Override
//        public synchronized void reset() throws IOException {
//        	wrapped.reset();
//        }
//
//        @Override
//        public long skip(long n) throws IOException {
//        	return wrapped.skip(n);
//        }
//
//        @Override
//        public String toString() {
//        	return wrapped.toString();
//        }
//    }
}
