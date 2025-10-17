//package arrays;
//
//public class findduplicates {
	
//	//brute force method
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		int[] a= {3,5,4,3,2,2,1};
//		System.out.print("suplicate value are:");
//		for(int i=0 ;i<a.length-1;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j] && (i!=j))
//						{
//							System.out.print(a[j]+",");
//						}
//			}
//		}
//
//	}
//
//}


//
//ny using set interface

//package arrays;
//import java.util.Set;
//import java.util.HashSet;
//
//public class findduplicates {
//  
//public static void main(String[] args) {
//	int[] arr={3, 5, 4, 3, 2, 2, 1};
//	System.out.print("duplicate elements are: "); 
//	Set<Integer> s=new HashSet<>();
//		for(int no:arr)
//			{
//				if(s.add(no)== false)
//					{
//						System.out.print(no+" ");
//					}
//			}
//	}
//}



package arrays;
import java.util.Set;
import java.util.HashSet;

public class findduplicates {
  
public static void main(String[] args) {
	int[] arr={3, 5, 4, 3, 2, 2, 1};
	System.out.print("duplicate elements are: "); 
	Set<Integer> s=new HashSet<>();
		for(int no:arr)
			{
				boolean b=s.add(no);
				if(b==false)
					{
						System.out.print(no+" ");
					}
			}
	}
}



//by using hash table