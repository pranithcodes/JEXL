package com.dvipa.learning.jexl;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class UsingMap {

	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();

		JexlContext context = new MapContext();

		context.set("map", hashMap);

		JexlEngine jexl = new JexlBuilder().create();

		JexlExpression e = jexl.createExpression("map.put(\"name\",\"JEXL TUTORIAL\")");
		e.evaluate(context);

		System.out.println("The value that is evaluated by jexl::\t" + hashMap.get("name"));

	}
}
