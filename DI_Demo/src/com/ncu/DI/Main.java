package com.ncu.DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
		Coach bascketCoach = (Coach)context.getBean("bascketCoach");
		System.out.println(bascketCoach.getDaily());
	}

}
