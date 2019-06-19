package cse360assign2;
/**
 * 
 * @author dina bataq
 *
 */

public class AddingMachine {
	private int total;
	private String history;
	/**
	 * 
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * 
	 * @return
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * 
	 * @param value
	 */
	public void add (int value) 
	{
		total = total + value;
		history = String.format("%s + %d", history, value);
				
	}
	/**
	 * 
	 * @param value
	 */
	public void subtract (int value) 
	{
		total = total - value;
		history = String.format("%s - %d", history, value);
	}
	/**
	 * 	
	 */
	public String toString () 
	{
		return history;
	}
	/**
	 * 
	 */
	public void clear()
	{
		
	
	}

}
