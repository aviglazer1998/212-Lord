import javax.swing.*;
import java.util.Scanner;

public class Project0{

    public static void main(String[] args) {

        while(true) {
            
            String inputSentence = JOptionPane.showInputDialog(null, "Enter a sentence to find out how many E's and e's there are in it!");  // This line asks the user for input by popping out a single window with text input
                if(inputSentence.equalsIgnoreCase("stop")) // ends program if "stop" is entered in any variation
                    System.exit(0);

              int E = 0;
              int e = 0;

              for (int i = 0; i < inputSentence.length(); i++) { // loop to check all the letters of the sentence
                  char yesOrNo = (inputSentence.charAt(i)); // checks each individual letter
                      if (yesOrNo == 'E') // checks for E's
                          E++;
                      if (yesOrNo == 'e') // checks for e's
                         e++;
              } //for loop

         JOptionPane.showMessageDialog(null, "Number of e's: " + e + "\n" + "Number of E's: " + E); // prints the final answer

        } //while(true)
    } // public static void main(String[] args)
} // Public class Main