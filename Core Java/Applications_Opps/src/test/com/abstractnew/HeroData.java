package test.com.abstractnew;

public class HeroData extends Hero{

	// abstract Method 1
	@Override
	void heroName() {
		System.out.println("Hero Name =============");
		System.err.println("King  Khan");
		System.out.println("Amir Khan");
		System.out.println("Salman Khan");
		
	}
  //  abstract Method 2
	@Override
	void heroAge() {
		
		System.out.println("Hero Age =============");
		System.out.println("45");
		System.out.println("55");
		System.out.println("56");
		
	}
	
	public void moblieNumber() {
		System.out.println("Hero Mooblie Number ==================");
		System.out.println("88888888");
		System.out.println("99999999");
		System.out.println("55665566");
	}

}
