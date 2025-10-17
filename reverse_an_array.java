package Arrays;
import java.util.Collections;
public class reverse_an_array {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50};
		int start = 0;
		int end = a.length - 1;
		while(start < end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");
		}
	}

}



//import java.util.Arrays;
//import java.util.Collections;
//
//public class ReverseUsingSort {
//    public static void main(String[] args) {
//        Integer[] arr = {3, 1, 5, 2, 4};
//
//        // Sort in descending order (reversed)
//        Arrays.sort(arr, Collections.reverseOrder());
//
//        // Print the reversed array
//        System.out.println(Arrays.toString(arr));
//    }
//}

