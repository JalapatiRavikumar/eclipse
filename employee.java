package arrays;
import java.util.*;

public class employee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] arr = new String[n];
		scanner.nextLine();
		for(int i = 0;i<=5;i++)
		{
			System.out.println("enter the names of the employees:"+(i+1));
			arr[i]=scanner.nextLine();
		}
		for(int i =0;i<=arr.length-1;i++)
		{
			System.out.println("the name of the employees are:"+(i+1)+"is:"+arr[i]);
		}
		
	}
}
		