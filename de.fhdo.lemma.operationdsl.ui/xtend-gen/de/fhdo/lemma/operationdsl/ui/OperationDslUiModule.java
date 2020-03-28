/**
 * generated by Xtext 2.16.0
 */
package de.fhdo.lemma.operationdsl.ui;

import de.fhdo.lemma.operationdsl.ui.AbstractOperationDslUiModule;
import de.fhdo.lemma.operationdsl.ui.highlighting.HighlightingCalculator;
import de.fhdo.lemma.operationdsl.ui.highlighting.HighlightingConfiguration;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 * 
 * @author <a href="mailto:florian.rademacher@fh-dortmund.de>Florian Rademacher</a>
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class OperationDslUiModule extends AbstractOperationDslUiModule {
  /**
   * def Class<? extends XtextEditor> bindXtextEditor() {
   * LiveValidationCapableXtextEditor
   * }
   * 
   * def Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
   * LiveValidationXtextDocumentProvider
   * }
   * 
   * @SingletonBinding(eager=true)
   * def ServerConnection bindServerConnection() {
   * return ServerConnection.instance
   * }
   */
  public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
    return HighlightingConfiguration.class;
  }
  
  public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
    return HighlightingCalculator.class;
  }
  
  public OperationDslUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
