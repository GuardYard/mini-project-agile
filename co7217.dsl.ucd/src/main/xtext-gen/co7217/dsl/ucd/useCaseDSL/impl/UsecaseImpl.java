/**
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.useCaseDSL.impl;

import co7217.dsl.ucd.useCaseDSL.UseCaseDSLPackage;
import co7217.dsl.ucd.useCaseDSL.Usecase;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usecase</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link co7217.dsl.ucd.useCaseDSL.impl.UsecaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link co7217.dsl.ucd.useCaseDSL.impl.UsecaseImpl#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UsecaseImpl extends MinimalEObjectImpl.Container implements Usecase
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected static final String INSTRUCTIONS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInstructions()
   * @generated
   * @ordered
   */
  protected String instructions = INSTRUCTIONS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UsecaseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return UseCaseDSLPackage.Literals.USECASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCaseDSLPackage.USECASE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getInstructions()
  {
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInstructions(String newInstructions)
  {
    String oldInstructions = instructions;
    instructions = newInstructions;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, UseCaseDSLPackage.USECASE__INSTRUCTIONS, oldInstructions, instructions));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case UseCaseDSLPackage.USECASE__NAME:
        return getName();
      case UseCaseDSLPackage.USECASE__INSTRUCTIONS:
        return getInstructions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case UseCaseDSLPackage.USECASE__NAME:
        setName((String)newValue);
        return;
      case UseCaseDSLPackage.USECASE__INSTRUCTIONS:
        setInstructions((String)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case UseCaseDSLPackage.USECASE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case UseCaseDSLPackage.USECASE__INSTRUCTIONS:
        setInstructions(INSTRUCTIONS_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case UseCaseDSLPackage.USECASE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case UseCaseDSLPackage.USECASE__INSTRUCTIONS:
        return INSTRUCTIONS_EDEFAULT == null ? instructions != null : !INSTRUCTIONS_EDEFAULT.equals(instructions);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", instructions: ");
    result.append(instructions);
    result.append(')');
    return result.toString();
  }

} //UsecaseImpl
