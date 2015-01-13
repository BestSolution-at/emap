package at.bestsolution.persistence.java.tests;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

import at.bestsolution.persistence.java.internal.LocalBlob;

public class TestLocalBlob {
	
	private final int TEST_DATA_SIZE = 1024;
	
	private byte[] testData;

	private byte[] getTestData() {
		if (testData == null) {
			Random r = new Random();
			testData = new byte[TEST_DATA_SIZE];
			r.nextBytes(testData);
		}
		return testData;
	}
	
	@Test
	public void writeToBlobOutputStreamFullByteArray() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData());
		out.close();
		
		byte[] readBack = new byte[(int)blob.length()];
		
		InputStream in = blob.getBinaryStream();
		in.read(readBack);
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
	
	@Test
	public void writeToBlobOutputStreamBufferedByteArray() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData(), 0, 512);
		out.write(getTestData(), 512, 512);
		out.close();
		
		byte[] readBack = new byte[(int)blob.length()];
		
		InputStream in = blob.getBinaryStream();
		in.read(readBack);
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
	
	@Test
	public void writeToBlobOutputStreamSingleByte() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		for (int i = 0; i < TEST_DATA_SIZE; i++) {
			out.write(Byte.toUnsignedInt(getTestData()[i]));
		}
		out.close();
		
		byte[] readBack = new byte[(int)blob.length()];
		
		InputStream in = blob.getBinaryStream();
		in.read(readBack);
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
	
	@Test
	public void readFromBlobInputStreamFullByteArray() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData());
		out.close();
		
		byte[] readBack = new byte[(int)blob.length()];
		
		InputStream in = blob.getBinaryStream();
		in.read(readBack);
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
	
	@Test
	public void readFromBlobInputStreamBufferedByteArray() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData());
		out.close();
		
		ByteBuffer readBack = ByteBuffer.allocate(TEST_DATA_SIZE);
		byte[] buf = new byte[133];
		InputStream in = blob.getBinaryStream();
		int read;
		while ((read = in.read(buf)) != -1) {
			readBack.put(buf, 0, read);
		}
		in.close();
		
		Assert.assertArrayEquals(readBack.array(), getTestData());
	}
	
	@Test
	public void readFromBlobInputStreamSubByteArray() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData());
		out.close();
		
		byte[] readBack = new byte[TEST_DATA_SIZE];
		InputStream in = blob.getBinaryStream();
		in.read(readBack, 0, 512);
		in.read(readBack, 512, 512);
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
	
	
	@Test
	public void readFromBlobInputStreamSingleByte() throws IOException, SQLException {
		LocalBlob blob = new LocalBlob();
		
		OutputStream out = blob.setBinaryStream(1);
		out.write(getTestData());
		out.close();
		
		byte[] readBack = new byte[TEST_DATA_SIZE];
		
		InputStream in = blob.getBinaryStream();
		for (int i = 0; i < TEST_DATA_SIZE; i++) {
			readBack[i] = (byte)in.read();
		}
		in.close();
		
		Assert.assertArrayEquals(readBack, getTestData());
	}
}
