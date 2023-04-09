package test.com.Interface;

public class MainClass {
	public static void main(String[] args) {
		FirstInterface  firstInterface = new EmployeeInferface();
		firstInterface.intercare1();
		firstInterface.interface2();
		firstInterface.interface3();
		
		
		EmployeeInferface employeeInferface = new EmployeeInferface();
		employeeInferface.intercare1();
		employeeInferface.interface2();
		employeeInferface.interface3();
		employeeInferface.m1();
	}
}
