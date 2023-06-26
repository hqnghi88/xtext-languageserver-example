package org.xtext.example.mydsl.ide;

import org.eclipse.xtext.ide.editor.quickfix.AbstractDeclarativeIdeQuickfixProvider;
import org.eclipse.xtext.ide.editor.quickfix.DiagnosticResolutionAcceptor;
import org.eclipse.xtext.ide.editor.quickfix.QuickFix;
import org.eclipse.xtext.xbase.lib.StringExtensions; 

public class MyDslIdeQuickfixProvider extends AbstractDeclarativeIdeQuickfixProvider {
	
	@QuickFix("invalidName")
	public void textFixLowerCaseName(DiagnosticResolutionAcceptor acceptor) {
		acceptor.accept("Capitalize Name",  (diagnostic, obj, document) -> {
			return createTextEdit(diagnostic, StringExtensions.toFirstUpper(document.getSubstring(diagnostic.getRange())));
		}
			
		);
	}

}
