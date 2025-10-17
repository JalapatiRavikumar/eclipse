package Arrays;

public class febnocci {
	
	public static void main(String[] args) {
		int a = 10;
		int fib[] = new int[a];
		
		fib[0] = 0;
		fib[1] = 1;
		
		for(int i=2;i<a;i++)
		{
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for(int i=0;i<a;i++)
		{
			System.out.println(fib[i]);
		}
	}

}
