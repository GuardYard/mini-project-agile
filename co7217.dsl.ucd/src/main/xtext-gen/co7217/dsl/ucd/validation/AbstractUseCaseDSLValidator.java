/*
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractUseCaseDSLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage.eINSTANCE);
		return result;
	}
}