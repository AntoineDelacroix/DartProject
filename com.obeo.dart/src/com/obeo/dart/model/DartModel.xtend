/**
 * Copyright (c) 2017 Obeo.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Antoine DELACROIX
 */
package com.obeo.dart.model

import java.util.List
import org.eclipse.emf.common.notify.Adapter
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.IItemLabelProvider
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory

class DartModel {

	public EList<EObject> rootObjects;

	new(EList<EObject> rootObjects) {
		this.rootObjects = rootObjects
	}

	def int countEObjectNumber() {
		var int answer = 0
		for (EObject root : rootObjects) {
			answer = answer + root.eAllContents().size + 1
		}
		answer
	}

	def List<EObject> getAllChildren(EObject root) {
		root.eAllContents().toList
	}

	def String getLabel(EObject object) {
		if (!object.equals(null)) {
			var Adapter adapter = new ReflectiveItemProviderAdapterFactory().adapt(object, IItemLabelProvider)
			(adapter as IItemLabelProvider).getText(object)
		} else {
			"No label"
		}
	}
}
