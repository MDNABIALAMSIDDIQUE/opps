package com.dg.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.jpa.Distrepo.IState;
import com.dg.jpa.modal.Dist;

@SpringBootApplication
public class Jpa02ProjectDistApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(Jpa02ProjectDistApplication.class, args);
	IState iState= context.getBean(IState.class);
	Dist dist = new Dist();
	dist.setStatename("Bihar");
	dist.setScode(05);
	dist.setDanem("Darbhanga");
	dist.setDcode(07);
	dist.setTotalDist(37);
	dist.setCMname("Nitish Kumar");
	
	Dist dist2 =iState.save(dist);
	System.out.println(dist);
	System.out.println(dist2);
	
	
	}

}
