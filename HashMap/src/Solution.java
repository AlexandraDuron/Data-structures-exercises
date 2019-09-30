/****************************************************************
We are given a phone book that consists of people's names and 
their phone number. After that we are be given some person's
name as query. For each query, we print the phone number of that person.

The first line will have an integer "n" denoting the number of entries in 
the phone book. Each entry consists of two lines: a name and the corresponding phone number.
After these, there are some queries. Each query contains a person's name.
We read the queries until end-of-file.

For each case, we print "Not found" if the person has no entry 
in the phone book. Otherwise, we print the person's name and phone number. 

Source: https://www.hackerrank.com/challenges/phone-book/problem

 * **************************************************************/

import java.util.*;
import java.io.*;
import java.util.HashMap;

class Solution{

	//Atributes
	static HashMap<String,String> book = new HashMap<String,String>();

	public static void main(String []argh) throws FileNotFoundException
	{
		// Load file with data
		String fileName = "data.txt";
		File file = new File(fileName);
		Scanner in = new Scanner(file);

		int n=in.nextInt();
		in.nextLine();
		//Add the phones an numbers to the map
		for (int i=0; i<n; i++){   
			book.put(in.nextLine(),in.nextLine());
		}

		//Print map
		System.out.println("This is the map ");
		for (String temp:book.keySet()) {
			System.out.println(temp + " " + book.get(temp));	
		}
		System.out.println("\n \n");

		//Check if contains key
		while(in.hasNext()) {
			String k =  in.nextLine();
			if(book.containsKey(k)){
				System.out.println( k +"="+book.get(k));
			}
			else {System.out.println("Not found");
			}
		}
	}
}



