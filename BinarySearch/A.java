/* Check for the presence of a number in an array
 * The array can contain up to 1 million items
 * The array is never null
 * Return true if the method is in the array. Return false if the element is not in the array.
 */


import java.util.Arrays;

public class A {

	static boolean exist(int[] ints , int k) {
		//Check if the array is null
		if (ints.length == 0) {
			return false;
		}
		//Use binary search for 1,000,000 of Items			
		Arrays.sort(ints);	
		return (Arrays.binarySearch(ints,k)>-1);
	}

	public static void main(String[] args) {

		int[] ints = {-9,1,37,102};
		A.exist(ints,102);
		A.exist(ints,36);
		A.exist(ints,1);


		System.out.println(A.exist(ints,102));
		System.out.println(A.exist(ints,36));
		System.out.println(A.exist(ints,1));

	}

}
