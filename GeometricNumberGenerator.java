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
 
public class GeometricNumberGenerator implements NumberGenerator {
    private final int init; // The first term in the sequence
    private final int ratio; // The common ratio
    
    /**
     * Constructs an arithmetic number generator with given
     * start value init and common ratio ratio
     * @param init start value
     * @param ratio common ratio
     * @throws IllegalArgumentException if any of the input arguments
     * is illegal
     */
    public GeometricNumberGenerator(int init, int ratio) 
    		throws IllegalArgumentException{
    	
    	//if init or ratio is negative, throws an IllegalArgumentException
	    	if(init <= 0) {
	    		throw new IllegalArgumentException();
	    	}
	    	if(ratio <= 0 ) {
	    		throw new IllegalArgumentException();
	    	}
    	
	    	this.init = init;
	    	this.ratio = ratio;
    }
    
 
    @Override
    public int generateNumber(int n) {
    		int index = 0;
		// Time Complexity: O(?)
    	// This method generates the number of index n
    	// in an arithmetic sequence recursively
    		if(n == 0) {
    			return init;
    		}
    		else if(n == 1){
    			return init*ratio;
    		}else {
    			index = ratio*init*(int)Math.pow(ratio, n-1);
	    		generateNumber(n-1); 
    		}
    		return index;
    }
    
    public static void main(String[] args) {
        //TEST
        		GeometricNumberGenerator gen = new GeometricNumberGenerator(7,2);
        		System.out.println(gen.generateNumber(0));
        		System.out.println(gen.generateNumber(1));
        		System.out.println(gen.generateNumber(2));
        		System.out.println(gen.generateNumber(3));
        		System.out.println(gen.generateNumber(4));
        		System.out.println(gen.generateNumber(5));
        		
        }
}
