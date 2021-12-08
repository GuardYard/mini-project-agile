/**
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.useCaseDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Usecase</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.ucd.useCaseDSL.Usecase#getName <em>Name</em>}</li>
 *   <li>{@link co7217.dsl.ucd.useCaseDSL.Usecase#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage#getUsecase()
 * @model
 * @generated
 */
public interface Usecase extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage#getUsecase_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link co7217.dsl.ucd.useCaseDSL.Usecase#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' attribute.
   * @see #setInstructions(String)
   * @see co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage#getUsecase_Instructions()
   * @model
   * @generated
   */
  String getInstructions();

  /**
   * Sets the value of the '{@link co7217.dsl.ucd.useCaseDSL.Usecase#getInstructions <em>Instructions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Instructions</em>' attribute.
   * @see #getInstructions()
   * @generated
   */
  void setInstructions(String value);

} // Usecase
