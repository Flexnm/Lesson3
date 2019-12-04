package switchers;

import java.util.Scanner;

public class Example2 {
	
	public static void main(String[] args) {
		
		Scanner lightsc = new Scanner(System.in);
		System.out.println("Choose between: Red, Yellow or Green.");
		String light = lightsc.nextLine(); // Setting light to have the value of the user input.
		lightsc.close(); // Important to remember to close the scanner.
		
		
		
		// The switch
		switch(light) { // The switch is operating on the given input.
		case "Red":
			System.out.println("Stop");
			break;
		case "Yellow":
			System.out.println("Stand by, but actually probably start driving, yeh.");
			break;
		case "Green":
			System.out.println("Go");
			break;
		}
	}

}
