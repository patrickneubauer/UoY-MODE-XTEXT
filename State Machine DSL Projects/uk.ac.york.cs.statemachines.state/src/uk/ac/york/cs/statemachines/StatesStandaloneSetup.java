/*
 * generated by Xtext
 */
package uk.ac.york.cs.statemachines;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class StatesStandaloneSetup extends StatesStandaloneSetupGenerated{

	public static void doSetup() {
		new StatesStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

