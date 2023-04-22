package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refConfig.xml");

		A tempA = (A) context.getBean("aref");
		B tempB = (B) context.getBean("bref");

		System.out.println(tempA.getOb());
		System.out.println(tempB.getY());
	}

}
