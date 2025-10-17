package Arrays;

public class removing_duplicates {
	public static void main(String[] args) {
		int a[] = {10,20,30,40,10,20,30,40};
	
		
		for(int i=0;i<a.length;i++)
		{
			boolean isDuplicate = false;
			for(int j=0;j<i;j++)
			{
				if(a[i] == a[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate)
			{
				System.out.println(a[i]);
			}
		}
	}

}


//int a[] = {10,20,30,10,20,30};
//boolean isDuplicate[] = new boolean[a.length];
//
//for(int i=0;i<a.length;i++)
//{
//	if(isDuplicate[i] == false)
//	{
//		int count = 1;
//		for(int j=i+1;j<a.length;j++)
//		{
//			if(a[i] == a[j])
//			{
//				isDuplicate[j] = true;
//				count++;
//			}
//		}
//		if(count > 1)
//		{
//			System.out.println(a[i]);
//		}
//	}
//	
//}
