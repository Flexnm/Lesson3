package ifs;

public class Example1 {
	public static void main(String[] args) {

		int x = (int) (Math.random() * 11); // Randomize a number between 1 to 10
		System.out.println(x);

		// if x is larger than 5 print BIG.
		if (x > 5) {
			System.out.println("BIG");

		}
		System.out.println("=== END OF PROGRAM ===");
	}
}
