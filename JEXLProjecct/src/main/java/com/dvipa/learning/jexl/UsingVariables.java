package com.dvipa.learning.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class UsingVariables {

	public static void main(String[] args) {

		JexlContext context = new MapContext();
		context.set("x", 1);
		context.set("y", 2);
		context.set("name", "Tony");
		context.set("firstName", "start");

		JexlEngine jexl = new JexlBuilder().create();

		JexlExpression e = jexl.createExpression("x = y ");
		e.evaluate(context);

		e = jexl.createExpression(" name =firstName ");
		e.evaluate(context);

		System.out.println("x\t::" + context.get("x"));
		System.out.println("y\t::" + context.get("y"));
		System.out.println("name\t::" + context.get("name"));
		System.out.println("name\t::" + context.get("firstName"));
	}
}
