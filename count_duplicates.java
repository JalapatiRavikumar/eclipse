package Arrays;

public class count_duplicates {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,10,20,30,40};
		boolean isDuplicate[] = new boolean[a.length];
		int duplicateCount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(isDuplicate[i] == false)
			{
				int count = 1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i] == a[j])
					{
						count++;
						isDuplicate[j] = true;
					}
				}
				if(count>1)
				{
					System.out.println("duplicate elements "+a[i]);
					duplicateCount++;
				}
			}
		}
		System.out.println("total duplicate elements:"+duplicateCount);
		
	}

}
