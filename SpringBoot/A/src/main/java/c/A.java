package c;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		String s="java is great.python is also great";
		String a[]=s.split("[\\s\\.]+");// 1 ye space aur . dono ko spilit kr dega; 
	                                                //	like  [java, is, great, python, is, also, great]
		                                           // us k baad array me se unique word ko print krdena haiZ
		for(String st1:a) {
			int c=0;
			for(String st2:a) {
				if(st1.equals(st2)) {
					c++;
				}
						}
			if(c==1) {
				System.out.println(st1);
			}

		}

	}

}
