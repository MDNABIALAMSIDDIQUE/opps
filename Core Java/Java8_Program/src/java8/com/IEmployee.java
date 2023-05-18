package java8.com;

@FunctionalInterface
public interface IEmployee {
	
	public void m1 () ;
	
	default void m2() {
		System.out.println("I am Default Method .. 2");
	}
	
	default void m3() {
		System.out.println("I am Default Method ... 3 ");
	}
	
	default void m4() {
		System.out.println(" I am Default Method .. 4 ");
	}
	public static void m5() {
		System.out.println(" I am Static Method - 5 ");
	}
	
	public static void m6() {
		System.out.println(" I am  static Method - 6");
	}

}
