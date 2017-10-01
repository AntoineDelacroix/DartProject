package com.obeo.dsl.dart.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;

public class DartObjectCreationHandler extends AbstractHandler  {
	@Override
    public Object execute(ExecutionEvent event){
		System.out.println("Hello world");
        return null;
    }
}
