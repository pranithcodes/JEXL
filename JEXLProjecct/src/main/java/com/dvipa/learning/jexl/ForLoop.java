package com.dvipa.learning.jexl;

import java.util.ArrayList;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class ForLoop {

	public static void main(String[] args) throws ScriptException {

		ArrayList<String> data = new ArrayList<String>();
		data.add("FOR");
		data.add("LOOP");
		data.add("TO");
		data.add("ITERATE");

		String script = "for(item : list ){ out.println(item)}";

		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();

		Bindings bindings = new SimpleBindings();
		bindings.put("list", data);
		bindings.put("out", System.out);

		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);

		jexlScriptEngine.eval(script);

	}
}
