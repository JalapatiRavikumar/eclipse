package Arrays;

public class freaquency_of_each_element {
	public static void main(String[] args) {
		
		
		int a[] = {10,20,30,40,50,50,10,20};
		boolean visited[] = new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(visited[i] == false)
			{
				int count = 1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						count++;
						visited[j] = true;
					}
				}
				visited[i] = true;
				System.out.println("this number :"+a[i] +"  will appears times:"+count);
			}
		}
	
	}
}
