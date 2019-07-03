import java.util.Collections;
import java.util.LinkedList;



public class LinkedList_Exercise {

	/********************************************************
	 * Using Java LinkedList  
	 * ******************************************************/


	//Display elements of a linkedList. Utilizing the "Enhanced For Loop".

	private static void iterateMyList(LinkedList<String> caodFruits) 

	{ 
		System.out.println("\n \n \nThis is caodFruits linkedList using Java LinkedList class:\n");
		for (String array : caodFruits) {
			System.out.println( array);
		}

	} 

	//Checking if gooseberries is in the list

	private static <T> void checkGoose(LinkedList<String> caodFruits) 
	{ 
		// Finding elements in the linked list 
		boolean status = caodFruits.contains("goose"); 

		if(status) 
			System.out.println("\n \nLinkedList contains the element 'Gooseberries\n "); 
		else
			System.out.println("\n \n \nLinkedList doesn't contain the element 'Gooseberries'"); 

	} 

	//Inserting "Gooseberries" after "Blackberries".
	private static void insertGoose(LinkedList<String> caodFruits, String str)

	{ 
		LinkedList<String> list = caodFruits;
		for(int i = 0; i < list.size(); i++){
			if(list.get(i).equals("Blackberries")){
				list.add(i+1, str);
			}
		}
		System.out.println("\n\nThis is caodFruits linkedList after adding Gooseberries:\n" + list);
	}

	/*Displaying the element that is not ending with "berries". Using a variable called notBerries. 
	 *Removing that element and displaying caodFruits linkedList after removing that element. 
	 */
	private static  void notEndingWithBerries(LinkedList<String> caodFruits) 

	{ 
		String notBerries;
		LinkedList<String> list = caodFruits;
		for(int i = 0; i < list.size(); i++){
			notBerries = list.get(i);
			if(!notBerries.endsWith("Berries") && !notBerries.endsWith("berries")){
				System.out.println("\nElement not ending with Berries is: " + notBerries);
				list.remove(i);
			}
		}
		System.out.println("\nThis is caodFruits linkedList after removing Apples:");
		System.out.println(list);
	}


	//Method: convertLinkedListToArray. Converting linkedList into Array called "bstFruit" and display.

	private static String[] convertLinkedListToArray (LinkedList<String> caodFruits) 

	{ 
		String[] strArray = caodFruits.toArray(new String[caodFruits.size()]);
		System.out.println("\n\nArray Elements - This is caodFruits linkedList after converting caodFruits in an array:");
		for(String a: strArray){
			System.out.println(a);
		}
		return strArray;
	} 

	//Sorting the ycaodFruits List in ascending order using Collections 

	private static void sortedLinkedList(LinkedList<String> caodFruits) 

	{ 
		Collections.sort(caodFruits);
		System.out.println("\n\nThis is caodFruits linkedList after sorting in ascending order:");
		System.out.println(caodFruits);
	} 



	public static <E> void main(String[] args) {

		//Creating an empty Linked List of Strings caodFruits 
		//Using the add() method to populate the linkedList caodFruits with the elements in file_fruits.txt.
		//Method called "iterateMyList": Using the Enhanced loop to print out the linkedList  with an appropriate title 
		// Creating an object of class linked list 
		LinkedList<String> caodFruits = new LinkedList<String>(); 
		
		caodFruits.add("Strawberries");
		caodFruits.add("Raspberries");
		caodFruits.add("Blueberries");
		caodFruits.add("Cranberries");
		caodFruits.add("Blackberries");
		caodFruits.add("Apples");
		caodFruits.add("Honeyberries");
		caodFruits.add("Goji Berries");
		caodFruits.add("Wineberries");
		caodFruits.add("Tayberries"); 
		
		iterateMyList(caodFruits);

		//Method "CheckGoose". Finding Gooseberries in the linked list. Using a variable: goose. 
		// If goose exists, we display the message: "LinkedList contains the element 'Gooseberries". 
		// Otherwise "LinkedList doesn't contain the element 'Gooseberries'".
		checkGoose(caodFruits);

		// Method called "insertGoose" - Inserting the fruit name "Gooseberries" after "Blackberries".
		insertGoose(caodFruits, "Gooseberries");

		//Method called "notEndingWithBerries"- Displaying the element that is not ending with "berries".
		notEndingWithBerries(caodFruits);

		//Method called "convertLinkedListToArray" - Converting caodFruits LinkedList to Array called "bstFruits" 
		String[] arrayBST = convertLinkedListToArray(caodFruits);

		// Sorting the caodFruits List in ascending order using Collections. 

		sortedLinkedList(caodFruits);



	}
}

