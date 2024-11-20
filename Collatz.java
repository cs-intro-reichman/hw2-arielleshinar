// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		    // Start by writing a loop that prints one hailstone sequence only, for a given seed value (N)
			//nest this loop inside an outer loop that varies the seed from 1 to N
			
			int n = Integer.parseInt(args[0]);
			int counter = 0 ;
			int newN = 0 ;
			int count1 = 0;

		//create a for loop that starts with the number 1 and goes over the numbers of n
		//and prints the steps until they reach 1
		//create a seperate condition for the time n == 1 since it will not enter the following while
		//condition that multiplies and divides the number according to the rules until the number reaches 1 again
		
		for (int i=1; i <= n; i++){
			
			
			counter = 0 ;
			
			if (i == 1) {
				count1 ++;
				newN = 1;
				while (count1 < 2){
				if (newN % 2 == 0){
					newN = newN/2 ; 
				}
				else {
					newN = ((n*3) + 1);	
				}
				//after each modification to newN add 1 to the counter
				counter++ ;
				//check to see if newN reached 1 again , if so add 1 to count1 to exit the loop
				if (newN == 1){
					count1 ++;
				}
				System.out.print(newN + " ");
				}
				//System.out.println(" (" + counter + ")");
			
			}
			else {
				while (i != 1){
					
					if (newN % 2 == 0){
						newN = newN/2 ; 	
					}
					else {
						newN = ((n*3) + 1);	
					}

					counter++ ;
					System.out.print(newN + " ");
				}
			}
			
			System.out.println("(" + counter + ")");
		}

	}
		
	}

