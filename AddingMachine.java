// Aashik Dhilipkumar
// CSE 360, Wednesday 9.40 am - 10.30 am
// ASU ID: 1213343974

package cse360assign2;

public class AddingMachine 
{
	private int total;
	private String str; 	// initializing a string variable
	
	public AddingMachine ()
	{
		total = 0; // not needed - included for clarity
	}
	
	public int getTotal()
	{
		return total; 	// returning the final total value
	}
	
	public void add (int value)
	{
		total += value;	// adding the value to the total
		str = str + " + " + value;	// adding the value to the string
	}
	
	public void subtract (int value)
	{
		total -= value;	// subtracting the value from the total
		str = str + " - " + value;	// adding the value to the string
	}
	
	public String toString ()
	{
		return str;	// returning the final string value
	}
	
	public void clear ()
	{
		str = " ";	// clearing the string
	}
}

	