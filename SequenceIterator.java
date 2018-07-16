

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
