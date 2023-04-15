package com;

public class StringBulider {
public static void main(String[] args) {
	StringBuilder sb=new StringBuilder("Hello");
	sb.append("  NABI ALAM");
	System.out.println(sb);
	
	sb.replace(0,3,"Java");  
	System.out.println(sb);
	sb.reverse();
	System.out.println(sb);
	System.out.println(sb.capacity());

}
}
