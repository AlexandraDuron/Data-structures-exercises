/****************************************************************
We print the number of unique pairs we have, after taking each pair of strings as input.
Source: https://www.hackerrank.com/challenges/java-hashset/problem

 * **************************************************************/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException{

		String fileName = "data.txt";
		File file = new File(fileName);	
		Scanner s = new Scanner(file);
		int t = s.nextInt();

		String [] pair_left = new String[t];
		String [] pair_right = new String[t];

		for (int i = 0; i < t; i++) {
			pair_left[i] = s.next();
			pair_right[i] = s.next();
		}

		HashSet<String> pairs = new HashSet<String>(); 
		for(int i = 0; i<t; i++){
			pairs.add(pair_left[i]+""+pair_right[i]);

			System.out.println(pairs.size());

		}


	}
}