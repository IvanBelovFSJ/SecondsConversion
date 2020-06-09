/* 
 * Edited by: Ivan Belov
 * StudentID: T00637195
 */ 
 
import java.util.Scanner;     // use Scanner class for console input 
 
public class SecondsConverter
{

public static void main (String[] args)     
{         
  @SuppressWarnings("resource")
Scanner myScanner = new Scanner (System.in);   // create a Scanner object and attach it to System.in        
 
  int inputSeconds = 0;    // this variable holds the value of seconds provided by a user. 
  int inputSecondsToMinutes = 0;     // this variable hold the value of seconds left to calculate minutes
  int leftOverSeconds = 0;
  
  int hours = 0;           // this variable holds the value of hours calculated
  int minutes = 0;         // this variable holds the value of minutes calculated    
  
  System.out.println ("Seconds to Hours and Minutes Converter");         
  System.out.print   ("\nEnter seconds to convert: ");
  
  inputSeconds = myScanner.nextInt();	// get gallons from user                  
 
  hours = inputSeconds / 3600;    // conversion formula
  inputSecondsToMinutes = inputSeconds % 3600;
    
  minutes = inputSecondsToMinutes / 60;
    
  leftOverSeconds = inputSecondsToMinutes % 60;
  
  System.out.print   ("\nConverted: " + inputSeconds + " seconds " + " = ");
  
  System.out.println ("\n"+hours + " hour(s)" + "\n" + minutes + " minute(s)" +"\n"+ leftOverSeconds + " second(s)");    // display result            
  System.out.println ( "\nThe app has closed."); 
}// end of main() 
}// end of class 