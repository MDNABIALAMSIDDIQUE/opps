package test.com.abstractClass;

public class TestDemo  extends DemoAbstractClass{
	//abstract Method
	@Override
	void abst1() {
		System.out.println("I am Abst1 1st Method");
		
	}
	//abstract Method
	@Override
	void abst2() {
		System.out.println("I am Abst2 2nd Method");
		
	}
	//Normal Method
	public void normal2() {
		System.out.println("I am Normal 2nd..");
	}

}
