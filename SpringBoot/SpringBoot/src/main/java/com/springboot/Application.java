package com.springboot;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.springboot.sbean.WishMessage;

@SpringBootApplication
public class Application {

    @Bean(name = "local")
    LocalDateTime ldt() {
		System.out.println("Local Date time Predifne Class");
		return LocalDateTime.now();
		
	}

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(Application.class, args);
		
		WishMessage genretor=ctx.getBean("wish",WishMessage.class);
		String result=genretor.showMessage();
		System.out.println(result+":   MD NABI ALAM");
		
		
		
				}

}
