public class MiddleOfWord {
	public static void main(String[] args) {
	String evenWord = "cake";
	String oddWord = "pie";
	
	System.out.println(getMiddle(evenWord));
	//prints "ak"
	
	System.out.println(getMiddle(oddWord));
	//prints "i"
		
	}
	
	public static String getMiddle(String word) {
		//Get the length of the word and the middle index
		int length = word.length();
		int mid = word.length()/2;
		
		//If word's length is even
		if(length % 2 == 0) {
			return word.substring(mid - 1, mid + 1);
		}else {
			return word.substring(mid, mid + 1);
		}
	}
}
