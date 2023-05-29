package tex.com;

public class MainTarget  extends TwoSumTarget{
		public static void main(String[] args) {
			int arr[]= {1,2,3,4,5,6,7,8,9,0};
			int target=15;
			int [] result= findTwoSum(arr, target);
			if (result.length == 2) {
				System.out.println("this Number Sum :"
			+arr[result[0]]+" "+arr[result[1]]);
				System.out.println("Target NUmbet =   "+target);
			} else {
					System.out.println("this Number Not Avl Added in Digit");
			}
		}
}
