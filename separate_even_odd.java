package Arrays;

public class separate_even_odd {
	public static void main(String[] args) {
	int a[] = {10,20,30,40,50,60,70,3,5,7};
	int evenCount = 0;
	int oddCount = 0;
	for(int i=0;i<a.length;i++)
	{
		if(a[i] % 2 ==0)
		{
			evenCount++;
		}
		else
		{
			oddCount++;
		}
	}
	
	int even[] = new int[evenCount];
	int odd[] = new int[oddCount];
	int evenIndex=0;
	int oddIndex = 0;
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i] % 2 == 0)
		{
			even[evenIndex] = a[i];
			evenIndex++;
		}
		else
		{
			odd[oddIndex] = a[i];
			oddIndex++;
		}
	}
	
	System.out.println("Even numbers in the array:");
	for(int i=0;i<even.length;i++)
	{
		System.out.print(even[i]+" ");
	}
	System.out.println();
	System.out.print("Odd numbers in the array:");
	for(int i=0;i<odd.length;i++)
	{
		System.out.println(odd[i]+" ");
	}
		System.out.println();
		
		// Print the count of even and odd numbers
	System.out.println(evenCount + " even numbers and " + oddCount + " odd numbers found in the array.");
	}
}
