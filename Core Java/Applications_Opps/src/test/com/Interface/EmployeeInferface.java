package test.com.Interface;

public class EmployeeInferface implements FirstInterface {

	@Override
	public void intercare1() {
		System.out.println("First Interfce Method");
		
	}

	@Override
	public void interface2() {
		System.out.println("2nd Inteface Method");
		
	}

	@Override
	public void interface3() {
		System.out.println("3rd Interface Method..");
		
	}
	
	@SuppressWarnings("unused")
	public void m1() {
		System.out.println("Class Method..");
	}

}
