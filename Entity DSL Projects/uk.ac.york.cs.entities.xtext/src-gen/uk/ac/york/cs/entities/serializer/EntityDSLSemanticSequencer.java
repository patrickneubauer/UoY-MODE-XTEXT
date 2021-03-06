/*
 * generated by Xtext 2.14.0
 */
package uk.ac.york.cs.entities.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import uk.ac.york.cs.entities.EntitiesPackage;
import uk.ac.york.cs.entities.Entity;
import uk.ac.york.cs.entities.Model;
import uk.ac.york.cs.entities.Property;
import uk.ac.york.cs.entities.SimpleType;
import uk.ac.york.cs.entities.services.EntityDSLGrammarAccess;

@SuppressWarnings("all")
public class EntityDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntityDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EntitiesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EntitiesPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case EntitiesPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case EntitiesPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case EntitiesPackage.SIMPLE_TYPE:
				sequence_SimpleType(context, (SimpleType) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Type returns Entity
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=EString extends=[Entity|QualifiedName]? properties+=Property*)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (name=EString type=[Type|QualifiedName] many?='[]'?)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns SimpleType
	 *     SimpleType returns SimpleType
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_SimpleType(ISerializationContext context, SimpleType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntitiesPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntitiesPackage.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSimpleTypeAccess().getNameEStringParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
