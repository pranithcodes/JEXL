package com.dvipa.learning.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class ArthematicOperator {
	public static void main(String[] args) {
		JexlEngine jexl = new JexlBuilder().create();

		JexlContext context = new MapContext();

		context.set("X", 10);
		context.set("Y", 5);
		context.set("Z", 0);
		
		JexlExpression e = jexl.createExpression("Z = X + Y ");
		e.evaluate(context);
		System.out.println("Sum of X and Y ::" + context.get("Z"));

		e = jexl.createExpression("Z = X - Y ");
		e.evaluate(context);
		System.out.println("Substraction of X and Y ::" + context.get("Z"));
		
		e = jexl.createExpression("Z = X * Y ");
		e.evaluate(context);
		System.out.println("Multiplication of X and Y ::" + context.get("Z"));
		
		e = jexl.createExpression("Z = X / Y ");
		e.evaluate(context);
		System.out.println("Divide of X and Y ::" + context.get("Z"));
		
		e = jexl.createExpression("Z = X % Y ");
		e.evaluate(context);
		System.out.println("Reminder of X and Y ::" + context.get("Z"));
	}
}
