package arrays;
import java.util.ArrayList;
public class LastIndexOf {
	
	  public static void main (String[]args)
	  {
	    // creating an String ArrayList
	    ArrayList < Integer > list = new ArrayList <> ();

	    // adding elements to the list
	    list.add (1);
	    list.add (4);
	    list.add (3);
	    list.add (4);
	    list.add (8);
	    list.add (4);
	    list.add (9);

	    // check the last index of 4
	    int result = list.lastIndexOf (4);

	      System.out.println ("Last index of 4 is " + result);

	    // check the last index of 7
	      result = list.lastIndexOf (7);

	      System.out.println ("Last index of 7 is " + result);
	  }
	}

}
