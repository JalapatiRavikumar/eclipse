
public class minmum {

	    public static void main(String[] args)
	    {
	        int[] a = {2,5,3,7,3,9,4};
	        int min = a[0];
	        for(int i=0;i<a.length;i++)
	        {
	            if(min > a[i])
	            {
	                min = a[i];
	            }
	        }
	        System.out.println("the maximum number is:"+min);
	    }
	}

}
