package com.ncu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("web.xml");
		Costumer cust=(Costumer)context.getBean("Costumer");
		System.out.println(cust.toString());

	}

}
