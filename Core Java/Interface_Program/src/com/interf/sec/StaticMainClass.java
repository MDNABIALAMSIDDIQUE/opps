package com.interf.sec;

public class StaticMainClass  implements SecoundInterface{
	public static void main(String[] args) {
		SecoundInterface.m1();
		System.out.println("Main Class ");
	}
}
