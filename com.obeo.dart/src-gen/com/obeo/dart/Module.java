/**
 */
package com.obeo.dart;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.obeo.dart.Module#getTypes <em>Types</em>}</li>
 *   <li>{@link com.obeo.dart.Module#getRoutes <em>Routes</em>}</li>
 * </ul>
 *
 * @see com.obeo.dart.DartPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends Part {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' reference list.
	 * The list contents are of type {@link com.obeo.dart.AngularType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' reference list.
	 * @see com.obeo.dart.DartPackage#getModule_Types()
	 * @model
	 * @generated
	 */
	EList<AngularType> getTypes();

	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link com.obeo.dart.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see com.obeo.dart.DartPackage#getModule_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

} // Module
