package castingDemo;

public class castDemo {
	// Errors are due to the nature of this class as being an example only.
	// More casting examples.
	
	public static void main(String[] args) {
		
		int x = 100; // x is 32 bit
		
		// Convert the value of x to type short. Meaning, converting a 32 bit number to 16 bit.
		short y = (short) x; // Explicit casting. y is 16 bit.
		
		// Convert the value of x to type long. Meaning, converting a 32 bit number to 64 bit.
		long z = x; // Implicit casting. z is 64 bit.
		
		
		
	}
}
