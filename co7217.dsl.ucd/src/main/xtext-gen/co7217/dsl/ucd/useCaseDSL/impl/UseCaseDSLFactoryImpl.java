/**
 * generated by Xtext 2.23.0
 */
package co7217.dsl.ucd.useCaseDSL.impl;

import co7217.dsl.ucd.useCaseDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UseCaseDSLFactoryImpl extends EFactoryImpl implements UseCaseDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UseCaseDSLFactory init()
  {
    try
    {
      UseCaseDSLFactory theUseCaseDSLFactory = (UseCaseDSLFactory)EPackage.Registry.INSTANCE.getEFactory(UseCaseDSLPackage.eNS_URI);
      if (theUseCaseDSLFactory != null)
      {
        return theUseCaseDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UseCaseDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseCaseDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UseCaseDSLPackage.DIAGRAM: return createDiagram();
      case UseCaseDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case UseCaseDSLPackage.USE_CASES: return createUseCases();
      case UseCaseDSLPackage.USECASE: return createUsecase();
      case UseCaseDSLPackage.ACTORS: return createActors();
      case UseCaseDSLPackage.ACTOR: return createActor();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Diagram createDiagram()
  {
    DiagramImpl diagram = new DiagramImpl();
    return diagram;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCases createUseCases()
  {
    UseCasesImpl useCases = new UseCasesImpl();
    return useCases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Usecase createUsecase()
  {
    UsecaseImpl usecase = new UsecaseImpl();
    return usecase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actors createActors()
  {
    ActorsImpl actors = new ActorsImpl();
    return actors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Actor createActor()
  {
    ActorImpl actor = new ActorImpl();
    return actor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UseCaseDSLPackage getUseCaseDSLPackage()
  {
    return (UseCaseDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UseCaseDSLPackage getPackage()
  {
    return UseCaseDSLPackage.eINSTANCE;
  }

} //UseCaseDSLFactoryImpl
