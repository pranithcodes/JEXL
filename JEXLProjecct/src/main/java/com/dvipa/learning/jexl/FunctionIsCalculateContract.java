package com.dvipa.learning.jexl;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.apache.commons.jexl3.scripting.JexlScriptEngine;

public class FunctionIsCalculateContract {

	public static void main(String[] args) throws ScriptException {

//		String script = "var isDivisibleBySix "+
//					"= function(number)"+ 
//					"{ "+
//					"	if(number%6 == 0 ){"+
//					"		out.println( number + \" is divided by 6\") "+
//					"	}else{"+
//					"		out.println( number + \" is not divided by 6\")"+
//					"	}"+
//
//					" return \"TRUE\"};"+
//					" out.println(isDivisibleBySix(30)); "+
//					" isDivisibleBySix(26);";
		
		String script = "var contractCheck "+
				"= function(number, roundOffSize)"+ 
				"{"+
				" var versionNumber='';	"+
				"if(number.toLowerCase().contains('v')){"+ 
				"versionNumber = number.substring(1, number.length());"+
				"}else{ versionNumber = number.substring(0, number.length()); }" + 
				 "versionNumber = versionNumber.replace('.',''); out.println( versionNumber); " + 
				 "if(versionNumber.length() > roundOffSize){versionNumber = versionNumber.substring(0, roundOffSize);} else { for(var x: 1 .. roundOffSize){ versionNumber = versionNumber+'0'; out.println(\" Loop:\" + versionNumber ); } } "+
				 "return versionNumber"+
				"};"+
				" var version = Integer.parseInt(contractCheck('V1.2', 7));"+
				" var version2 = Integer.parseInt(contractCheck('V1.3', 7));"
				+ "out.println(\"Pranith \" + version  + \"   \" +  version2);" 
				+ "out.println('versionCheck' +  (version  < version2) );" +
				 "out.println( 'versionCheck' +  (version  > version2));" +
//				 "out.println(contractCheck('1.3')); "+
//				 "out.println(contractCheck('v1.56')); "+
				" ";

		
		
		JexlScriptEngine jexlScriptEngine = new JexlScriptEngine();

		Bindings bindings = new SimpleBindings();
		bindings.put("out", System.out);
		bindings.put("Integer", Integer.class);

		jexlScriptEngine.setBindings(bindings, ScriptContext.ENGINE_SCOPE);

		jexlScriptEngine.eval(script);

	}
}
