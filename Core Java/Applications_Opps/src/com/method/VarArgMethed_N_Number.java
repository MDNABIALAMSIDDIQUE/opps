package com.method;

public class VarArgMethed_N_Number {
		
	public void Add(int ...a) {
		System.out.println("Total of length..  "+a.length+" :"+a.getClass());
		
		int result=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			result=result+a[i];
		}
		System.out.println();
		System.out.println("Total Add   :  "+result );
		System.out.println("===================== = =  = =  = = ");
	}
}
