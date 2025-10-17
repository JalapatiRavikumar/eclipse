package Arrays;

public class left_rotate_array_one {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int first = a[0];
		
		for(int i=0;i<a.length-1;i++)
		{
			a[i] = a[i+1];	
		}
		a[a.length-1] = first;
		
		System.out.print("the left rotated by array 1: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
	

}