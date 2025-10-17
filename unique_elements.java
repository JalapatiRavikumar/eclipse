package Arrays;

public class unique_elements {
	public static void main(String[] args) {
		int a[] = {10,20,30,10,20,30,80};
		boolean isVisited[] = new boolean[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			if(isVisited[i] == false)
			{
				int count = 1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						isVisited[j] = true;
						count++;
					}
				}
				if(count == 1)
				{
					System.out.println(a[i]);
				}
			}
			
			
		}
	}

}
