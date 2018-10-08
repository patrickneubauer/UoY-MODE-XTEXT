/**
 */
package uk.ac.york.cs.statemachines.impl;

import uk.ac.york.cs.statemachines.Event;
import uk.ac.york.cs.statemachines.State;
import uk.ac.york.cs.statemachines.StateMachine;
import uk.ac.york.cs.statemachines.StatemachinesPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.york.cs.statemachines.impl.StateMachineImpl#getStates <em>States</em>}</li>
 *   <li>{@link uk.ac.york.cs.statemachines.impl.StateMachineImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link uk.ac.york.cs.statemachines.impl.StateMachineImpl#getResetEvents <em>Reset Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateMachineImpl extends MinimalEObjectImpl.Container implements StateMachine {
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * The cached value of the '{@link #getResetEvents() <em>Reset Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResetEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> resetEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatemachinesPackage.Literals.STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, StatemachinesPackage.STATE_MACHINE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, StatemachinesPackage.STATE_MACHINE__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getResetEvents() {
		if (resetEvents == null) {
			resetEvents = new EObjectResolvingEList<Event>(Event.class, this, StatemachinesPackage.STATE_MACHINE__RESET_EVENTS);
		}
		return resetEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StatemachinesPackage.STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case StatemachinesPackage.STATE_MACHINE__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatemachinesPackage.STATE_MACHINE__STATES:
				return getStates();
			case StatemachinesPackage.STATE_MACHINE__EVENTS:
				return getEvents();
			case StatemachinesPackage.STATE_MACHINE__RESET_EVENTS:
				return getResetEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatemachinesPackage.STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case StatemachinesPackage.STATE_MACHINE__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case StatemachinesPackage.STATE_MACHINE__RESET_EVENTS:
				getResetEvents().clear();
				getResetEvents().addAll((Collection<? extends Event>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatemachinesPackage.STATE_MACHINE__STATES:
				getStates().clear();
				return;
			case StatemachinesPackage.STATE_MACHINE__EVENTS:
				getEvents().clear();
				return;
			case StatemachinesPackage.STATE_MACHINE__RESET_EVENTS:
				getResetEvents().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatemachinesPackage.STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
			case StatemachinesPackage.STATE_MACHINE__EVENTS:
				return events != null && !events.isEmpty();
			case StatemachinesPackage.STATE_MACHINE__RESET_EVENTS:
				return resetEvents != null && !resetEvents.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StateMachineImpl
