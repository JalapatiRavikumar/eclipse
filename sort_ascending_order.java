package Arrays;
import java.util.Arrays;
public class sort_ascending_order {

	public static void main(String[] args) {
		int a[] = {50, 20, 10, 40, 30};
		Arrays.sort(a); 
		System.out.println("Array sorted in ascending order: "+Arrays.toString(a));
	}
}


//public static void main(String[] args) {
//	int a[] = {50, 20, 10, 40, 30};
//	for(int i=0;i<a.length;i++)
//	{
//		for(int j=0;j<a.length-1-i;j++)
//		{
//			if(a[j] > a[j+1])
//			{
//				int temp = a[j];
//				a[j] = a[j+1];
//				a[j+1] = temp;
//			}
//		}
//	}
//	
//	for(int i=0;i<a.length;i++)
//	{
//		System.out.print(a[i] + " ");
//	}
//}}