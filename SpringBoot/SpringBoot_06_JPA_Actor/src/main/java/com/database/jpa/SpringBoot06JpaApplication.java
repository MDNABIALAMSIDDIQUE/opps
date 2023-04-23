package com.database.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.database.jpa.entity.ActorData;
import com.database.jpa.service.IActorMgtService;

@SpringBootApplication
public class SpringBoot06JpaApplication {

	public static void main(String[] args) {
	ApplicationContext ctxApplicationContext=	SpringApplication.run(SpringBoot06JpaApplication.class, args);
		IActorMgtService service = ctxApplicationContext.getBean("Actorservice",IActorMgtService.class);
		try {
			ActorData actorData = new ActorData();
			actorData.setAName("SRK");
			actorData.setCategory("Super Hero");
			actorData.setMobileNo(9977884455L);
			String resultString=service.registerActor(actorData);
			System.out.println(resultString);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
