public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code

        //hh:mm  & minutesToAdd input 
        //time + minutestoadd and prints the resaulting time by 24 hours hh:mm
        //example 10:30 +4055 minutes is 06:05
        // total minutes
        //midnight is 00:00
        //output rules are the same as input rules
        
        
		// by the single command-line string argument args[0]. 
		// The following statement handles the hours part of the input.
		// It concatenates the empty string "" with the leftmost hour-digit. 
		// It then concatenates the resulting string with the rightmost hour-digit,
		// and then uses parseInt to cast the resulting string as an int.
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int newHours = 0;
        int newMinutes = 0;
        /*
        Total minutes = (10 hours * 60 minutes) + 30 minutes + 4055 minutes = 4685 minutes; 
        Total hours = 4685 / 60 = 78;
        New hours = 78 % 24 = 6; // The remainder operator % is also known as modulo 
        New minutes = 4685 – (78 * 60) = 5;
        Therefore the answer is 06:05. */

        //creating integers to hold my calculation
        int totalMinutes = 0;
        int totalHours = 0;
       //to get the total minutes i need to multiply my hours by 60 to get the minutes and add to the minutes and minutes to add
        totalMinutes = (hours * 60) + minutes + minutesToAdd;
        //to get the total hours i need to tel the new total og minutes and divide it by 60
        totalHours = totalMinutes / 60 ;
       //to get the new digit of the hour i need to get the residue from dividing the total hours by 24 hours
        newHours = totalHours % 24 ;
        //to get the total minutes i need to subtract the total hours from the total minutes
        newMinutes = totalMinutes - (totalHours * 60);

        //System.out.println("Hours: " + hours);
        //System.out.println("Minutes: " + minutes);
        //System.out.println("Minutes to add: " + minutesToAdd);
        //System.out.println("New hours: " + newHours);
        //System.out.println("New minutes: " + newMinutes);


        if (newHours < 10){
            System.out.print("0" + newHours);
        }
        else {
            System.out.print(newHours);
        }
        if (newMinutes <10){
            System.out.println(":0" + newMinutes);
        }
        else {
            System.out.println(":" + newMinutes);
        }

    }
}
