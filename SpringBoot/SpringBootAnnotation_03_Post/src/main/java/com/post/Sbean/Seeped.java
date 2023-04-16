package com.post.Sbean;

import org.springframework.stereotype.Component;

@Component("seeped")
public class Seeped implements IPostAllType {
	
	public Seeped() {
		System.out.println("=======================");
	System.out.println("SeepPost.SeepPost Const");
	}

	@Override
	public void PostBooked() {
		System.out.println("=======================");
		System.out.println("Ready to Dispatch");

	}

	@Override
	public void postReceived() {
		System.out.println("=======================");
		System.out.println("Redy to Delivered ");
		System.out.println("=======================");

	}

}
