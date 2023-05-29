package tex.com;


/*
 * 
    int arr = {​​1,2,3,4,5,6,7}​​ , target = 11 
​
    output = {​​4,5}​​

 */
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[0]; // Return an empty array if no solution found
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 12;
        
        int[] result = findTwoSum(arr, target);
        
        if (result.length == 2) {
            System.out.println("Output: {" + arr[result[0]] + ", " + arr[result[1]] + "}");
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }
}
