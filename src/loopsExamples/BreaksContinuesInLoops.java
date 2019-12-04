package loopsExamples;

public class BreaksContinuesInLoops {
	public static void main(String[] args) {
		
	/**	int c = 1;
		
		while(true) {
			System.out.println(c + " Hello.");
			if(c==5) {
				break; // Stops the loop.
			}
			c = (int)(Math.random()*11);
		}
	*/	
		
		for(int i = 1; i <= 20; i++) {
			if(i == 10) {
				continue; // Skip iteration.
			}
			System.out.print(i + ", ");
		}
		
	}

}
