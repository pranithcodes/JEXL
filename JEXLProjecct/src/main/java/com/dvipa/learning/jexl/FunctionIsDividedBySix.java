package com.dvipa.learning.jexl;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class FunctionIsDividedBySix {

	public static void main(String[] args) throws ScriptException {

		String script = "var isDivisibleBySix "+
					"= function(number)"+ 
					"{ "+
					""+
					"/* "+
					"MULTI LINE COMMMENTS"+
					"*/"+
					"	if(number%6 == 0 ){"+
					"		out.println( number + \" is divided by 6\")"+
					"	}else{"+
					"		out.println( number + \" is not divided by 6\")"+
					"	}"+
					""+
					"## single Line commnets "+	
					"	"+
					" };"+
					" isDivisibleBySix(30); "+
					" isDivisibleBySix(26);";

		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();

		Bindings bindings = new SimpleBindings();
		bindings.put("out", System.out);

		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);

		jexlScriptEngine.eval(script);

	}
}
