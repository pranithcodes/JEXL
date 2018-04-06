package com.dvipa.learning.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class LogicalOperator {
	public static void main(String[] args) {
		JexlEngine jexl = new JexlBuilder().create();

		JexlContext context = new MapContext();

		context.set("X", Boolean.TRUE);
		context.set("Y", Boolean.FALSE);
		context.set("Z", 0);

		JexlExpression e = jexl.createExpression("Z = X && Y ");
		e.evaluate(context);
		System.out.println("Logical AND of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = X || Y ");
		e.evaluate(context);
		System.out.println("Logical OR of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = !X ");
		e.evaluate(context);
		System.out.println("Not of X::" + context.get("Z"));

		e = jexl.createExpression("Z = X & Y ");
		e.evaluate(context);
		System.out.println("Bitwise AND of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = X | Y ");
		e.evaluate(context);
		System.out.println("Bitwise OR of of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = X ^ Y ");
		e.evaluate(context);
		System.out.println("Bitwise XOR of of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = ~X ");
		e.evaluate(context);
		System.out.println("complement of X ::" + context.get("Z"));

	}
}
