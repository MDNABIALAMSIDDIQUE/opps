package com.annotastion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.annotastion.sbeans.Vehicle;

@SpringBootApplication
public class SpringBootAnnotation02Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBootAnnotation02Application.class, args);
		Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
		vehicle.safar("HYD", "Patna");
		((ConfigurableApplicationContext) ctx).close();
	
	}

}
