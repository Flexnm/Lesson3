package switchers;
// Switch
public class Example1 {
	public static void main(String[] args) {
		
		// switch between 1, 2, 3, 4
		int key = 3;
		
		switch(key) { // once a case is met, it will operate on that case and all the subsequent cases.
		case 1:
			System.out.println("One");
			break; // adding a break will cause the switch to stop operating on the subsequent cases.
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		}
		
		// switch between ON, OFF, STAND-BY
		String key2 = "STAND BY";
		
		switch(key2) {
		case "ON":
			System.out.println("Machine is on.");
			break;
		case "OFF":
			System.out.println("Machine is off.");
			break;
		case "STAND BY":
			System.out.println("Machine is on stand by.");
			break;
		}

				
		// switch between Red, Yellow, Green
		String key3 = "Yellow";
		
		switch(key3) {
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
