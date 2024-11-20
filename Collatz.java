// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		    // Start by writing a loop that prints one hailstone sequence only, for a given seed value (N)
			//nest this loop inside an outer loop that varies the seed from 1 to N
			
			int n = Integer.parseInt(args[0]);
			int counter = 0 ;
			int newN = 1 ;
			String s1 = args[1];

			// the short mode
			if (s1.equals("C") || s1.equals("c")){
				System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
			}

				//create a for loop that starts with the number 1 and goes over the numbers of n
				//and prints the steps until they reach 1
				//create a seperate condition for the time n == 1 since it will not enter the following while
				//condition that multiplies and divides the number according to the rules until the number reaches 1 again
			else{
			for (int i=1; i <= n; i++){
			
				newN = i;
				counter = 0 ;
				
				//make a condition for newN equales 1
				if (newN == 1) {
					
					System.out.print(newN + " ");
					newN = 4;
					counter = 1;
				}
				
					while (newN != 1){
						//print the number before changing it
						System.out.print(newN + " ");
						//if the number is even divide it by 2
						if (newN % 2 == 0){
							newN = newN/2 ; 	
						}
						else { //if the number is odd multiply it by 3 and add 1
							newN = ((newN*3) + 1);	
						}
						//add 1 to the counter of actions you did to newN
						counter++ ;
					}
					//once the number reaches 1 again it leaves the while loop so add 1 to the counter
					//print the number 1 and the counter of actions
					counter++ ;
					System.out.println( 1 + " (" + counter + ")");

			}
			

		}
		
		System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");

	}
		
	}


