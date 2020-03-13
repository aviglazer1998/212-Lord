/*Project1  Avi Glazer    Lab 21E
 * 
 * This class turns a string of information in regards to time into a time 
 * that represents a clock with hours, minutes, and seconds. 
 * There is a get and set method for the hours, minutes,
 * and seconds which get the information from those private classes and can set
 * the information that is private. there is a "isValid method that checks
 * to see if the information being entered from the file is the format we want.
 * there is also a toString method which turns our integers into strings
 * 
 */

public class Clock {
//three variables for our time
	private int hour;
	private int minute;
	private int second;
	
	public Clock (int H, int M , int S) {
		hour = H;
		minute = M;
		second = S;
	}
	
	// checks to see if the hour is valid
	private static boolean isHourValid(int H) {
	      if (H >= 24 || H < 0) 
	    	  new IllegalArgumentException("Invalid Hour");
	      return true;
	}
	      
	//checks to see if the minute is valid
	private static boolean isMinuteValid(int M ) {
	      if(M >= 60 || M < 0)
	    	  new IllegalArgumentException("Invalid Minute");
	       return (true);
	}
	
	//checks to see if the second is valid
	private static boolean isSecondValid(int S) {
		if(S >= 60 || S < 0)
			new IllegalArgumentException("Invalid Second");
		return true;
	}

	//below are the get and set methods for our three private variables above (sec, min, hour)
	public int getHour() {
		return hour;
	}

	public void setHour(int s) {
		hour = s;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int s) {
		minute = s;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int s) {
		second = s;
	}
	
	// the check____ methods make sure eah token is two digits
	public String checkHour() {
		if (hour < 10)
			return "0" + hour;
		 return Integer.toString(hour);
		
	}
	
	public String checkMinute() {
		if (minute < 10)
			return "0" + minute;
		 return Integer.toString(minute);
	}
	
	public String checkSecond() {
		if (second < 10)
			return "0" + second;
		 return Integer.toString(second);
	}
		
	
	//toString overrides the Object class toString and without it there would be unreadable hash code
	public String toString() {
	isHourValid(hour);
	isMinuteValid(minute);
	isSecondValid(second);
	
	return checkHour() + ":" +  checkMinute() + ":" + checkSecond();
	
	}
} // end public class clock