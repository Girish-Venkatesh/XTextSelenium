/*
* generated by Xtext
*/
package com.vmware.in.testframework;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TestFrameworkStandaloneSetup extends TestFrameworkStandaloneSetupGenerated{

	public static void doSetup() {
		new TestFrameworkStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

