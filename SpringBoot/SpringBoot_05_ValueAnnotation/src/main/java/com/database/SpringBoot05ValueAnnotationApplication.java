package com.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.database.sbean.Hotal;

@SpringBootApplication
public class SpringBoot05ValueAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBoot05ValueAnnotationApplication.class, args);
		Hotal hote1l= ctx.getBean("hotel",Hotal.class);
		System.out.println(hote1l);
		((ConfigurableApplicationContext) ctx).close();
	}

}
