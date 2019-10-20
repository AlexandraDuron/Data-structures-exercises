//This is a simple method to show how binary search works. 

import java.util.Arrays;
import java.util.Scanner;

public class Search {

	boolean searchNumber(int x, int[] array){

		Arrays.sort(array);
		boolean find = false;
		int high = array.length;
		int mid=0;

		int low = 0;
		//check if array is empty
		if (high==0){
			return find = false;
		}
		//check if the number is in the middle of the array
		if ((array.length-1)/2==x){
			return find = true;
		}
		//Start binary search
		mid = (high-low)/2;

		do {
			//check on left side
			if(array[mid]>x){
				high=mid ; 
				mid = (high - low)/2;
				if(array[mid]==x) {
					find = true;
					break;
				}
			}
			//check on right side
			else {
				low = mid;
				mid=((high-low)/2)+low; 
				if(array[mid]==x) {
					find = true;
					break;
				}	
			}
		}while(high-1>low);

		return find;
	}


}
