/*
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UseCaseDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("co7217/dsl/ucd/parser/antlr/internal/InternalUseCaseDSL.tokens");
	}
}
