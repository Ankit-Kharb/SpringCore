package com.spring.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/spring/app/config.xml");
		
		MemberShip obj = (MemberShip) ctx.getBean("member");
		
		System.out.println(obj);

	}

}
