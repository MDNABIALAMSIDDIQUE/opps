package funcation.interfac;

public class MainClassFun implements InterfaceFunctional{

	@Override
	public void m1() {
		System.out.println("I am Abstract Method.. with M1 Method");
		
	}
	public static void main(String[] args) {
		
		InterfaceFunctional interfaceFunctional= new MainClassFun();
		interfaceFunctional.m1();
		interfaceFunctional.m2();
		InterfaceFunctional.m3();
	}

}
