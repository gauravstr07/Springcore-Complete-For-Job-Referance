package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelConfig.xml");

		Demo d1 = (Demo) context.getBean("demo", Demo.class);
		System.out.println(d1);

	}

}
