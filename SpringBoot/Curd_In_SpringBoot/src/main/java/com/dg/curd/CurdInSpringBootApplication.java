package com.dg.curd;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.curd.IMobCurdRepo.IMobRepoCurd;
import com.dg.curd.modal.Moblie_Info;

@SpringBootApplication
public class CurdInSpringBootApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(CurdInSpringBootApplication.class, args);
	IMobRepoCurd iMobRepoCurd=context.getBean(IMobRepoCurd.class);
	
	
	/*
	 *  Date Save Code
	 */
	/*
	Moblie_Info moblie= new Moblie_Info();
	moblie.setCname("Zohan");
	moblie.setBrand("Vivo");
	moblie.setModal("V");
	moblie.setAmount(13000.70f);
	
	Moblie_Info moblie2= new Moblie_Info();
	moblie2.setCname("MD NABI ");
	moblie2.setBrand("Apple");
	moblie2.setModal("14 P");
	moblie2.setAmount(9500.89f);
	
	
	   List<Moblie_Info> moblie_Infos =List.of(moblie,moblie2);
	  Iterable<Moblie_Info> resultIterable = iMobRepoCurd.saveAll(moblie_Infos);
	  
	  resultIterable.forEach(mobliedata -> {
		  System.out.println(mobliedata);
	  });
	
	  System.out.println("Successful Save ");
	  */
	  
	/*
	 * Update Code find by Id
	 */
	/*
	Optional<Moblie_Info> optional2 = iMobRepoCurd.findById(1);
	Moblie_Info  moblie=optional2.get();
	moblie.setCname("Zohan Siddique");
	Moblie_Info resultInfo=iMobRepoCurd.save(moblie);
	System.out.println(resultInfo);
	
	*/
	
	/*
	 * 1st Style
	 */
	/*
	Iterable<Moblie_Info>showMobIterable=iMobRepoCurd.findAll();
	
	showMobIterable.forEach(new Consumer<Moblie_Info>() {

		@Override
		public void accept(Moblie_Info t) {
			// TODO Auto-generated method stub
			System.out.println(t);
		}
	});
	*/
	// 2nd Style
	Iterable<Moblie_Info>showMobIterable=iMobRepoCurd.findAll();
	showMobIterable.forEach(moblie ->{
		System.out.println(moblie);
	});
	
	
	// Deleting the User Element by Id
	iMobRepoCurd.deleteById(53);
	System.out.println("Successful left Date");
	
	}
		
	
}
