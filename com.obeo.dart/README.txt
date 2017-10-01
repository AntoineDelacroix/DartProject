#DartProject, see : https://github.com/dartdesigner/Dart-Designer

0) L'installation de l'IDE a été effectué avec les composants logiciels suivants:

	- Java (8.0)
	- > https://www.java.com/fr/download/
	- Obeo designer (10.0)
	- > https://www.obeodesigner.com/en/download
	- Xtend (2.11.0)
	- > http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/

1) La classe principale est la suivante :
- com.obeo.dart.Launcher

2) Les deux fichiers importés sont :
- com.obeo.dart\model\dart.aird
- com.obeo.dart\model\example.dart

3) Le programme charge le modèle depuis la classe :
- com.obeo.dart.model.DartModelLoader.java avec la méthode load

4) Le nombre d'éléments du modèle s'affiche sur la sortie standard depuis la classe :
- com.obeo.dart.view.DartView.java avec la méthode displayDartObjectNumber

5) Le label de tous les éléments du modèle s'affiche sur la sortie standard  depuis la classe :
- com.obeo.dart.view.DartView.java avec la méthode displayAllDartObjectLabels
