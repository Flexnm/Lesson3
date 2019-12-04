package loopsExamples;

public class DoWhileLoops {
	public static void main(String[] args) {

		// Regular while loop:
		int c = 1;
		while (c <= 5) { // while loops pre-test their condition. Minimum iterations: 0.
			System.out.println(c);
			c++;
		}
		
		
		System.out.println("\n" + "===============" + "\n");
		
		c = 1;
		do {
			System.out.println(c);
			c++;
		} while (c <= 5); // dowhile loops post-test their condition. They operate and then test for
							// validity of the condition. Minimum iterations: 1.

	}

}
