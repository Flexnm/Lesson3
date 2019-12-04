package ifs;

import java.util.Scanner; // This is required to use the Scanner object. Type "Scanner" and then use ctrl + space.

public class Example2 {
	public static void main(String[] args) {
		// For the input we will import a value.
		// The operation for importing we use a Scanner (object).
		
		Scanner sc = new Scanner(System.in); // System.in is the default input - from the keyboard.
		// Resource leak error warns about the Scanner object not being closed:
		System.out.print("Type a number: ");
		
		// Get the input from the user.
		int x = sc.nextInt(); // nextInt() takes the number that is typed by the user and saves it in a value (in this case saves it in x).
		
		// Print the user's input.
		System.out.println(x);
		
		sc.close(); // Stops the specified Scanner object's function: tells the program to not take any more input from THIS scanner.
		
		// If x is larger than 100: print BIG.
		if (x > 100) {
			System.out.println("BIG");
			
			
		}
		
	}
}
