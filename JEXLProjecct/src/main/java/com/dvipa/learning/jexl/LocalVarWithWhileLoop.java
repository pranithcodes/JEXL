package com.dvipa.learning.jexl;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class LocalVarWithWhileLoop {

	public static void main(String[] args) throws ScriptException {

		String script = "var string = \" number  \";var i = 0; while(i < 10 ){ i = i+1; out.println(string + i)}";

		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();

		Bindings bindings = new SimpleBindings();
		bindings.put("out", System.out);

		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);

		jexlScriptEngine.eval(script);

	}
}
