package com.dg.curd;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.dg.curd.IfrinedRepo.Ifrined;
import com.dg.curd.modal.Userinfo;

@SpringBootApplication
public class UserList {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(UserList.class, args);
	Ifrined ifrined= context.getBean(Ifrined.class);
	
	Userinfo friends= new Userinfo();
	friends.setName("Zohan ");
	friends.setWork("softWere Eng");
	friends.setCity("Gaya");
	friends.setMob(8899776622l);
	
	Userinfo friends2 = new Userinfo();
	friends2.setName("NABI ALAM");
	friends2.setWork("SoftWere Eng");
	friends2.setCity("Darbhanga");
	friends2.setMob(850799430l);
	
	Userinfo friends3 = new Userinfo();
	friends3.setName("Nehal Alam");
	friends3.setWork("MCE Eng");
	friends3.setCity("Pune");
	friends3.setMob(8899225566l);
	
	//  Save the Date in DateBase 
	/*
	List<Userinfo>  listFriend = List.of(friends, friends2, friends3);
	Iterable<Userinfo> resultFriend=ifrined.saveAll(listFriend);
	resultFriend.forEach(frienddata ->{
		System.out.println(frienddata);
	});
	 System.out.println("Successful Save ");
*/
	
	List<Userinfo> userinfo= ifrined.getAllUser();
	userinfo.forEach(userlistall->{
		System.out.println(userlistall);
	});
	
	System.out.println("==================Method ===================");
	List<Userinfo> listuser= ifrined.findByName("Zohan ");
	listuser.forEach(e->{
		System.out.println(e);
	});
	System.out.println("=================Name & City method =======================");
	List<Userinfo>listcity=ifrined.findByNameAndCity("NABI ALAM", "Darbhanga");
			listcity.forEach(e->{
				System.out.println(e);
			});	
			
			System.out.println("=========Where Condition=========");
			
			List<Userinfo> listwhere=ifrined.getFriendNamme("NABI ALAM");
			listwhere.forEach(p->{
				System.out.println(p);
			});
			
System.out.println("=========Where Condition  2 =========");
			
			List<Userinfo> listwhere1=ifrined.getFriendNamme2("NABI ALAM","Darbhanga");
			listwhere1.forEach(p2->{
				System.out.println(p2);
			});
			
			System.out.println("===== natvie Query =====");
			List<Userinfo> nuser=ifrined.getUserInfo();
			nuser.forEach(native1->{
				System.out.println(native1);
			});
	}

	
}
