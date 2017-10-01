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

package com.obeo.dart;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.obeo.dart.model.DartModel;
import com.obeo.dart.model.DartModelEObjectCreator;
import com.obeo.dart.view.DartView;

public class DartModelApplication {
	private DartModel dartModel;

	private DartView dartView;

	private DartModel getDartModel() {
		return dartModel;
	}

	private void setDartModel(DartModel dartModel) {
		this.dartModel = dartModel;
	}

	private DartView getDartView() {
		return dartView;
	}

	private void setDartView(DartView dartView) {
		this.dartView = dartView;
	}

	public DartModelApplication(EList<EObject> dartRoots) {
		dartModel = new DartModel(dartRoots);
		dartView = new DartView(dartModel);
	}

	public void createNewEObject() {
		new DartModelEObjectCreator(dartModel).addNewEObject();
	}

	public void displayDartObjectLabels() {
		getDartView().displayAllDartObjectLabels();
	}

	public void displayDartObjectNumber() {
		getDartView().displayDartObjectNumber();
	}

}
