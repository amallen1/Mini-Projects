
 
public class ArithmeticNumberGenerator implements NumberGenerator {
    private final int init; // first term in the sequence
    private final int diff; // common difference
    //common difference between the next numbers 2,4,6,8,10 <- the common dif is 2
    
    /**
     * Constructs an arithmetic number generator with given
     * start value init and common difference diff
     * @param init start value
     * @param diff common difference
     * @throws IllegalArgumentException if any of the input arguments
     * is illegal
     */
    public ArithmeticNumberGenerator(int init, int diff) 
    		throws IllegalArgumentException{
    	
    		//throws an IllegalArgumentException if init or diff are negative
    		if(init < 0) {
			throw new IllegalArgumentException();
		}
    		if(diff < 0) {
    			throw new IllegalArgumentException();
    		}
  
    		this.init = init;
    		this.diff = diff;
    		
    }
    /**
     * User passes in an index and the number at
     * that position is returned
     * @param n
     */
 
    @Override
	    public int generateNumber(int n) {
	    	int index = 0;
			// Time Complexity: O(N)
	    	// This method generates the number of index n
	    	// in an arithmetic sequence recursively
	    	
	    	//we are supposed to pass it an index(n) we are looking for
	    	//and it returns the number at that n'th position?
	    	
	    	if(n == 0) {
	    		return init;
	    	}
	    	else if(n == 1) {
	    		return init + diff; 
	    	}
	    	else {
	    		index = diff+init+(n-1)*diff;
	    		generateNumber(n-1);
	    		index++;
	    	} 
	    	return index;
    }
    
    public static void main(String[] args) {
    //test
    		ArithmeticNumberGenerator gen = new ArithmeticNumberGenerator(2,3);
    		System.out.println(gen.generateNumber(0));
    		System.out.println(gen.generateNumber(1));
    		System.out.println(gen.generateNumber(2));
    		System.out.println(gen.generateNumber(3));
    		System.out.println(gen.generateNumber(4));
    }
}

