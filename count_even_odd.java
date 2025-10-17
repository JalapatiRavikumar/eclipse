package Arrays;

public class count_even_odd {
	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40, 50,7,8,9,10};
		int evenCount = 0;
		int oddCount = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] % 2 == 0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
		System.out.println("Count of even numbers in the array: " + evenCount);
		System.out.println("Count of odd numbers in the array: " + oddCount);
	}
	

}
