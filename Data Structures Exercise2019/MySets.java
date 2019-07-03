import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.SortedSet; 

/********************************************************
 * Use of HashSet, Set, SortedSet.
 * Creating and displaying three Sets of type "String", called caodSet1, caodSet2 and caodSet3;
 * File_veggies.txt contains 3 lists of vegetables.
 * Members of caodSet1 represent vegetables that are grown in the UK in March
 * Members of caodSet2 represent vegetables that are grown in April.
 * The third set, caodSet3 contains the name of the vegetables produced in the UK in May. 
 * We added all the members of each set at once (not one by one) and 
 * the output was sorted in ascending order for Set 1 and Set 2. 
 * The output of Set 3 doesn't have a particular order.
 * ******************************************************/

public class MySets{

	static SortedSet<String> caodSet1;
	static SortedSet<String> caodSet2;
	static HashSet<String> caodSet3;
	static ArrayList<String> uList;
	static Set<String> newcaodSet3;

	public static void populateArray() {

		caodSet1 = new TreeSet<String>(Arrays.asList("Radishes","Purple Sprouting Broccoli","Artichoke", "Beetroot", "Cabbage","Sorrel", "Spring Greens","Carrots", "Spring Onions", "Watercress","Chicory", "Cucumber", "Leeks", "Parsnip", "Rhubarb"));
		caodSet2 = new TreeSet<String>(Arrays.asList("Beetroot", "Kale", "Spring Onions","Morel Mushrooms", "Parsnips", "Radishes", "Rhubarb", "Rocket", "Cabbage", "Carrots","Sorrel", "Spinach","Chicory", "New Potatoes", "Spring Greens",  "Watercress", "Artichoke"));
		System.out.print("caodSet1:"+ caodSet1+ "\n");
		System.out.print("Set2:"+ caodSet2 + "\n");
		caodSet3 = new HashSet<>(Arrays.asList("Beetroot", "Chillies",  "Lettuce", "Marrow", "Rhubarb", "Rocket", "Pineapple", "Asparagus", "Aubergine","Samphire", "Orange", "Spinach", "Banana", "Spring Onions","Peppers", "Radishes","Watercress") );
		System.out.print( "caodSet3:"+caodSet3 );

	}

	//Union of caodSet1 and caodSet2 sets using addAll() 
	public static <E> Set<String> union(Set<String> caodSet1, Set<String> caodSet2) 
	{  
		System.out.print("\n\n\nUnion of caodSet1 and caodSet2\n");
		caodSet1.addAll(caodSet2);
		System.out.print(caodSet1);
		return null; 

	} 

	// Union of caodSet2 and caodSet3 sets using addAll() 
	public static Set<String> union1(Set<String> caodSet2, Set<String> caodSet3) 

	{  
		//Make caodSet2 a HashSet again
		Set<String> c = new HashSet<String>(caodSet2);
		c.addAll(caodSet3);
		System.out.print(c);
		return c; 
	} 


	// Convert output of union1 to a list called uList 
	public static ArrayList<String> convSet() 
	{
		uList = new ArrayList<String>(MySets.union1(caodSet2, caodSet3));
		System.out.print(uList);
		return uList; 
	}


	// Find the difference between Set1 and set2
	public static Set<String> diff() 

	{ 
		System.out.print("\n\n\nSize of uList:\n");
		int difference = uList.size();
		System.out.print(difference);
		return null; 
	} 


	// Finding intersection called "intersection1" between caodSet1, caodSet2 and caodSet3. 
	public static Set<String> intersection() 

	{ 	
		SortedSet<String>caodSet1 = new TreeSet<String>(Arrays.asList("Radishes","Purple Sprouting Broccoli","Artichoke", "Beetroot", "Cabbage","Sorrel", "Spring Greens","Carrots", "Spring Onions", "Watercress","Chicory", "Cucumber", "Leeks", "Parsnip", "Rhubarb"));
		SortedSet<String>caodSet2 = new TreeSet<String>(Arrays.asList("Beetroot", "Kale", "Spring Onions","Morel Mushrooms", "Parsnips", "Radishes", "Rhubarb", "Rocket", "Cabbage", "Carrots","Sorrel", "Spinach","Chicory", "New Potatoes", "Spring Greens",  "Watercress", "Artichoke"));
		HashSet<String>caodSet3 = new HashSet<>(Arrays.asList("Beetroot", "Chillies",  "Lettuce", "Marrow", "Rhubarb", "Rocket", "Pineapple", "Asparagus", "Aubergine","Samphire", "Orange", "Spinach", "Banana", "Spring Onions","Peppers", "Radishes","Watercress") );
		System.out.print("\n\n\nIntersection of of caodSet1, caodSet2 and caodSet3 is: \n" );
		Set<String> intersection = new TreeSet<String>(caodSet1);
		intersection.retainAll(caodSet2);
		intersection.retainAll(caodSet3);
		System.out.println(intersection);
		
		return null;
	} 

