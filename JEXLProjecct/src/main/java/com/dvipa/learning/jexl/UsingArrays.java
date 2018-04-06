package com.dvipa.learning.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class UsingArrays {

	public static void main(String[] args) {

		Object[] data = { "JEXL", 123, 87878l, "UsingArrays", "data" };

		JexlContext context = new MapContext();

		context.set("array", data);
		context.set("out", System.out);

		JexlEngine jexl = new JexlBuilder().create();

		JexlExpression e = jexl.createExpression("out.println(\"3rd Element of array::\t \" + array[3])");
		e.evaluate(context);
	}
}
