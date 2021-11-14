//********************************************************************
//PointThreeD.java       Java Foundations
//
/* Represents a 3-dimensional object with 3 point values in space
* @author Ethan Craycroft
* @version 1.0
* Programming Lab 3 - Generics
* CS-131-ON Fall 2021
//********************************************************************
*/

public class PointThreeD 
{
	private double xPoint; // variable to be set as the x-point of the 3D object
	private double yPoint; // variable to be set as the y-point of the 3D object
	private double zPoint; // variable to be set as the z-point of the 3D object
	
	
	/**
	 * empty-argument constructor initializes the variables xPoint, yPoint, and zPoint
	 */
	public PointThreeD()
	{
		xPoint = 0;
		yPoint = 0;
		zPoint = 0;
	}//end empty-argument constructor

	/** *
	* @param x the value of xPoint based on the calling method  
	* @param y the value of yPoint based on the calling method
	* @param z the value of zPoint based on the calling method  
	*/
	public PointThreeD(double x, double y, double z)
	{
		this.yPoint = y;
		this.xPoint = x;
		this.zPoint = z;
	}//end preferred constructor

	@Override
	public String toString() 
	{
		return "PointThreeD [xPoint=" + xPoint + ", yPoint=" + yPoint + ", zPoint=" + zPoint + "]";
	}//end toString
	
	
}//end class
