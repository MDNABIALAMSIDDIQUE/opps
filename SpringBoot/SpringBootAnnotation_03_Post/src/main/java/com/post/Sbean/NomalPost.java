package com.post.Sbean;

import org.springframework.stereotype.Component;

@Component("nomalpost")
public class NomalPost implements IPostAllType {
	public NomalPost() {
		System.out.println("=======================");
		System.out.println("NomalPost.NomalPost() Cons");
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
