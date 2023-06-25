/*******************************************************************************************************
 *
 * Application.java, in msi.gama.headless, is part of the source code of the GAMA modeling and simulation platform
 * (v.2.0.0).
 *
 * (c) 2007-2023 UMI 209 UMMISCO IRD/SU & Partners (IRIT, MIAT, TLU, CTU)
 *
 * Visit https://github.com/gama-platform/gama2 for license information and contacts.
 *
 ********************************************************************************************************/
package msi.gama.headless.runtime;

import static java.lang.Integer.parseInt;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import msi.gama.headless.core.HeadlessSimulationLoader; 
 

/**
 * The Class Application.
 */
public class Application implements IApplication {
 
	/** The head less simulation. */
	public static boolean headLessSimulation = false;
 

	@SuppressWarnings ("unused")
	@Override
	public Object start(final IApplicationContext context) throws Exception {
 

		// ========================
		// With GAMA run
		// ========================
		HeadlessSimulationLoader.preloadGAMA();
  

		return null;
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}


}
