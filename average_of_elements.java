package Arrays;

public class average_of_elements {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,50};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum += a[i];
		}
		double average = (double) sum/a.length;
		System.out.println("Average of elements in the array: " + average +"___"+sum);
	}

}
