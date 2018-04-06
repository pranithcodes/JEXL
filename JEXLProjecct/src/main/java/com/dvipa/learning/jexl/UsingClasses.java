package com.dvipa.learning.jexl;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class UsingClasses {

	public static void main(String[] args) {
		JexlEngine jexl = new JexlBuilder().create();

		JexlContext context = new MapContext();

		Employee employee = new Employee("Falcon", 100000);

		context.set("employee", employee);
		context.set("out", System.out);

		JexlExpression e = jexl.createExpression("out.println(\" EMPLOYEE NAME ::\" + employee.name)");
		e.evaluate(context);

		e = jexl.createExpression("out.println(\" EMPLOYEE SALARY ::\" + employee.salary)");
		e.evaluate(context);

		e = jexl.createExpression("employee.name = \" Iron Man\"");
		e.evaluate(context);

		e = jexl.createExpression("out.println(\" EMPLOYEE NAME ::\" + employee.name)");
		e.evaluate(context);

		e = jexl.createExpression("out.println(\" Length of EMPLOYEE NAME ::\" + employee.getLengthOfName())");
		e.evaluate(context);

	}
}
