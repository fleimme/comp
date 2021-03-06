/**
 */
package org.xtext.tl.mydsl.myDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definiton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Definiton#getInputVars <em>Input Vars</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Definiton#getCommandList <em>Command List</em>}</li>
 *   <li>{@link org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars <em>Output Vars</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getDefiniton()
 * @model
 * @generated
 */
public interface Definiton extends EObject
{
  /**
   * Returns the value of the '<em><b>Input Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Input Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Input Vars</em>' containment reference.
   * @see #setInputVars(Input)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getDefiniton_InputVars()
   * @model containment="true"
   * @generated
   */
  Input getInputVars();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Definiton#getInputVars <em>Input Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Input Vars</em>' containment reference.
   * @see #getInputVars()
   * @generated
   */
  void setInputVars(Input value);

  /**
   * Returns the value of the '<em><b>Command List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Command List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Command List</em>' containment reference.
   * @see #setCommandList(Commands)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getDefiniton_CommandList()
   * @model containment="true"
   * @generated
   */
  Commands getCommandList();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Definiton#getCommandList <em>Command List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Command List</em>' containment reference.
   * @see #getCommandList()
   * @generated
   */
  void setCommandList(Commands value);

  /**
   * Returns the value of the '<em><b>Output Vars</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Output Vars</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Output Vars</em>' containment reference.
   * @see #setOutputVars(Output)
   * @see org.xtext.tl.mydsl.myDsl.MyDslPackage#getDefiniton_OutputVars()
   * @model containment="true"
   * @generated
   */
  Output getOutputVars();

  /**
   * Sets the value of the '{@link org.xtext.tl.mydsl.myDsl.Definiton#getOutputVars <em>Output Vars</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Output Vars</em>' containment reference.
   * @see #getOutputVars()
   * @generated
   */
  void setOutputVars(Output value);

} // Definiton
