package com.database;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.database.controller.PayRollContoller;
import com.database.modal.Employee;

@SpringBootApplication
public class SpringBoot04LayededAppDatabaseApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBoot04LayededAppDatabaseApplication.class, args);
	PayRollContoller contoller=ctx.getBean("payroll",PayRollContoller.class);
	try {
		List<Employee> list=contoller.showEmployee("CLERK", "MANAGER", "SALESMAN");
		list.forEach(Employee->{
			System.out.println(Employee);
		});
	} // 1st try
	catch (Exception e) {
		e.printStackTrace();
		System.err.println("Internal Problem  ..... "+e.getClass());
	}
	((ConfigurableApplicationContext) ctx).close();
		
	}

}
