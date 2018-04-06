package com.dvipa.learning.jexl;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class ConditionOperators {

	public static void main(String[] args) throws ScriptException {
		
		String script = "if ((X * 2) > 5) { Y = 1; } else { Y = 2; }";

		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();
		
		Bindings bindings = new SimpleBindings();
		bindings.put("X", 2);
		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);
		
		jexlScriptEngine.eval(script);
		
		System.out.println("The value of Y ::" + jexlScriptEngine.get("Y"));

	}
}

//