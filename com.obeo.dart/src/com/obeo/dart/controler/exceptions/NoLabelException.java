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
package com.obeo.dart.controler.exceptions;

public class NoLabelException extends Exception {
	public NoLabelException(Object object) {
		super("No label for " + object);
	}
}
