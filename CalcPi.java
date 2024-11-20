// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // create a veriable that will get an input

		int num = Integer.parseInt(args[0]);
		
		double sum = 0;
		double n = 1.0 ;
		//create an if loop that makes sure the input ist zero 
		
			//create a for loop that checks how big the number inputted is and adds
			// or subtracts to the calculation 

			for (int i = 0; i <= num; i++){
				
				
					sum += (n/((2*i)+1));	
					n *= -1;
				
				}
			
		//print the following:
		//pi according to Java: 3.141592653589793
       // pi, approximated:     result
	   double result = (sum *4.0) ;
	    
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + result); 
			}
	}
	


