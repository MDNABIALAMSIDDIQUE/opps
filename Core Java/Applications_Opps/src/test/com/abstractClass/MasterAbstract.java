package test.com.abstractClass;

public class MasterAbstract {
	
	public static void main(String[] args) {
		
		DemoAbstractClass demoAbstractClass =new  TestDemo();
		demoAbstractClass.nomal();
		demoAbstractClass.abst1();
		demoAbstractClass.abst2();
		
		System.out.println("================================================");
		TestDemo testDemo = new TestDemo();
		testDemo.nomal();
		testDemo.abst1();
		testDemo.abst2();
		testDemo.normal2();
		
	}

}
