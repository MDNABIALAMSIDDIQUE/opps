package inter.com;
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = {4, 2, 6, 9, 1, 6};
     
        // Reverse the array
        for(int i=0; i<arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        
        System.out.println("Reversed array: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
