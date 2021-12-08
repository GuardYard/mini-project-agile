package co7217.dsl.ucd.generator

/**
 * Serialization of entities using the DSL: used in slides
 */
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.resource.XtextResourceSet
import org.junit.After

import com.google.inject.Injector
import co7217.dsl.ucd.UseCaseDSLStandaloneSetup
import co7217.dsl.ucd.useCaseDSL.Diagram
import co7217.dsl.ucd.useCaseDSL.UseCases
import co7217.dsl.ucd.useCaseDSL.Usecase
import co7217.dsl.ucd.useCaseDSL.Actors
import co7217.dsl.ucd.useCaseDSL.Actor

import submission_helper.SubmissionHelper

class submission_solution {
	
		def static void main(String[] args) {
//		def path = 'src/main/resources/example1.ucd'
		def path = 'src/main/resources/example2.ucd'
		/**
		 * TODO: update your username
		 */
		
	}
	
	def static solution = { path ->
		String text = ''
		
		// do this only once per application
		Injector injector = new UseCaseDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
		
		// obtain a resourceset from the injector
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		
		// load a resource by URI, in this case from the file system
		Resource resource = resourceSet.getResource(URI.createFileURI(path), true);
		
		Diagram model = resource.getContents().get(0)
		
		/**
		 * TODO: call your code generator
		 */

		text += traverse(model)
		text
	}
	
	def static String traverse(List<EObject> list) {
		String text = ''
		for (obj in list) {
			text += traverse(obj)
		}
		text
	}
	
	def static String traverse(EObject obj) {
		String text = ''
		
		switch(obj) {
			case Diagram : 
				break
			case UseCases :
				break
			case Usecase :
				break
			case Actors :
				break		
			case Actor :
				break		
		}
		text
	}
	
	def static generate(EObject obj) {
		String text = ''
		switch(obj) {
			case UseCases :
				break
			case Usecase :
				break
			case Actors :
				break
			case Actor :
				break
		}
		
		text
	}
	
}
