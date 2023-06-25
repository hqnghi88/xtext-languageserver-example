/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ActionRef#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActionRef()
 * @model
 * @generated
 */
public interface ActionRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ActionDefinition)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getActionRef_Ref()
   * @model
   * @generated
   */
  ActionDefinition getRef();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ActionRef#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ActionDefinition value);

} // ActionRef
