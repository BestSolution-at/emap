package at.bestsolution.persistence.java.internal;

import java.util.UUID;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;

public class JavaSessionFactory implements SessionFactory {

	@Override
	public Session createSession() {
		return null;
	}

	class JavaSession implements Session {
		private String id = UUID.randomUUID().toString();

		@Override
		public String getId() {
			return id;
		}

		@Override
		public <M extends ObjectMapper<?>> M createMapper(Class<M> mapper) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void runInTransaction(Transaction transaction) {
			// TODO Auto-generated method stub

		}

		@Override
		public void close() {
			// TODO Auto-generated method stub

		}
	}
}