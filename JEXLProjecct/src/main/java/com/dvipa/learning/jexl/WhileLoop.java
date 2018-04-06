package com.dvipa.learning.jexl;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class WhileLoop {

	public static void main(String[] args) throws ScriptException {

		String script = "while(i < 10 ){ i = i+1; out.println(i)}";

		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();

		Bindings bindings = new SimpleBindings();
		bindings.put("i", 0);
		bindings.put("out", System.out);

		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);

		jexlScriptEngine.eval(script);

	}
}
