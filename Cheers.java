// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // The Cheers program gets two inputs: a string and a non-negative 
            //integer value, and prints a crowd cheering output
            //If the inputted letter is one of the letters, (AEFHILMNORSX), the program prints "an" instead of "a"
                // test with string.indexOf(ch)
                //The inputted letters can be either lowercase, or uppercase. The outputted letters must be uppercase
                //Convert the inputted text to upper case just after inputting it.

         //create 2 veriables that contain 2 command line inputs
         String name = "" + args[0];
         int num = Integer.parseInt(args[1]);
        
         //create a string of all the conditioned letters
         String vowels = "AEFHILMNORSX" ;
         String capABC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
         String lowerABC = "abcdefghijklmnopqrstuvwxyz";
         //create an empty string to turn the string into all caps letters and a final string for all of the changes
         String capsName = "";
         
         //create a for loops that goes over the inputed string and checks if its in capital letters 
         //if it is it stays the same
         //if its not it checks its location in the alphabet and gets the capital letter in the same 
         //spot in the capital letter alphabet
                for (int i = 0; i < name.length(); i++){

                        char c = name.charAt(i);
                        if (lowerABC.indexOf(c) == -1){

                                capsName += c;
                                
                        }
                        else {
                                int location = lowerABC.indexOf(c);
                                capsName += capABC.charAt(location);

                        }               

                }

                //create a for loop that goes over the name and prints the sentence with each letter
                //create a condition that if the letter in the word is one of the special letter print an instead of a
                for (int i=0; i < capsName.length(); i++){
                        char v = capsName.charAt(i);
                        if (vowels.indexOf(v) == -1){
                                System.out.println("Give me a  " + capsName.charAt(i) + ": " + capsName.charAt(i) + "!");     
                        }
                        else{
                                System.out.println("Give me an " + capsName.charAt(i) + ": " + capsName.charAt(i) + "!");     

                        }    
                }

                System.out.println("What does that spell?");

                //create a for loop that prints the name that amount of times that was inputted 
                for (int i = 0; i < num ; i++){
                System.out.println(capsName + "!!!");
                }
        }
}
