package test.com;

public class A {
		void m1() {
			class B{
				void m2() {
					System.out.println("M2-B");
				}
				void m3() {
					System.out.println("m3-B");
				}
			}
			B b= new B();
			b.m2();
			b.m3();
		}	
}