	//Finding the  difference called "diff" between caodSet1 and caodSet2. 
	public static Set<String> diff1() 
	{
		SortedSet<String>caodSet1 = new TreeSet<String>(Arrays.asList("Radishes","Purple Sprouting Broccoli","Artichoke", "Beetroot", "Cabbage","Sorrel", "Spring Greens","Carrots", "Spring Onions", "Watercress","Chicory", "Cucumber", "Leeks", "Parsnip", "Rhubarb"));
		SortedSet<String>caodSet2 = new TreeSet<String>(Arrays.asList("Beetroot", "Kale", "Spring Onions","Morel Mushrooms", "Parsnips", "Radishes", "Rhubarb", "Rocket", "Cabbage", "Carrots","Sorrel", "Spinach","Chicory", "New Potatoes", "Spring Greens",  "Watercress", "Artichoke"));
		Set<String> diff = new TreeSet<String>(caodSet1);
		diff.removeAll(caodSet2);
		System.out.println("\nDifference of the caodSet1 and caodSet2 is:");
		System.out.println(diff);
		
		return null;

	} 


	//Finding the size of caodSet3. Checking the presence of banana, pineapple, orange and strawberries in caodSet3 using contains() method.
	//if Set3 contains these elements, we remove them.	
	public static Set<String> updated(Set<String> caodSet3) 

	{
		System.out.println("\n\nSize of caodSet3 =");
		int size = caodSet3.size();
		System.out.print(size);
		System.out.print("\nChecking if caodSet3 Contains banana, pineapple, orange and strawberries\n" );
		System.out.println("Is banana present "+ (caodSet3.contains("Banana"))); 
		System.out.println("Is pineapple present "+ (caodSet3.contains("Pineapple"))); 
		System.out.println("Is orange present "+ (caodSet3.contains("Orange"))); 
		System.out.println("Is strawberries present "+ (caodSet3.contains("Strawberries"))); 

		//remove if present
		boolean removedBanana = caodSet3.remove("Banana"); 
		boolean removedPineapple = caodSet3.remove("Pineapple"); 
		boolean removedOrange = caodSet3.remove("Orange"); 
		boolean removedStrawberries = caodSet3.remove("Strawberries"); 

		System.out.print("\nUpdated list\n");
		System.out.print(caodSet3);
		newcaodSet3 = new HashSet<String>(caodSet3);

		return null;

	}


	//Displaying the remaining members (after removing the operation above) of caodSet3 using an iterator method called "iterator". 
	// The output is unsorted.
	//Displaying members of the third set using Iterator, after removing fruits.
	public static Iterator<String> iterator() 
	{
		System.out.println(" \n\n****Iterating Set3 after removing the fruits******* \n");
		Iterator<String> r = newcaodSet3.iterator();
		while (r.hasNext()) {
			System.out.println(r.next());
		}

		return null;	 

	} 


	// Displaying the new size of caodSet3.
	public static Set<String> newSize() 

	{ 
		System.out.print("\n\n\nSize of caodSet3 is now = \n");
		int newSizeSet3 = newcaodSet3.size();
		System.out.print(newSizeSet3);
		
		return null; 
	} 

	//Testing methods
	public static void main(String args[]) 
	{

		MySets.populateArray();
		MySets.union(caodSet1, caodSet2);
		System.out.print("\n\n\nUnion of caodSet2 and caodSet3\n");
		MySets.union1(caodSet2, caodSet3);
		System.out.print("\n\n\nUnion of caodSet2 and caodSet3 converted into a list called uList:\n");
		MySets.convSet();
		diff();
		MySets.intersection();
		MySets.diff1();
		MySets.updated(caodSet3);
		MySets.iterator();
		MySets. newSize();


	}

}
