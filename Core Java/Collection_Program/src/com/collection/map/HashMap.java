package com.collection.map;

public class HashMap {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		System.out.println("HashMap.main()");
		
		@SuppressWarnings("rawtypes")
		java.util.HashMap hashMap= new java.util.HashMap();
		
		hashMap.put(1, "NABIALAM");
		hashMap.put("A", "fatima");
		hashMap.put(null, "Zohan");
		hashMap.put(3, null);
		hashMap.put(32, null);
		hashMap.put(35, null);
		hashMap.put(55, null);
	
		
		System.out.println(hashMap);
		System.out.println(hashMap.size());
		System.out.println(hashMap);
		System.out.println(hashMap.get(null));
		System.out.println(hashMap.remove(1));
		System.out.println(hashMap);
		System.out.println(hashMap.put("B", "MD NABI ALAM"));
		System.out.println(hashMap);
		System.out.println(hashMap.keySet());
		
	}

}
