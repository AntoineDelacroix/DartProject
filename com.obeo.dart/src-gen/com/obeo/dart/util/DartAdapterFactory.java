/**
 */
package com.obeo.dart.util;

import com.obeo.dart.AngularType;
import com.obeo.dart.Asset;
import com.obeo.dart.Classifier;
import com.obeo.dart.Component;
import com.obeo.dart.Constructor;
import com.obeo.dart.Container;
import com.obeo.dart.Controller;
import com.obeo.dart.DartPackage;
import com.obeo.dart.DartResource;
import com.obeo.dart.Decorator;
import com.obeo.dart.Export;
import com.obeo.dart.Folder;
import com.obeo.dart.Formatter;
import com.obeo.dart.Function;
import com.obeo.dart.HTML;
import com.obeo.dart.Import;
import com.obeo.dart.Library;
import com.obeo.dart.Metadata;
import com.obeo.dart.Module;
import com.obeo.dart.Parameter;
import com.obeo.dart.Part;
import com.obeo.dart.Project;
import com.obeo.dart.Route;
import com.obeo.dart.Stylesheet;
import com.obeo.dart.Type;
import com.obeo.dart.Typedef;
import com.obeo.dart.Variable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.obeo.dart.DartPackage
 * @generated
 */
public class DartAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DartPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DartAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = DartPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DartSwitch<Adapter> modelSwitch = new DartSwitch<Adapter>() {
		@Override
		public Adapter caseProject(Project object) {
			return createProjectAdapter();
		}

		@Override
		public Adapter caseAsset(Asset object) {
			return createAssetAdapter();
		}

		@Override
		public Adapter caseContainer(Container object) {
			return createContainerAdapter();
		}

		@Override
		public Adapter caseFolder(Folder object) {
			return createFolderAdapter();
		}

		@Override
		public Adapter casePackage(com.obeo.dart.Package object) {
			return createPackageAdapter();
		}

		@Override
		public Adapter caseDartResource(DartResource object) {
			return createDartResourceAdapter();
		}

		@Override
		public Adapter caseImport(Import object) {
			return createImportAdapter();
		}

		@Override
		public Adapter caseExport(Export object) {
			return createExportAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseLibrary(Library object) {
			return createLibraryAdapter();
		}

		@Override
		public Adapter casePart(Part object) {
			return createPartAdapter();
		}

		@Override
		public Adapter caseClassifier(Classifier object) {
			return createClassifierAdapter();
		}

		@Override
		public Adapter caseMetadata(Metadata object) {
			return createMetadataAdapter();
		}

		@Override
		public Adapter caseClass(com.obeo.dart.Class object) {
			return createClassAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseConstructor(Constructor object) {
			return createConstructorAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseTypedef(Typedef object) {
			return createTypedefAdapter();
		}

		@Override
		public Adapter caseHTML(HTML object) {
			return createHTMLAdapter();
		}

		@Override
		public Adapter caseStylesheet(Stylesheet object) {
			return createStylesheetAdapter();
		}

		@Override
		public Adapter caseModule(Module object) {
			return createModuleAdapter();
		}

		@Override
		public Adapter caseAngularType(AngularType object) {
			return createAngularTypeAdapter();
		}

		@Override
		public Adapter caseController(Controller object) {
			return createControllerAdapter();
		}

		@Override
		public Adapter caseComponent(Component object) {
			return createComponentAdapter();
		}

		@Override
		public Adapter caseDecorator(Decorator object) {
			return createDecoratorAdapter();
		}

		@Override
		public Adapter caseFormatter(Formatter object) {
			return createFormatterAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Project
	 * @generated
	 */
	public Adapter createProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Asset
	 * @generated
	 */
	public Adapter createAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Folder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Folder
	 * @generated
	 */
	public Adapter createFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Package
	 * @generated
	 */
	public Adapter createPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.DartResource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.DartResource
	 * @generated
	 */
	public Adapter createDartResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Import
	 * @generated
	 */
	public Adapter createImportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Export <em>Export</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Export
	 * @generated
	 */
	public Adapter createExportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Part <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Part
	 * @generated
	 */
	public Adapter createPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Classifier
	 * @generated
	 */
	public Adapter createClassifierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Metadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Metadata
	 * @generated
	 */
	public Adapter createMetadataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Class
	 * @generated
	 */
	public Adapter createClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Constructor
	 * @generated
	 */
	public Adapter createConstructorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Typedef <em>Typedef</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Typedef
	 * @generated
	 */
	public Adapter createTypedefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.HTML <em>HTML</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.HTML
	 * @generated
	 */
	public Adapter createHTMLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Stylesheet <em>Stylesheet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Stylesheet
	 * @generated
	 */
	public Adapter createStylesheetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Module <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Module
	 * @generated
	 */
	public Adapter createModuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.AngularType <em>Angular Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.AngularType
	 * @generated
	 */
	public Adapter createAngularTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Controller <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Controller
	 * @generated
	 */
	public Adapter createControllerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Component
	 * @generated
	 */
	public Adapter createComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Decorator <em>Decorator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Decorator
	 * @generated
	 */
	public Adapter createDecoratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Formatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Formatter
	 * @generated
	 */
	public Adapter createFormatterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.obeo.dart.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.obeo.dart.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //DartAdapterFactory
