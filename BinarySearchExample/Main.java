import java.util.Scanner;

public class Main {

	//Test section
	public static void main(String[] args){	

		Search search = new Search();
		System.out.print("This program prints true if the selected number is in the array, it prints false otherwise.\n\n");
		while(true) {
			try {
				//Ask for an input
				System.out.print("Please select the number you're looking for (positive or negative):\n");
				Scanner scanner = new Scanner(System.in);
				int x = Integer.parseInt(scanner.nextLine());
				//Default array
				int[] array = {-1,0,1,2,3,4,5,6,7,8,91,100};
				System.out.print(search.searchNumber(x,array)+"\n");

			}catch(Exception exception){
				System.out.print("\nPlease select a number input");
			}
		}
	}

}
