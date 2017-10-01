package com.obeo.dart.view;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EObject;

import com.obeo.dart.controler.exceptions.NoLabelException;
import com.obeo.dart.model.DartModel;

public class DartView {
	private DartModel dartModel;

	public DartView(DartModel dartModel) {
		this.dartModel = dartModel;
	}

	public void displayDartObjectNumber() {
		int objectTotalNumber = dartModel.countEObjectNumber();
		System.out.println("Total number is " + objectTotalNumber);
	}

	public void displayAllDartObjectLabels() {
		// object collection
		List<EObject> eObjectList = new BasicEList<EObject>();
		for (EObject root : dartModel.rootObjects) {
			if (root != null) {
				eObjectList.add(root);
				eObjectList.addAll(dartModel.getAllChildren(root));
			}
		}

		// display
		System.out.println("Model labels : ");
		for (EObject child : eObjectList) {
			if (child != null) {
				String label = dartModel.getLabel(child);
				try {
					if (label == null || "".equals(label)) {
						throw new NoLabelException(child);
					} else {
						System.out.println("Object : " + child + " is labeled : " + label);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
