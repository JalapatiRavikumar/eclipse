package Arrays;
public class second_largest_number {
	public static void main(String[] args) {
//		int a[] = {10,20,30,40,50,60};
//		Arrays.sort(a);
//		System.out.println("second largest:"+a[a.length-2]);
//		int a[] = {10,20,30,40,50,60};
	
	
		 int a[] = {10,20,30,40,50,60};
		 int min = Integer.MIN_VALUE;
		 int secondmin = Integer.MIN_VALUE;
		 
		 for(int i=0;i<a.length;i++)
		 {
			 if(a[i] > min)
			 {
				 secondmin = min;
				 min = a[i];
			 }
			 else if(a[i] > secondmin && a[i] != min)
			 {
				 secondmin = a[i];
			 }
		 }
		 System.out.println(secondmin);
	}

}
