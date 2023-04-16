package com.post.Sbean;

import org.springframework.stereotype.Component;

@Component("parsal")
public class Parsal implements IPostAllType {
	
	public Parsal() {
		System.out.println("=======================");
	}
	
	@Override
	public void PostBooked() {
		System.out.println("=======================");
		System.out.println("SeepPost.SeepPost Const");

	}

	@Override
	public void postReceived() {
		System.out.println("=======================");
		System.out.println("Redy to Delivered ");
		System.out.println("=======================");
	}

}
