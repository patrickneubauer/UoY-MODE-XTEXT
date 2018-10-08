/**
 */
package uk.ac.york.cs.statemachines;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.statemachines.StateMachine#getStates <em>States</em>}</li>
 *   <li>{@link uk.ac.york.cs.statemachines.StateMachine#getEvents <em>Events</em>}</li>
 *   <li>{@link uk.ac.york.cs.statemachines.StateMachine#getResetEvents <em>Reset Events</em>}</li>
 * </ul>
 *
 * @see uk.ac.york.cs.statemachines.StatemachinesPackage#getStateMachine()
 * @model
 * @generated
 */
public interface StateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.statemachines.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see uk.ac.york.cs.statemachines.StatemachinesPackage#getStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link uk.ac.york.cs.statemachines.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see uk.ac.york.cs.statemachines.StatemachinesPackage#getStateMachine_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Reset Events</b></em>' reference list.
	 * The list contents are of type {@link uk.ac.york.cs.statemachines.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reset Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reset Events</em>' reference list.
	 * @see uk.ac.york.cs.statemachines.StatemachinesPackage#getStateMachine_ResetEvents()
	 * @model
	 * @generated
	 */
	EList<Event> getResetEvents();

} // StateMachine
