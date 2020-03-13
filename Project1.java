import java.util.StringTokenizer;

public class Project1 {

		static Clock [] arrUnsort = new Clock [20];
		static Clock [] arrSort = new Clock [20];
		static Clock [] badTimes = new Clock [20];
		
	public static void main(String[] args) {
		
		String fileName  = "Project1.txt"; 
		TextFileInput input = new TextFileInput(fileName); 
		inputFromFile(fileName);
		selectionSort(arrSort,arrSort.length); // sorts array by hour
		
		ClockGUI clockGUI = new ClockGUI ("Clock",550 ,200); // instantiates clockGUI
		clockGUI.printClocktoJFrame(arrSort, arrUnsort); // prints clock to JJFrame
		
	
		
	}// main
	
	private static void inputFromFile(String filename){
		
  		TextFileInput in = new TextFileInput(filename);
  		String line = in.readLine();
  		
  		int i = 0;
  		
  		while ( line != null ) { // if there are still lines to read in the file
  			
  			//initializes hours mins and secs to -1 
  			int hour = -1;
  			int minute = -1;
  			int second = -1;
  			
  			StringTokenizer ST = new StringTokenizer(line, ":"); // if there are more tokens it assigns the value to either hour, minute , or second
  			if (ST.hasMoreTokens())
  				hour = Integer.parseInt(ST.nextToken()); 
  			if (ST.hasMoreTokens())
  				minute = Integer.parseInt(ST.nextToken());
  			if (ST.hasMoreTokens())
  				second = Integer.parseInt(ST.nextToken());
  			
  			
  			if(hour == -1 || minute == -1 || second == -1) { // if hour = -1 then the time inputed was invalid 
  															//and it will return the invalid time to the screen
  				if(hour ==-1)
  					System.out.println("Invalid time");
  				else if (minute == -1)
  					System.out.println("Invalid time: " + hour);
  				else if (second ==-1)
  					System.out.println("Invalid time: " + hour + ":" +  minute);
  			} // if -1
  			
  			else { // if the time is checked and okay it gets stored into two arrays
  				arrUnsort[i] = new Clock(hour,minute,second); 
  				arrSort[i] = new Clock(hour,minute,second);	
  			}// else arrays
  				  		
     		line = in.readLine();
     		i++;
  		} // while line
  		
  		in.close();
	}  // inputFromFile
	
	
	private static void selectionSort (Clock[] array, int length) { // sorts an array
	      for ( int i = 0; i < length - 1; i++ ) {
	    	  if (array[i]!=null) {
	    		  int indexLowest = i; 
	    		  for ( int j = i + 1; j < length; j++ ) 
	    			  if ( array[j]!=null&&array[j].getHour() < array[indexLowest].getHour()) 
	    				  indexLowest = j;
	    		  if ( array[indexLowest].getHour() != array[i].getHour() ) { 
	    			  Clock temp = array[indexLowest];
	    			  array[indexLowest]=array[i]; 
	    			  array[i]=temp; 
	    		  } 
	    	  }
	      } 
	} 
	
}// Project1
