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
 * A SquenceIterator that can iterate over any sequence of numbers
 *
 */
 
public class SequenceIterator implements Iterator<Integer>{
    private NumberGenerator generator; // a NumberGenerator object
    			// that generates and returns a number of index n in a 
    			// sequence of numbers
    
    private int size;  // size of the sequence
    private int index; // index of the next number to be generated in the sequence
    
    /**
     * Constructs a SequenceIterator with given number generator and size
     * This constructs initializes also the index to 0
     * @param generator
     * @param size
     */
    public SequenceIterator(NumberGenerator generator, int size) {
        index = 0;
        this.size = size;
        this.generator = generator;
    }

	@Override
	public boolean hasNext() {
		return index < size;
	}

	@Override
	public Integer next() {
			index++;
		return generator.generateNumber(index-1);
	}
	
	//comment this
	public void remove() {
        throw new UnsupportedOperationException();
    }
    
  
 
}
