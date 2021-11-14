//********************************************************************
//ArrayList.java       Java Foundations
//
/*  Represents a generic Array that can be filled with any object
* @author Ethan Craycroft
* @version 1.0
* Programming Lab 3 - Generics
* CS-131-ON Fall 2021
//********************************************************************
*/

import java.util.Arrays;

public class ArrayList<T> {

	private final int DEFAULT_SIZE=10;
   	private int currentItem=0;
   	private T arList[];
	
   	@SuppressWarnings("unchecked")
	public ArrayList()
	{   
   	/*
   	 * The code below will cause a compile error because T is cast to object
   	 * if we cast object to whatever T is (like a String) we will cause a runtime error.
   	 * We could use a java collection like ArrayList for this.     
   	 */
	// arList=new T[DEFAULT_SIZE];                                        				  	
			  
    //this is the proper way to initialize this object using a call to new Object.                                                            	    	                                      				 		                                                                                         		
	arList=(T[]) new Object[DEFAULT_SIZE];
    }//end empty-argument constructor 

  @SuppressWarnings("unchecked")
    public ArrayList(int length)
    {
	  // arList=new T[length]; //causes a compile error (see above)
	  arList=(T[]) new Object[length];
	  
    }//end preferred constructor
  
  	/**
  	 * This method checks to ensure that the current array is not full
  	 * If the array is not full, the item pushed to this method should be added
  	 * and the result boolean should return true
  	 * If the array is full, the item should not be added 
  	 * and the result boolean should return false
  	 *
  	 * @param T the item being added to the current array
  	 * @return the value of the boolean result
  	 */

  	public boolean addItem(T item)
  	{
  		boolean result = false;
  		if(currentItem < arList.length)
  		{
  			arList[currentItem] = item;
  			result = true;
  		}
  		else if(currentItem >= arList.length)
  		{
  			result = false;
  		}
  		currentItem++;
  		return result;
  	}//end addItem

	@Override
	public String toString() 
	{
		StringBuilder build = new StringBuilder("Items in the Array: ");
		for(int count = 0; count < arList.length; count++)
		{
			build.append(arList[count].toString() + "; ");		
		}
		String result = build.toString();
		return result;
	}//end toString
	
  	
}//end class
