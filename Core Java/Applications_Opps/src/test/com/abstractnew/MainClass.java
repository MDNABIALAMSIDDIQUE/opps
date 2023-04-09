package test.com.abstractnew;

public class MainClass {
	
public static void main(String[] args) {
	System.out.println("DisPlay All Data...");
	
	// Abstract class and Method
	System.out.println("Abstract class Data");
	Hero hero = new HeroData ();
	hero.movielist();
	hero.heroName();
	hero.heroAge();
	System.out.println("");
	
	
	HeroData heroData = new HeroData();
	heroData.movielist();
	heroData.heroName();
	heroData.heroAge();
	heroData.moblieNumber();
}
	
	
	


}
