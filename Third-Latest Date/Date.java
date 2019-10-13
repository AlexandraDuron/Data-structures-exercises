
//Date objects
public class Date {

	//Attributes
	protected int Year, Month, Day;

	//Constructor
	Date(int Year, int Month, int Day){
		this.Year=Year;
		this.Month=Month;
		this.Day=Day;
	}
	
	//Nice display
	public String toString() {
		
		String message = Day+"-" + Month +"-"+Year;
		
		return message;
	}

}
