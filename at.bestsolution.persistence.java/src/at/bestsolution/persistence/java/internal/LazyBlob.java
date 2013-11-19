package at.bestsolution.persistence.java.internal;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import at.bestsolution.persistence.java.JavaSession;

public class LazyBlob implements Blob {
    private Object id;
    private String table;
    private String blobColumn;
    private String idColumn;
    private Blob nativeBlob;
    private Connection connection;
    private JavaSession session;

    public LazyBlob(JavaSession session, String table, String blobColumn, String idColumn, Object id) {
        this.session = session;
        this.table = table;
        this.blobColumn = blobColumn;
        this.idColumn = idColumn;
        this.id = id;
    }

    @Override
    public void free() throws SQLException {
        if( nativeBlob != null ) {
            nativeBlob.free();
        }
        if( connection != null ) {
        	session.returnConnection(connection);
        }
    }

    private Blob getOrCreateNativeBlob() throws SQLException {
        if( nativeBlob == null ) {
            connection = session.checkoutConnection();
            String query = "SELECT \"" + blobColumn + "\" FROM " + table + " WHERE " + idColumn + " = ?";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setObject(1, id);
            ResultSet set = stmt.executeQuery();
            if( set.next() ) {
                nativeBlob = set.getBlob(1);
            }
        }
        return nativeBlob;
    }

    @Override
    public InputStream getBinaryStream() throws SQLException {
        return getOrCreateNativeBlob().getBinaryStream();
    }

    @Override
    public InputStream getBinaryStream(long pos, long length)
            throws SQLException {
        return getOrCreateNativeBlob().getBinaryStream(pos, length);
    }

    @Override
    public byte[] getBytes(long pos, int length) throws SQLException {
        return getOrCreateNativeBlob().getBytes(pos, length);
    }

    @Override
    public long length() throws SQLException {
        return getOrCreateNativeBlob().length();
    }

    @Override
    public long position(byte[] pattern, long start) throws SQLException {
        return getOrCreateNativeBlob().position(pattern, start);
    }

    @Override
    public long position(Blob pattern, long start) throws SQLException {
        return getOrCreateNativeBlob().position(pattern, start);
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
