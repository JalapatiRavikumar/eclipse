package Arrays;

public class count_positive_negative {
	public static void main(String[] args) {
		int a[]  = {10,20,-30,40,-50,7,8,-9,10};
		int positiveCount = 0;
		int negativeCount = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > 0)
			{
				positiveCount++;
			}
			else if(a[i] < 0)
			{
				negativeCount++;
			}
		}
		System.out.println("Count of positive numbers in the array: " + positiveCount);
		System.out.println("Count of negative numbers in the array: " + negativeCount);
	}

}
