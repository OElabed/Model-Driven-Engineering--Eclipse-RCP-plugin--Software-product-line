/*
* generated by Xtext
*/
package featureSeqDiag.sdedit;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SD_languageStandaloneSetup extends SD_languageStandaloneSetupGenerated{

	public static void doSetup() {
		new SD_languageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
