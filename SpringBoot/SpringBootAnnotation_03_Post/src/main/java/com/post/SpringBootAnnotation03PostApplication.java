package com.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.post.Sbean.PostMan;

@SpringBootApplication

public class SpringBootAnnotation03PostApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(SpringBootAnnotation03PostApplication.class, args);
	PostMan postMan=ctx.getBean("postman",PostMan.class);
	postMan.redyDel("HYD","Gaya");
	
	
	}

}
