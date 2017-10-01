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

import java.io.FileNotFoundException;
import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import com.obeo.dart.model.DartModelLoader;
import com.obeo.dart.model.DartModelSaver;

/**
 * Main class
 * 
 * @author Antoine DELACROIX
 *
 */
public class Launcher {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Launcher started.");

		try {
			EList<EObject> roots = new DartModelLoader().load("model/example.dart");
			DartModelApplication dartModelApplication = new DartModelApplication(roots);
			dartModelApplication.displayDartObjectNumber();
			dartModelApplication.displayDartObjectLabels();
//			dartModelApplication.createNewEObject();
			new DartModelSaver(roots).save("model/ExampleSaved.dart");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Launcher ended.");
		}
	}
}
