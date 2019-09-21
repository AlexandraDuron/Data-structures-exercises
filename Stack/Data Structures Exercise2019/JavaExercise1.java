import java.util.ArrayList;
import java.util.Iterator;

public class JavaExercise1<E>{

	static ArrayList<String> caod = new ArrayList<String>();

	/****************************************************************
	 * 						ArrayList
	 * Displaying the elements of an ArrayList using different 
	 * methods, then adding and removing operations. 
	 *
	 * **************************************************************/
	public static void arrayCaod() {
		caod = new ArrayList<String>();
		caod.add("Kelvingrove Art Gallery and Museum");
		caod.add("National Museum of Scotland");
		caod.add("Royal Yacht Britannia");
		caod.add("Camera Obscura and World of Illusions");
		caod.add("Morayvia");
		caod.add("Montrose Air Station Heritage Centre");

	}


	// Display elements using iterator loop.
	public static <E> Iterator<E> MyListIterator(ArrayList<E> caodList) 
	{ 
		arrayCaod() ;
		System.out.println("Title - Original ArrayList \n");
		Iterator<String> r = caod.iterator();
		while (r.hasNext()) {
			System.out.println(r.next());
		}

		return null;

	} 


	//Add two elements at a given index. Display elements after add operation. Use the "Enhanced For Loop".
	public static Object MyEnhancedLoop(ArrayList<String> caodList) 

	{ 
		caod.add(0,"Peterhead Prison Museum");
		caod.add(1,"Wick Heritage Museum");
		System.out.println("\n \n \nTitle - ArrayList after adding elements\n");
		for (String array : caod) {
			System.out.println( array);
		}

		return null;


	} 

	//Display elements after remove operation of "Camera Obscura and World of Illusions". Utilizing while Loop.
	public static <E> void MyWhileLoop(ArrayList<E> caodList) 

	{ 
		caod.remove(5);
		System.out.println("\n \n \nTitle - ArrayList after remove operation\n");
		int i = 0; 
		while (caod.size() > i) {
			System.out.println(caod.get(i));
			i++;
		}


	} 

	//Remove an element from a specified index. Displaying elements after remove operation. Utilizing the regular "For Loop".
	public static <E> void MyForLoop(ArrayList<E> caodList) 
	{ 

		caod.remove(4);
		System.out.println("\n \n \nTitle - ArrayList after remove operation\n");
		for(int i = 0; i < caod.size(); i++) {
			System.out.println(caod.get(i));}

	}



	public static void main(String args[]) {



		/* 
		 * Create an ArrayList (type safety) called "CAOD" List.
		 * For each of the output, we make sure there is a space 
		 * between the title and the elements displayed. 
		 * Also, we ensure there is a space between outputs to increase readability.
		 * File_museums.txt contains the museums that we need to be added to the ArrayList.
		 * 
		 */

		JavaExercise1<String> obj = new JavaExercise1<>();
		//Create an ArrayList and add elements to it one by one.
		// Display elements utilizing an iterator loop. Printing out the section's title "Title - Original ArrayList" before displaying the elements.

		MyListIterator(caod);

		// Add element at the given index 
		//  	Add element "Peterhead Prison Museum" at first position
		//  	Add element "Wick Heritage Museum" at second position
		//Displaying elements after add operation. Use the "Enhanced For Loop" (new way to loop). 
		// Printing out the section's title "Title - ArrayList after adding elements" before displaying the elements
		MyEnhancedLoop(caod);

		// Remove elements from ArrayList 
		// Remove "Camera Obscura and World of Illusions" from ArrayList
		// Displaying elements using a "while loop". 
		// Printing out the section's title "Title - ArrayList after remove operation" before displaying the elements

		MyWhileLoop(caod);


		//Removing an element from the specified index. 
		//Removing the fifth element.
		//Displaying elements using a "For Loop" (regular for loop). 
		//Printing out the section's title "Title - Final ArrayList" before displaying the elements.

		MyForLoop(caod);

	}
}
