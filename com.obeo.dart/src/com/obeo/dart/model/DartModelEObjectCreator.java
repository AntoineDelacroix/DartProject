package com.obeo.dart.model;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.obeo.dart.DartFactory;
import com.obeo.dart.DartPackage;
import com.obeo.dart.Typedef;

public class DartModelEObjectCreator {

	private static final String SAMPLE_TYPE_CLASS_NAME = "Type";
	private static final String DART_TYPE_CLASS_NAME = "Typedef";
	private DartModel dartModel;

	public DartModelEObjectCreator(DartModel dartModel) {
		this.dartModel = dartModel;
		WorkspaceModifyOperation op = new WorkspaceModifyOperation() {
			protected void execute(IProgressMonitor monitor) throws CoreException {
				DartPackage.eINSTANCE.eClass();
				Typedef newPackage = DartFactory.eINSTANCE.createTypedef();
				newPackage.setName("NewTypeDef");

				EPackage root = (EPackage) dartModel.rootObjects.get(0);
				// root.getEClassifiers().add((EClassifier) newPackage);

				EReference newEReference = EcoreFactory.eINSTANCE.createEReference();
				newEReference.setUpperBound(-1);
				newEReference.setLowerBound(0);
				newEReference.setContainment(true);
				newEReference.setContainment(true);
				newEReference.setName("Dart reference");
				EClassifier targetEClassifier = getTypeClass(root, SAMPLE_TYPE_CLASS_NAME);
				EClassifier dartEClassifier = getTypeClass(DartPackage.eINSTANCE, DART_TYPE_CLASS_NAME);
				newEReference.setEType(dartEClassifier);
				targetEClassifier.eCrossReferences().add(newEReference);
			}
		};

		try {
			op.run(null);
		} catch (InvocationTargetException ex) {
			ex.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void addNewEObject() {

		// targetEClassifier.eContainmentFeature()
		// Object answer =
		// root.eGet(EcoreFactory.eINSTANCE.getEPackage().eContainingFeature());
		// System.out.println("Answer = "+answer);
	}

	public EClassifier getTypeClass(EPackage inPackage, String name) {
		EClassifier typeClassifier = null;
		if (name != null) {
			for (int i = 0; i < inPackage.getEClassifiers().size() && typeClassifier == null; i++) {
				EClassifier classifier = inPackage.getEClassifiers().get(i);
				if (name.equals(classifier.getName())) {
					typeClassifier = classifier;
				}
			}
		}
		return typeClassifier;
	}
}
