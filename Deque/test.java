import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class test {

	/****************************************************************
	 * Java Dequeue
	 * 
	 * In this problem, you are given N integers. You need to find the
	 * maximum number of unique integers among all the possible contiguous subarrays of size M.
	 * 
	 * In the sample testcase, there are 4 subarrays of contiguous numbers.

 s1 = [5,3,5] Has 2 unique numbers.

 s2 = [3,5,2] Has  unique numbers.

 s3 = [5,2,3] Has  unique numbers.

 s4 = [2,3,2] Has  unique numbers.

 In these subarrays, there are 2,3,3,2  unique numbers, respectively. 
 The maximum amount of unique numbers among all possible contiguous subarrays is 3.

 Source :https://www.hackerrank.com/challenges/java-dequeue/problem

 (Solution prints the correct answer but still needs fixing, deque was not properly implemented.)
	 * 
	 ****************************************************************/
	public static void main(String[] args) throws FileNotFoundException {

		//Read data
		String fileName = "data.txt";
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		// make a deque (Still, it's not clear , why do we need to implement a deque???)
		Deque deque = new ArrayDeque<>();
		//HashSet doesn't allow duplicate members
		HashSet<Integer> set = new HashSet<Integer>(); 


		int n = in.nextInt();
		int m = in.nextInt();
		//populate deque
		for (int i = 0; i<n; i++) {
			int num = in.nextInt();
			deque.add(num);

		}
		//make deque a normal array 
		Object[] array = deque.toArray();
		ArrayList<Integer> max = new ArrayList<>();	
		//Make sub arrays of size m and put them in the hash set 
		for(int i=0; i<array.length-(m-1); i++) {
			for (int j=i; j<m; j++) {
				set.add((Integer) array[j]);
				//Check for what were are adding to the hash set
				System.out.println((Integer) array[j]);

			}
			//keep m equal to its normal size
			m=m+1;
			//Check for the size of the map for each sub array
			System.out.println("size" + set.size());

			//System.out.println(set.size());
			//Add the size  to an array that will be sorted to find the maximum size
			max.add(set.size());
			//restart HashSet
			set.clear();
		} 
		//Sort the ArrayList in reverse order to find the maximum element 
		Collections.sort(max,Collections.reverseOrder());
		//Print the maximum element
		System.out.println(max.get(0));

	}

}


