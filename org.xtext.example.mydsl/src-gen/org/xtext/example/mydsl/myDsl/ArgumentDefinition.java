/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ArgumentDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.ArgumentDefinition#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArgumentDefinition()
 * @model
 * @generated
 */
public interface ArgumentDefinition extends VarDefinition
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArgumentDefinition_Type()
   * @model containment="true"
   * @generated
   */
  Expression getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ArgumentDefinition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Expression value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getArgumentDefinition_Default()
   * @model containment="true"
   * @generated
   */
  Expression getDefault();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.ArgumentDefinition#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(Expression value);

} // ArgumentDefinition
