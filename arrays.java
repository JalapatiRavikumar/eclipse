package toString.java;

public class arrays {
	
	  public static void main (String[]args)
	  {
	    // creating an Integer ArrayList
	    ArrayList < String > list = new ArrayList <> ();

	    // adding elements in the list
	    list.add ("asd");
	    list.add ("qwe");
	    list.add ("qwed");
	    list.add ("qaz");
	    list.add ("wsdc");

	    // convert arraylist to string using toString() method

	    String result = list.toString ();

	    // printing the string
	      System.out.println ("The new string is : " + result);
	  }
	}

}
