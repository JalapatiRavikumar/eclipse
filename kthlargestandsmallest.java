package arrays;

public class kthlargestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,3,2,4,3,5,7,68,9};
		int k=2;
		for(int i =0;i<a.length-1;i++) {
			for(int j =i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+":largest element is "+a[i]);
			}
		}
		System.out.println("--------------");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}

	}
	
}
