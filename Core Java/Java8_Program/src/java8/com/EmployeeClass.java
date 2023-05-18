package java8.com;

public class EmployeeClass  implements IEmployee{
	public static void main(String[] args) {
		System.out.println(" I  am Main Method ");
		EmployeeClass employeeClass = new EmployeeClass();
		employeeClass.m1();
		employeeClass.m2();
		employeeClass.m3();
		employeeClass.m4();
		IEmployee.m5();
		IEmployee.m6();
		
	}

	@Override
	public void m1() {
		System.out.println(" I am Abtr Method ..");
		
		
	}

}
