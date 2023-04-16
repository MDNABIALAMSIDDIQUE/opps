package com.post.Sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("postman")
public class PostMan {
	
	@Autowired
	@Qualifier("seeped")
	private IPostAllType allpost;
	
	public PostMan() {
		System.out.println("=======================");
		System.out.println("PostMan.PostMan()0 prm");
	}
	
	public void redyDel(String bookedplace, String deleverplace) {
		System.out.println("===========================");
		allpost.PostBooked();
		System.out.println("Booked Place  ::  "+bookedplace);
		System.out.println("Ready to sheepment");
		allpost.postReceived();
		System.out.println("=====================");
		System.out.println("Successfully  Delivered  ::   "+deleverplace);
	}

}
