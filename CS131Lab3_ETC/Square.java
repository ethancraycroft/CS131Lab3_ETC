//********************************************************************
//Square.java       Java Foundations
//
/* Represents a square object with a value for its sides
* @author Ethan Craycroft
* @version 1.0
* Programming Lab 3 - Generics
* CS-131-ON Fall 2021
//********************************************************************
*/
public class Square 
{
	private double side; // variable to be set as the value of the length of the sides of the Square object
	
	/**
	 * empty-argument constructor initializes the side variable
	 */
	public Square()
	{
		side = 0.0;
	}//end empty-argument constructor 
	
	
	/** *
	* @param s the value of s based on the calling method  
	* */
	public Square(double s)
	{
		this.side = s;
	}//end preferred constructor
	
	/**
	* This method calculates the area of the Square object
	*
	* @return the value of the Square's area
	*
	*/
	public double getArea()
	{
		double area = (side * side);
		return area;
	}//end getArea

	@Override
	public String toString() 
	{
		return "Square [side=" + side + ", area=" + getArea() + "]";
	}//end toString
	
}//end class
