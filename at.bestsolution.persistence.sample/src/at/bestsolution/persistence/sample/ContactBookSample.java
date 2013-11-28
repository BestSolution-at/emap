package at.bestsolution.persistence.sample;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import sample.Address;
import sample.Person;
import sample.PersonMapper;
import at.bestsolution.persistence.Session;
import at.bestsolution.persistence.SessionFactory;

public class ContactBookSample {
	private SessionFactory factory;
	
	public ContactBookSample() {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		ServiceReference<SessionFactory> serviceReference = bundleContext.getServiceReference(SessionFactory.class);
		this.factory = bundleContext.getService(serviceReference);
	}
	
	public void run() {
		Session session = this.factory.createSession();
		
		StringBuilder b = new StringBuilder();
		PersonMapper personMapper = session.createMapper(PersonMapper.class);
		for( Person p : personMapper.selectAll() ) {
			b.append(p.getFirstname() + ", " + p.getLastname()+"\n");
			for( Address a : p.getAddressList() ) {
				b.append("	" + a.getStreet() + ", " + a.getZip() + " - " + a.getCity() + ", " + a.getCountry().getName()+"\n");
			}
		}
		
		System.out.println("====================");
		System.out.println(b);
		
		session.close();
	}
}
