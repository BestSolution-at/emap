package at.bestsolution.persistence.emap.junit;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import at.bestsolution.persistence.ObjectMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;

public class AbstractTestCase<M extends ObjectMapper<?>> {
	private SessionFactory factory;
	private Session session;
	private Class<M> mapper;

	public AbstractTestCase(Class<M> mapper) {
		this.mapper = mapper;
	}

	protected Session getSession() {
		if( session == null ) {
			session = getSessionFactory().createSession();
		}
		return session;
	}

	private SessionFactory getSessionFactory() {
		if( factory == null ) {
			BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
			ServiceReference<SessionFactory> reference = bundleContext.getServiceReference(SessionFactory.class);
			factory = bundleContext.getService(reference);
		}

		return factory;

	}

	public M getMapper() {
		return getSession().createMapper(mapper);
	}
}