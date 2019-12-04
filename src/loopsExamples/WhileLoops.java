package loopsExamples;

import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {

		int c = 1;

		// While loop.
		while (c <= 3) {
			System.out.println(c);
			c++;

		}
		System.out.println("===============");

		// Write a loop that prints the numbers 5 to 15.
		int a = 5; // c can still be used by writing: c = 5; as it will change the value of c.
		while (a <= 15) {
			System.out.println(a);
			a++;
		}
		System.out.println("===============");

		// Print all even numbers from 0 to 10
		a = 0;
		while (a <= 10) {
			System.out.println(a);
			a += 2;
		}
		System.out.println("===============");

		// Print all numbers from 25 to 300 that are divided by 5 and 3 and 7 all
		// together.
		a = 25;
		while (a <= 300) {
			if (a % 5 == 0 && a % 3 == 0 && a % 7 == 0) {
				System.out.println(a);
			}
			a++;
		}
		System.out.println("===============");

		// Get an even number from the user, if the user types in an odd number keep
		// asking for even number until you get it from the user.
		Scanner even = new Scanner(System.in); // Creating a scanner.
		System.out.print("Even number please: ");
		int input = even.nextInt(); // Asking for input.

		while (input % 2 != 0) {
			System.out.println("Dude...");
			System.out.print("Even number please: ");
			input = even.nextInt(); // Asking for input.
		}
		even.close(); // Closing the scanner.
		System.out.println("Finally.... You entered: " + input);
		

	}
}
