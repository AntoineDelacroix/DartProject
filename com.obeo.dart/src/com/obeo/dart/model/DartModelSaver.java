package com.obeo.dart.model;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class DartModelSaver {

	private EList<EObject> eObjectList;

	public DartModelSaver(EList<EObject> eObjectList) {
		seteObjectList(eObjectList);
	}

	private EList<EObject> geteObjectList() {
		return eObjectList;
	}

	private void seteObjectList(EList<EObject> eObjectList) {
		this.eObjectList = eObjectList;
	}

	public void save(String path) throws IOException {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("dart", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createURI(path));
		resource.getContents().addAll(geteObjectList());
		resource.save(Collections.EMPTY_MAP);
	}
}
