package com.dg.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.jpa.modal.UserModal;
import com.dg.jpa.repo.IUserRepo;

@SpringBootApplication
public class BootJpa01Application {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(BootJpa01Application.class, args);
	IUserRepo iUserRepo= context.getBean(IUserRepo.class);
	UserModal userModal = new UserModal();
	userModal.setName("MD NABI ALAM");
	userModal.setCity("Darbhanga");
	userModal.setStatus("you are selected JD");
	
	UserModal userModal2 = iUserRepo.save(userModal);
	System.out.println(userModal2);
	
	}

}
