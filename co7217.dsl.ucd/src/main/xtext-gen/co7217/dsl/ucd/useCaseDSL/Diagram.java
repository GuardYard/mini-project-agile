/**
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.useCaseDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.ucd.useCaseDSL.Diagram#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link co7217.dsl.ucd.useCaseDSL.AbstractElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage#getDiagram_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // Diagram