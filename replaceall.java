package arrays;

public class replaceall {
	public static void main(String[] args){
        // Initializing an arraylist
        ArrayList arr1 = new ArrayList<>();

        // Adding elements to the arraylist
        arr1.add(1);
        arr1.add(2);
        arr1.add(3);
        System.out.println("ArrayList1 : " + arr1);
        
        // Initializing the second arraylist
        ArrayList arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        System.out.println("ArrayList2 : " + arr2);
        
        // add elements using addAll function
        arr1.addAll(arr2);
        System.out.println("After Adding ArrayList2 in ArrayList1, We get : " + arr1);
    }

}
