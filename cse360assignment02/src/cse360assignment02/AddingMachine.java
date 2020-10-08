package cse360assignment02; 
/**
* The AddingMachine keeps track of calculations performed by the myCalculator object in this program.
* @author  Justin Rittmeyer
* @version 1.0
* @since   2020-10-7 
*/
public class AddingMachine {  
private int total;
private String history;
/**
* default constructor that initializes total to zero
* initializes history string variable "0"
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
* @return current int value of variable total
*/
 public int getTotal () {
	 
	 return total;   
 }    
 /**
 * This method adds the total to the value and append + sign and value in string variable history
 * @param int value, this is the only parameter in this method.
 * @return Nothing
 */
 public void add (int value) {
	 
	 total=total+value;
	 history=history+" + "+Integer.toString(value);
 } 
 /**
 * This method subtracts total from value and appends - sign and value in string variable history
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
 * @return history string
 */
  public String toString ()  {
	  
	  return history;   
  } 
  /**
  * clears all the history and sets history variable to "0"
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