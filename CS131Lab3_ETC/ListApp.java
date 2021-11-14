//********************************************************************
//ListApp.java       Java Foundations
//
/* Tests the ArrayList class by creating Square, PointThreeD, and String objects to fill the arrays and test the toString methods of each
* @author Ethan Craycroft
* @version 1.0
* Programming Lab 3 - Generics
* CS-131-ON Fall 2021
//********************************************************************
*/
public class ListApp 
{

	public static void main(String[] args) 
	{
		/*--------------------------------------------------------------------------------------------------
		 * The code below is used to create a new ArrayList for Square objects
		 * The array is created and filled with new Square objects using iteration
		 * The ArrayList toString method is printed out to ensure it is working properly
		 * (the ArrayList toString method calls the toString method of the Square objects individually)
		 * -------------------------------------------------------------------------------------------------
		 */
		int squareLength = 10;
		ArrayList<Square> squareList = new ArrayList<Square>(10);
		for(int count = 0; count < squareLength; count++)
		{
			squareList.addItem(new Square(count+1.0));
		}
		System.out.println(squareList.toString());
		System.out.println();
		System.out.println();
		
		//end Square test
		
		
		/*--------------------------------------------------------------------------------------------------
		 * The code below is used to create a new ArrayList for String objects
		 * The array is created and filled with new String objects using iteration
		 * The ArrayList toString method is printed out to ensure it is working properly
		 * (the ArrayList toString method calls the toString method of the String objects individually)
		 * -------------------------------------------------------------------------------------------------
		 */
		int stringLength = 10;
		String item = "A";
		ArrayList<String> stringList = new ArrayList<String>();
		for(int count = 0; count < stringLength; count++)
		{
			stringList.addItem(new String(item));
			item+="A";
		}
		System.out.println(stringList.toString());
		System.out.println();
		System.out.println();

		//end String test
		
		
		/*--------------------------------------------------------------------------------------------------
		 * The code below is used to create a new ArrayList for PointThreeD objects
		 * The array is created and filled with new PointThreeD objects using iteration
		 * The ArrayList toString method is printed out to ensure it is working properly
		 * (the ArrayList toString method calls the toString method of the PointThreeD objects individually)
		 * -------------------------------------------------------------------------------------------------
		 */
		int pointLength = 10;
		ArrayList<PointThreeD> pointsList = new ArrayList<PointThreeD>();
		for(int count = 0; count < pointLength; count++)
		{
			pointsList.addItem(new PointThreeD((count+1.0), (count+1.0), (count+1.0)));
		}
		System.out.println(pointsList.toString());
		System.out.println();
		System.out.println();
		
		//end PointThreeD test

	}//end main

}//end class
