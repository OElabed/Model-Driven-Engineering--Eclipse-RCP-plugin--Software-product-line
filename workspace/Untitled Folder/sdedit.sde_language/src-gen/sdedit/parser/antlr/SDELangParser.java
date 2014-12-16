/*
* generated by Xtext
*/
package sdedit.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import sdedit.services.SDELangGrammarAccess;

public class SDELangParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SDELangGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected sdedit.parser.antlr.internal.InternalSDELangParser createParser(XtextTokenStream stream) {
		return new sdedit.parser.antlr.internal.InternalSDELangParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "SDEditModel";
	}
	
	public SDELangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SDELangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}