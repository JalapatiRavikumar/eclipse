package arrays;
import java.util.*;
public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner scan = new Scanner(System.in);
	        int n = 0;
	        System.out.println("enter the values");
	       int a[] = new int[n];
	       int b[] = new int[n+1];
	       System.out.println("enter the values");
	        for(int i1=0;i1<n;i1++)
	        {
	            a[i1]=scan.nextInt();
	        }
	        System.out.println("enter the elements in the array");
	        int m = scan.nextInt();
	        System.out.println("enter the index values in array");
	        int p = scan.nextInt();
	        for(int i=0;i<=n+1;i++)
	        {
	            if(i<m)
	            {
	                b[i]=a[i];
	            }
	            else if(i==m)
	            {
	                b[i]=p;
	            }
	            else
	            {
	                b[i]=a[i];
	            }
	        }
	        System.out.println("enter the values");
	        for(int i1=0;i1<=n;i1++)
	        {
	            System.out.println(b[i1]);
	        
	    }

	}

}
