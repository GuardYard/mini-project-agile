/*
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.ide;

import co7217.dsl.ucd.UseCaseDSLRuntimeModule;
import co7217.dsl.ucd.UseCaseDSLStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class UseCaseDSLIdeSetup extends UseCaseDSLStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new UseCaseDSLRuntimeModule(), new UseCaseDSLIdeModule()));
	}
	
}
