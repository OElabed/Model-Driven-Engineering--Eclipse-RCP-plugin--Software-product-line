/**
 */
package sdedit.sDELang.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sdedit.sDELang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sdedit.sDELang.SDELangPackage
 * @generated
 */
public class SDELangAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SDELangPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SDELangAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SDELangPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SDELangSwitch<Adapter> modelSwitch =
    new SDELangSwitch<Adapter>()
    {
      @Override
      public Adapter caseSDEditModel(SDEditModel object)
      {
        return createSDEditModelAdapter();
      }
      @Override
      public Adapter caseSDEditObj(SDEditObj object)
      {
        return createSDEditObjAdapter();
      }
      @Override
      public Adapter caseSDEditObjname(SDEditObjname object)
      {
        return createSDEditObjnameAdapter();
      }
      @Override
      public Adapter caseSDEditCombinableDiagElt(SDEditCombinableDiagElt object)
      {
        return createSDEditCombinableDiagEltAdapter();
      }
      @Override
      public Adapter caseSDEditCall(SDEditCall object)
      {
        return createSDEditCallAdapter();
      }
      @Override
      public Adapter caseSDEditCombinedFragment(SDEditCombinedFragment object)
      {
        return createSDEditCombinedFragmentAdapter();
      }
      @Override
      public Adapter caseSDEditAlt(SDEditAlt object)
      {
        return createSDEditAltAdapter();
      }
      @Override
      public Adapter caseSDEditLoop(SDEditLoop object)
      {
        return createSDEditLoopAdapter();
      }
      @Override
      public Adapter caseSDEditOpt(SDEditOpt object)
      {
        return createSDEditOptAdapter();
      }
      @Override
      public Adapter caseCondition(Condition object)
      {
        return createConditionAdapter();
      }
      @Override
      public Adapter caseConditionlistRight(ConditionlistRight object)
      {
        return createConditionlistRightAdapter();
      }
      @Override
      public Adapter caseConditionElm(ConditionElm object)
      {
        return createConditionElmAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditModel <em>SD Edit Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditModel
   * @generated
   */
  public Adapter createSDEditModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditObj <em>SD Edit Obj</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditObj
   * @generated
   */
  public Adapter createSDEditObjAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditObjname <em>SD Edit Objname</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditObjname
   * @generated
   */
  public Adapter createSDEditObjnameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditCombinableDiagElt <em>SD Edit Combinable Diag Elt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditCombinableDiagElt
   * @generated
   */
  public Adapter createSDEditCombinableDiagEltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditCall <em>SD Edit Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditCall
   * @generated
   */
  public Adapter createSDEditCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditCombinedFragment <em>SD Edit Combined Fragment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditCombinedFragment
   * @generated
   */
  public Adapter createSDEditCombinedFragmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditAlt <em>SD Edit Alt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditAlt
   * @generated
   */
  public Adapter createSDEditAltAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditLoop <em>SD Edit Loop</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditLoop
   * @generated
   */
  public Adapter createSDEditLoopAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.SDEditOpt <em>SD Edit Opt</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.SDEditOpt
   * @generated
   */
  public Adapter createSDEditOptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.Condition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.Condition
   * @generated
   */
  public Adapter createConditionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.ConditionlistRight <em>Conditionlist Right</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.ConditionlistRight
   * @generated
   */
  public Adapter createConditionlistRightAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sdedit.sDELang.ConditionElm <em>Condition Elm</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sdedit.sDELang.ConditionElm
   * @generated
   */
  public Adapter createConditionElmAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SDELangAdapterFactory
