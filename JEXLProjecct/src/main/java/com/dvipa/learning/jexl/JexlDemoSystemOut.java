package com.dvipa.learning.jexl;


import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class JexlDemoSystemOut {

	public static void main(String[] args) {
		JexlEngine jexl = new JexlBuilder().create();

		JexlContext context = new MapContext();

		context.set("out", System.out);

		JexlExpression e = jexl
				.createExpression("out.println(\"Printing Message\")");
		e.evaluate(context);

	}
}

