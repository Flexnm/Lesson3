package loopsExamples;

public class ForLoops {
	public static void main(String[] args) {

		// for (Start value of the counter; The condition; The change) {Loop block}
		// For each loop the counter is set in the loop itself, it does not exist
		// outside of the loop unless it was defined before the loop itself.
		for (int c = 1; c <= 10; c++) {
			System.out.println(c);
		}
		
		for (char c = 'A'; c <= 'Z'; c++) {
			System.out.println(c);
		}
		
		
	}

}
