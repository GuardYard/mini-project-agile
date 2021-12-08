package co7217.dsl.ucd.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

import com.google.inject.Inject

import co7217.dsl.ucd.useCaseDSL.Diagram

@ExtendWith(InjectionExtension)
@InjectWith(UseCaseDSLInjectorProvider)
class UseCaseDSLGroovyParsingTest {

	@Inject
	ParseHelper<Diagram> parseHelper
	
	@Test
	void testBasic() {
		def result = parseHelper.parse("""
use cases:
	useCase EatFood ( "The guest arrives with the order and gets the food" )
	useCase PayForFood ( "The guest orders food via the app and pays online" )

actors:
	actor Guest => EatFood, PayForFood
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}

	@Test
	void testSpecialization() {
		def result = parseHelper.parse("""
use cases:
	useCase EatFood ( "The guest arrives with the order and gets the food" )
	useCase Review ( "After tasting a plat, a review is entered on the app" )
	
actors:
	actor Guest => EatFood
	actor FoodCritic extends Guest => Review
""")
		Assertions.assertNotNull(result)
		def errors = result.eResource().errors
		Assertions.assertTrue(errors.isEmpty(), """Unexpected errors: ${errors.join(", ")}""")
	}

}




