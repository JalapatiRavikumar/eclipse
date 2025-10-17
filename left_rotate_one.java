package Arrays;

public class left_rotate_one {
	public static void main(String[] args) {
		int a[] = {10,20,30,50,60,70};
		int last = a[a.length-1];
		
		for(int i=a.length-1;i>0;i--)
		{
			a[i] = a[i-1];
		}
		a[0] = last;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
