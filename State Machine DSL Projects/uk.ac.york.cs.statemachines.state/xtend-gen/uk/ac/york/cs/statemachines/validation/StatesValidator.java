/**
 * generated by Xtext
 */
package uk.ac.york.cs.statemachines.validation;

import org.eclipse.xtext.validation.Check;
import uk.ac.york.cs.statemachines.StatemachinesPackage;
import uk.ac.york.cs.statemachines.validation.AbstractStatesValidator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class StatesValidator extends AbstractStatesValidator {
  public final static String NO_CAPITAL_AT_BEGINNING = "noCapitalAtBeginning";
  
  @Check
  public void checkStateNameStartsWithCapital(final uk.ac.york.cs.statemachines.State state) {
    boolean _isUpperCase = Character.isUpperCase(state.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("Name should begin with a capital", 
        StatemachinesPackage.Literals.STATE__NAME, 
        StatesValidator.NO_CAPITAL_AT_BEGINNING, 
        state.getName());
    }
  }
}