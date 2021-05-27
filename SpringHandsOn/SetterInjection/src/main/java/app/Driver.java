package app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.app.EmployeeDOA;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDOA ee = (EmployeeDOA) ctx.getBean("employee");
		System.out.println(ee.getDbConfig().getUrl());
	}

}
