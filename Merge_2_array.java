package Arrays;

public class Merge_2_array {
	public static void main(String[] args) {
		int[] arr1 = {10, 20, 30, 40, 50};
		int[] arr2 = {60, 70, 80, 90, 100};

		int[] mergedArray = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			mergedArray[i] = arr1[i];
		}

		for (int i = 0; i < arr2.length; i++) {
			mergedArray[arr1.length + i] = arr2[i];
		}
		System.out.println("Merged Array:");
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

}
