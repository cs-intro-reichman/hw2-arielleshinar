// Tests the distribution generated by Java's Math.random() function.
public  class  TestRandom {
	public static void main(String[]  args) {
	    // create a veriable that get the input from the user
		double n = Integer.parseInt(args[0]);
		
		//create a veriable that holds the number that was generated and variables for counting
		double random = 0;
		int bigger = 0;
		int smaller = 0;

		//loop that generates random numbers the amounts of times that was inputed 
		//and counts how many times they were bigger or smaller than 0.5
		for (int i=0; i < n; i++) {
			random = Math.random();
			if (random > 0.5){
				bigger ++;
			}
			else {
				smaller ++;
			}

		}

		// an if condition the checks if one of the options counts is 0 if it is it just prints how many times each happend
		//if neither is equal to 0 it calculates the ratio and prints it out
		if (smaller != 0) {
			if( bigger != 0){
				double ratio = ( (double) bigger / smaller );

				System.out.println("> 0.5:  " + bigger + " times");
				System.out.println("<= 0.5: " + smaller + " times");
				System.out.println("Ratio:  " + ratio);
			}

		}
		else{
			System.out.println("> 0.5:  " + bigger + " times");
			System.out.println("<= 0.5: " + smaller + " times");
		}
	}
}
