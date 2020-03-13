import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class ClockGUI extends JFrame{
	private static JFrame myClockGUI = new JFrame("Project1 Clock");
	
	public ClockGUI(String title , int location1 , int location2) {
		
		    setTitle(title);
		    myClockGUI.setLocation(location1, location2);
		  
	}

	public  void printClocktoJFrame(Clock[] sortedList,  Clock [] unsortedList) {
		
		
		myClockGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //makes an x button on the GUI
		
		myClockGUI.setLayout(new GridLayout(1,2)); //sets rows and cols using the grid layout
        JTextArea unsortText = new JTextArea(); //makes the text for unsortedList
        unsortText.setEditable(false); 
        myClockGUI.getContentPane().add(unsortText); //adds unsortedList times to frame
        JTextArea sortText = new JTextArea();// makes texts for sorted times
        sortText.setEditable(false);
        myClockGUI.getContentPane().add(sortText); //adds sortedList times to frame
        for (int i=0;i<unsortedList.length;i++) {  // loops the unsorted array into the GUI
        	if (unsortedList[i]!=null){
        		unsortText.append(unsortedList[i].toString()+"\n");
        	}
        }
        for (int i=0;i<sortedList.length;i++) { //loops the sorted array in the GUI
        	if (sortedList[i]!=null){ //checks to make sure all values are acceptable
        		sortText.append(sortedList[i].toString()+"\n");
        	}
        }
        myClockGUI.pack(); //makes window fit correctly
        myClockGUI.setVisible(true); //makes  GUI visible
} 

	
}
