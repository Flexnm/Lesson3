package ifelses;

// Examples of "if else" - If the condition is met, do something. If the condition isn't met, do something ELSE.
public class Example1 {

	public static void main(String[] args) {

		int x = (int) (Math.random() * 11);
		System.out.println(x);

		if (x <= 5) {
			System.out.println("Small");
		} else {
			System.out.println("Big");
		}
	}
}
