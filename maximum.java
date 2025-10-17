import java.util*;

public class maximum 
{
	
	    public static void main(String[] args)
	    {
	        int[] a ={2,4,5,8,1,8,4};
	        int max = a[0];
	        for(int i=1;i<=a.length;i++);
	        {
	            if(max<a[i])
	            {
	                max=a[i];
	            }
	            
	        }
	          System.out.println("maximum elements are :"+max);
	    }
	}

}
