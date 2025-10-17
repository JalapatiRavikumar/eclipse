package Arrays;

import java.util.Arrays;

public class copy_elements {
    public static void main(String[] args) {
//        int a[] = {10, 20, 30, 40, 50};
//        int b[] = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            b[i] = a[i];
//        }
//
//        // Print original and copied arrays
//        System.out.println("Original Array: " + Arrays.toString(a));
//        System.out.println("Copied Array:   " + Arrays.toString(b));
    	
    	
    	int a[]= {10,20,30,40,50,60};
        int b[] = new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i] = a[i];
        }
        
        // System.out.println("original array:"+Arrays.toString(a));
        // System.out.println("copileed elements:"+Arrays.toString(b));
        
        System.out.print("original Array:");
       for(int i=0;i<a.length;i++)
       {
    	   System.out.print(a[i]+" ");
       }
    	
       System.out.println("\n");
       
       System.out.print("copied array: ");
      for(int i=0;i<b.length;i++)
      {
    	  System.out.print(b[i]+" ");
      }
    	
    }
}


