package inter.com;

import java.util.Arrays;

public class OddNumberJAva8 {
		public static void main(String[] args) {
			
			int [] number= {2,5,3,5,2,1,0,55,99};
			Arrays.stream(number).filter(n->n%2!=0).forEach(System.out::println);
		}
}
