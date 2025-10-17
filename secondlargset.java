package arrays;

public class secondlargset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {600,80,2,4,5,6,8,9};
		int largest = Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		if(second_largest==Integer.MIN_VALUE)
		{
			System.out.println("there is no second largest element in the list");
		}
		else
		{
			System.out.println("second largest value is: "+second_largest);
			
		}

	}

}



class program{

public static void main(String[] args)
{
		int[] a={2,4,6,8,9,3};
		
		int temp;
		for(int i=0;i<=a.length;i++)
		{
				for(int j=i+1;j<=a.length; j++)

				{

						if(a[i]<a[j])
						{

							temp=a[i];
							a[i]=a[j];
							a[j]=temp;
						}

				}
		}
		System.out.println("the second largest number is: "+a[1]);
	}
}
