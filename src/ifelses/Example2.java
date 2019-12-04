package ifelses;

// More advanced ifelse.
public class Example2 {
	public static void main(String[] args) {

		int grade = (int) (Math.random() * 121); // x is a random number between 0 and 120.
		System.out.println("Your grade: " + grade);

		// Express the grade with text
		// 0 - 54 (inclusive): print Failed
		// 55 - 65 (inclusive): print Enough
		// 66 - 75 (inclusive): print Good
		// 76 - 85 (inclusive): print Very Good
		// 86 - 100 (inclusive): print Great
		// Other value is illegal
		
		// "if" and "else if" lines check if x meets a certain condition: does it fall in a specific grade range.
		if (grade >= 0 && grade <= 54) {
			System.out.println("Failed");
		} else if (grade >= 55 && grade <= 65) {
			System.out.println("Enough");
		} else if (grade >= 66 && grade <= 75) {
			System.out.println("Good");
		} else if (grade >= 76 && grade <= 85) {
			System.out.println("Very Good");
		} else if (grade >= 86 && grade <= 100) {
			System.out.println("Great");
		} else {
			System.out.println(grade + " is an illegal grade");
		}
	}
}
