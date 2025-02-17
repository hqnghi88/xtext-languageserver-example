/**
 * generated by Xtext 2.31.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameter#getBuiltInFacetKey <em>Built In Facet Key</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameter#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.Parameter#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends Expression
{
  /**
   * Returns the value of the '<em><b>Built In Facet Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Built In Facet Key</em>' attribute.
   * @see #setBuiltInFacetKey(String)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter_BuiltInFacetKey()
   * @model
   * @generated
   */
  String getBuiltInFacetKey();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameter#getBuiltInFacetKey <em>Built In Facet Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Built In Facet Key</em>' attribute.
   * @see #getBuiltInFacetKey()
   * @generated
   */
  void setBuiltInFacetKey(String value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(VariableRef)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter_Left()
   * @model containment="true"
   * @generated
   */
  VariableRef getLeft();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameter#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VariableRef value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Expression)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getParameter_Right()
   * @model containment="true"
   * @generated
   */
  Expression getRight();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.Parameter#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Expression value);

} // Parameter
