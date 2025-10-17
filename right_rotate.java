package Arrays;

public class right_rotate {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int n = a.length;  // Get array length (n = 5)
		
		//store last element
		int last = a[n-1];
		
		//shift all element rotate by 1
		for(int i=n-1;i>0;i--)
		{
			a[i] = a[i-1]; //Shift each element to the right
		}
		a[0] = last;
		
		System.out.print("Roght rotated array by 1: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
