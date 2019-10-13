
/***********************************************************************
For this task, we are provided with an array of custom Date objects. 
A date has members Day, Month and Year of type integer, and is represented in input and output as "DD-MM-YYYY".

We need to implement a function such that it returns the third-latest date, given such an array of Date objects. We
may assume the input array will always have at least 3 distinct elements, and that the dates in the input are
valid.

Example: Input: [14-04-2001, 29-12-2061, 21-10-2019, 07-01-1973, 19-07-2014, 11-03-1992, 21-10-2019]
Output: 19-07-2014.

Source: www.hackerrank.com		  
 ***********************************************************************/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Solution {

	//Find the third latest date method
	public static Date ThirdLatest(Date[] dates) {

		Solution solution = new Solution();		
		Date date = null;
		//Implement TreeSet to delete duplicate objects and sort the objects according to the Comparator. 
		TreeSet<Date> set = new TreeSet<Date>(solution.new Sort());
		//Populate the TreeSet
		for(Date temp:dates) {
			set.add(temp);}
		//Once duplicated objects have been deleted and objects have been sorted, we added them to an ArrayList.
		ArrayList<Date> newArrayDate = new ArrayList<Date>();
		for(Date a:set) {
			newArrayDate.add(a);
		}
		//Look for the third latest date object.
		for(int i = newArrayDate.size()-1; i>=0; i--) {
			if(i==newArrayDate.size()-3) {
				date = newArrayDate.get(i);
			}
		}	
		return date;
	}


	//Sort date objects. 
	class Sort implements Comparator<Date> {

		public int compare(Date o1,Date o2) {
			int i=0;
			//Sort by year
			if(o1.Year>o2.Year){
				i=1;
			}
			//If years are equal sort by Month
			else if(o1.Year==o2.Year && o1.Month>o2.Month) {
				i=1;
			}
			//If years are equal and months as equal, sort by day
			else if(o1.Year==o2.Year && o1.Month==o2.Month && o1.Day>o2.Day) {
				i=1;
			}
			// Check for equal date objects
			else if(o1.Year==o2.Year && o1.Month==o2.Month && o1.Day==o2.Day) {
				i=0;
			}
			else{
				i=-1;
			}

			return i;
		}

	}


}

