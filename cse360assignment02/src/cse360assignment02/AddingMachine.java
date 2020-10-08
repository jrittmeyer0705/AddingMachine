package cse360assignment02; 
/**
* The AddingMachine keeps track of calculations performed by the myCalculator object in this program.
*
* @author  Justin Rittmeyer
* @version 1.0
* @since   2020-10-7 
*/
public class AddingMachine {  
private int total;
private String history;
/**
* This method has contents in it that just enhance clarity in the program
* total=0 and history = "0" for clarity
* @param Unused
* @return Nothing
*/
public AddingMachine () {
	
	total = 0; // not needed - included for clarity  
	history="0";
}     
/**
* This method has the total that is used throughout the program.
* @param Unused
* @return int getTotal
*/
 public int getTotal () {
	 
	 return total;   
 }    
 /**
 * This method adds the total to the value. Also adds the integer value in the history string which gets printed out by main in this program.
 * @param int value, this is the only parameter in this method.
 * @return Nothing
 */
 public void add (int value) {
	 
	 total=total+value;
	 history=history+" + "+Integer.toString(value);
 } 
 /**
 * This method subtracts total from value. Also subtracts the integer value in the history string which gets printed out by main in this program.
 * @param int value, this is the only parameter in this method
 * @return Nothing
 */
 public void subtract (int value) {
	 
	 total=total-value;
	 history=history+" - "+Integer.toString(value);
 } 
 /**
 * This method contains the toString method to represent any object as a string
 * @param Unused
 * @return String that contains history
 */
  public String toString ()  {
	  
	  return history;   
  } 
  /**
  * Clear method, has no effect on programs output
  * @param Unused
  * @return Nothing
  */
  public void clear()  {
	  
	  history="";
  }
  
  /**
   * This is the main method which makes use of add, subtract and toString methods.
   * the system prints out the contents of the toString method which contains the history of all the calculations
   * done by the myCalculator object
   * myCalculator gets created using the new keyword in main
   * @param args Unused.
   * @return Nothing.
   */
  public static void main(String[] args) {
	  
	  AddingMachine myCalculator =new AddingMachine();
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
  }
} 