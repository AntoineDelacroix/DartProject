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
package com.obeo.dart.model;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import com.obeo.dart.DartPackage;

/**
 * Dart model importer
 * 
 * @author Antoine DELACROIX
 *
 */
public class DartModelLoader {

	/**
	 * Import Dart model from com.obeo.dart/model/example.dart file.
	 * 
	 * @return EObject root element
	 * @throws Exception
	 */
	public EList<EObject> load(String path) throws FileNotFoundException, IOException {
		EList<EObject> answer = null;

		DartPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> map = reg.getExtensionToFactoryMap();
		map.put("dart", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.getResource(URI.createURI(path), true);
		answer = resource.getContents();

		return answer;
	}
}
