package cse360assignment02; 
 
public class AddingMachine {  
private int total;
private String history;
/**
 * AddingMachine constructor takes in no parameters  
 * returns nothing
 */
public AddingMachine () {
	
	total = 0; // not needed - included for clarity  
	history="0";
}     
/**
 * getTotal takes in no parameters  
 * returns total
 */
 public int getTotal () {
	 
	 return total;   
 }    
 /**
  * add takes in int value as a parameter  
  * returns nothing but adds the value to toString
  */
 public void add (int value) {
	 
	 total=total+value;
	 history=history+" + "+Integer.toString(value);
 } 
 /**
  * subtract takes in an int value as parameter  
  * returns nothing but subtracts the value and adds it to toString
  */
 public void subtract (int value) {
	 
	 total=total-value;
	 history=history+" - "+Integer.toString(value);
 } 
 /**
  * toString method takes in no parameters 
  * returns history
  */
  public String toString ()  {
	  
	  return history;   
  } 
  /**
   * clear method takes in no parameters  
   * 
   */
  public void clear()  {
	  
	  history="";
  }
  
  /**
   * Main method takes in string[] args  
   * Initializes adding machine and performs all calculations
   */
  public static void main(String[] args) {
	  
	  AddingMachine myCalculator =new AddingMachine();
	  myCalculator.add(4);
	  myCalculator.subtract(2);
	  myCalculator.add(5);
	  System.out.println(myCalculator.toString());
  }
} 