//////////////////// ALL ASSIGNMENTS INCLUDE THIS SECTION /////////////////////
//
// Title:           (Sequence Generator)
// Files:           (UTF-8)
// Course:          (course number, term, and year)
//
// Author:          (Aniya Allen)
// Email:           (aallen27@wisc.edu)
// Lecturer's Name: (Gary Dahl)
///////////////////////////// CREDIT OUTSIDE HELP /////////////////////////////
//
// Students who get help from sources other than their partner must fully 
// acknowledge and credit those sources of help here.  Instructors and TAs do 
// not need to be credited here, but tutors, friends, relatives, room mates 
// strangers, etc do.  If you received no outside help from either type of 
// source, then please explicitly indicate NONE.
//
// Persons:         (identify each person and describe their help in detail)
// Online Sources:  (identify each URL and describe their assistance in detail)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
/**
 * Description of the class comes here
 *
 */

/**We note that the FibonacciNumberGenerator class does not define any field and just overrides the method generateNumber.
 *  You do not need to define a constructor for that class. 
 *  The default constructor of the super class java.lang.Object would be fine.
 *  
 *  
 *  We note also that unlike the Arithmetic and Geometric number generator classes,
 *   you should provide here an iterative implementation for the FibonacciNumberGenerator generateNumber method. 
 *   This means that you should not write a recursive algorithm for this method.*/

public class FibonacciNumberGenerator implements NumberGenerator {

	/**
	 * 
	 * Iterative implementation that generates the index
	 * of a number in the Fibonacci sequence
	 * 
	 */

	@Override 
	public int generateNumber(int n) {
		// Time complexity: O(n)
		// computes the number of index n in a Fibonacci sequence
		// iteratively. (Do not use a recursive algorithm here!)

		if(n <= 1) {
			return n;
		}
		int fibNum = 1;
		int prevFibNum = 1;
		
		//Starts at 2 because you need to add the previous numbers to begin
		for(int i = 2 ; i<n; i++) {
			int temp = fibNum;
			fibNum += prevFibNum;
			prevFibNum = temp;
		}
		return fibNum;
	}

	//test
	public static void main(String[] args) {
		FibonacciNumberGenerator gen = new FibonacciNumberGenerator();
		System.out.println(gen.generateNumber(0));
		
	}

}
