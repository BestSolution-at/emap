package at.bestsolution.persistence.sample.app;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import at.bestsolution.persistence.sample.ContactBookSample;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {

	public Object start(IApplicationContext context) throws Exception {
		ContactBookSample sample = new ContactBookSample();
		sample.run();
		return IApplication.EXIT_OK;
	}

	public void stop() {
		// nothing to do
	}
}
