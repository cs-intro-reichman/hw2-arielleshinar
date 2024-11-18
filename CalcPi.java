// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // create a veriable that will get an input

		int num = Integer.parseInt(args[0]);

		double divider = 3.0;
		int i;
		//double calc = (1 - (1 / divider));
		//System.out.print(calc);
		double calc = 1.0;
		//create an if loop that makes sure the input ist zero 
			if (num == 0){

				System.out.println("pi according to Java: " + Math.PI);
				System.out.println("pi, approximated:     " + 0); 
			}
			else {
			//create a for loop that checks how big the number inputted is and adds
			// or subtracts to the calculation according to wether the i count is even or odd
			for (i = 1; i <= num; i++){

				//calc = (calc - (1 / divider));
				// System.out.print(" - " + (1 / divider));
				
				if (i % 2 != 0){
					calc -= (1/divider);
					//System.out.print(" + " + (1 / divider) );

				}
				else {
				calc += (1/divider);	
				// System.out.print(" - " + (1 / divider));
				}
				divider += 2 ;
				

				
			}
		System.out.println(divider);
		//}
		//print the following:
		//pi according to Java: 3.141592653589793
       // pi, approximated:     3.140592653839794
	   double result = (calc*4.0) ;
	    
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + result); 
		//System.out.println(10%2);
	}
	}
}

