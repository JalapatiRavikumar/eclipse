package Arrays;

public class second_smallest_number {
	public static void main(String[] args) {
		int a[] = {10,20,30,30,40,50,60};
		int max = Integer.MAX_VALUE;
		int secondmax = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] < max)
			{
				secondmax = max;
				max = a[i];
			}
			else if(a[i] < secondmax && a[i] != max)
			{
				secondmax =a[i];
			}
		}
		System.out.println("seocnd max:"+secondmax);
		System.out.println(max);
	}

}
