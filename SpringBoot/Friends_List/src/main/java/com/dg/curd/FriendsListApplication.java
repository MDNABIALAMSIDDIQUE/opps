package com.dg.curd;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.curd.IfrinedRepo.Ifrined;
import com.dg.curd.modal.Friends_info;

@SpringBootApplication
public class FriendsListApplication {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(FriendsListApplication.class, args);
	Ifrined ifrined= context.getBean(Ifrined.class);
	
	Friends_info friends= new Friends_info();
	friends.setName("Zohan ");
	friends.setWork("softWere Eng");
	friends.setAddress("Gaya");
	friends.setMob(8899776622l);
	
	Friends_info friends2 = new Friends_info();
	friends2.setName("NABI ALAM");
	friends2.setWork("SoftWere Eng");
	friends2.setWork("Darbhanga");
	friends2.setMob(850799430l);
	
	Friends_info friends3 = new Friends_info();
	friends3.setName("Nehal Alam");
	friends3.setWork("MCE Eng");
	friends3.setAddress("Pune");
	friends3.setMob(8899225566l);
	
	//  Save the Date in DateBase 
	/*
	List<Friends_info>  listFriend = List.of(friends, friends2, friends3);
	Iterable<Friends_info> resultFriend=ifrined.saveAll(listFriend);
	resultFriend.forEach(frienddata ->{
		System.out.println(frienddata);
	});
	 System.out.println("Successful Save ");
*/
	// update by id
	/*
	Optional<Friends_info>	optional=ifrined.findById(53);
	Friends_info friendsupdate=optional.get();
	friendsupdate.setName("Zurda");
	Friends_info resInfo=ifrined.save(friendsupdate);
	System.out.println(resInfo);
	
	*/
	/*
	// Display the Date from DateBase
	Iterable<Friends_info> showFriend=ifrined.findAll();
	showFriend.forEach(friendsshow->{
		System.out.println(friendsshow);
	});
	
	*/
	/*
	// Delete by ID from DateBase
	ifrined.deleteById(103);
	System.out.println("Your friend Remove from Friend List :");
	*/
	
	//Custum Method
	
//		List<Friends_info>friendName=	ifrined.findByName("MD NABI");
//		friendName.forEach(e->{
//			System.out.println(e);
//			System.out.println("================================================");
//		});
//		
		List<Friends_info> friens=ifrined.findByName("NABI ALAM");
		friens.forEach(fri->
			System.out.println(fri)
		);
		System.out.println("==============================");
			}

	
}
