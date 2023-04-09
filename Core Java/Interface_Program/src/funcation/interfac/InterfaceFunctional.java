package funcation.interfac;

@FunctionalInterface
public interface InterfaceFunctional {
	
	void m1();
	default void m2() {
		System.out.println("I am Default Method");
	}
	
	static void m3() {
		System.out.println(" I am Static Method...");
	}
}
