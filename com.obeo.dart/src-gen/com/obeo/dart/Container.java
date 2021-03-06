/**
 */
package com.obeo.dart;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.obeo.dart.Container#getAssets <em>Assets</em>}</li>
 * </ul>
 *
 * @see com.obeo.dart.DartPackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Assets</b></em>' containment reference list.
	 * The list contents are of type {@link com.obeo.dart.Asset}.
	 * It is bidirectional and its opposite is '{@link com.obeo.dart.Asset#getContainer <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assets</em>' containment reference list.
	 * @see com.obeo.dart.DartPackage#getContainer_Assets()
	 * @see com.obeo.dart.Asset#getContainer
	 * @model opposite="container" containment="true"
	 * @generated
	 */
	EList<Asset> getAssets();

} // Container
