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
// Persons:         (NONE)
// Online Sources:  (NONE)
//
/////////////////////////////// 80 COLUMNS WIDE ///////////////////////////////
import java.util.Iterator;
/**
 * Description of the class comes here
 * The Sequence class creates SequenceIterator objects.
 *
 */
 
public class Sequence implements Iterable<Integer>{
	
	// a NumberGenerator object that generates and returns
	// a number of index n in a sequence of numbers
    private NumberGenerator generator;
    
    private int size; // Number of items in the sequence
    
    /**
     * Creates a Sequence of Integers with a given instance of
     * NumberGenerator and a given size
     * @param generator
     * @param size
     * @throws IllegalArgumentException if size is negative
     */
    public Sequence(NumberGenerator generator, int size) 
    		throws IllegalArgumentException{
   
    		//throws an Illegal ArgumentException if size is negative
    		if(size < 0) {
    			throw new IllegalArgumentException("Illegal"); 
    		}
    	
    		this.generator = generator;
    		this.size = size;
    }
    
    /**
     * Returns an iterator object
     * 
     */
    @Override
    public Iterator<Integer> iterator() {
    	//create and return an iterator object
		return new SequenceIterator(generator, size);
    }
    
    /**
     * Prints out a String of the numeric sequences
     */
        
    @Override
    public String toString(){
    	// overrides the toString method of java.lang.Object 
    	// class to return a String representation of the sequence.
    	// The different numbers of the sequence would be 
    	// separated by a single space
    	//You can create different sequences with different parameters, 
    	//print out the content of each sequence, 
    	//use a for each loop to go throw the different terms of a sequence and sum them up
    	
    	
    	String sequence = "";
    	Sequence seq = new Sequence(generator,size);
    	Iterator<Integer> itr = iterator();
    	
	    	while(itr.hasNext()) {
	    		 sequence += itr.next() + " ";
	    		 if(!itr.hasNext()) {
	    			 break;
	    		 }
	        
	    	}
	    	
	   
	    	
	    
    	return sequence;
    }
 
    public static void main(String[] args) {
        //Test code to check my output
	    	System.out.println("****************************************");
	    	System.out.println("           Sequence Generator");
	    	System.out.println("****************************************");
	    	
	    	System.out.println("==========Arithmetic Sequence==========");
	    	Sequence sequence = new Sequence(new ArithmeticNumberGenerator(2,2),4);
	    	System.out.println(sequence.toString());
	    	         
	    	System.out.println("==========Geometric Sequence==========");
	    	sequence = new Sequence(new GeometricNumberGenerator(2,2),10);
	    	System.out.println(sequence.toString());
	    	         
	    	System.out.println("==========Fibonacci Sequence==========");
	    	sequence = new Sequence(new FibonacciNumberGenerator(),20);
	    	System.out.println(sequence.toString());
    		

    }
    
}   