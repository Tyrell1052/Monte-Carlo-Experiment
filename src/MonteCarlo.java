import java.util.Random;

public class MonteCarlo {

    public static void main(String[] args) {


        // setting variables

        // variable for the random number
        int randomNumber = 0;

        // total black, red and green
        int totalBlack = 0;
        int totalRed = 0;
        int totalGreen = 0;
        // variables for odds and evens
        int currentEvenCount = 0;
        int maxEvenStreak = 0;
        int currentOddCount = 0;
        int maxOddStreak = 0;


        // using random class to generate the random numbers
        Random randomNum = new Random();
        int count = 0; // setting sound to 0
        while (count <= 100) { // while logic for conditional statement
            randomNumber = randomNum.nextInt(37);// this will choose random number between 0 and 36

            if (randomNumber == 0) {// if statement for landing on Green
                totalGreen++;
                count++;
                continue;
            }

            if (randomNumber % 2 == 0) {
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28){
                    totalBlack++;
                }
                else
                {
                    totalRed++;
                }
            }else{
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28) {
                    totalRed++;
                }
                else
                {
                    totalBlack++;
                }
            }

            //System.out.println(randomNumber);
            //count++;// adds 1 to the count at the end of the while loop
            if (randomNumber % 2 == 0);{

                currentEvenCount++;

                if (currentEvenCount > maxEvenStreak) {
                    maxEvenStreak = currentEvenCount;

                }
                else
                {
                    currentOddCount = 0;
                }

            }else{

                currentOddCount++;
                if (currentOddCount > maxOddStreak) {
                    maxOddStreak = currentOddCount;
                }
                else
                {
                    currentEvenCount = 0;
                }


            }


        }
    }
}




 /*

        for (int i=1; i <= spins; i++){

            int randomNumber = Generate Random number from 0 - whatever;
            if (if black){
                blackTotal += 1;
                blackCurrentStreak += 1;
                if (redCurrentStreak > redMaxStreak){
                    redMaxStreak = redCurrentStreak;
                    redCurrentStreak = 0;
                }
                else {
                    reset current streak;
                }
                if (greenCurrentStreak < greenMaxStreak){
                    Do same thing as red did

               -------------------------
                    String[] rouletteNumbers = new String[37];

        for(int i = 0; i < rouletteNumbers.length; i++) {
            if (i % 2 == 0) {
                rouletteNumbers[i] = "Red";
            } else {

                rouletteNumbers[i] = "Black";
            }

            System.out.println(rouletteNumbers[i]);

--------------------------------------------------------------------
String[] rouletteNumbers = new String[37]; // creating empty string with a total of 37 indexes

        for(int i = 0; i < rouletteNumbers.length; i++) {//this sets i to 0 - the for loop will,
            //count from i to the length of rouletteNumbers
            if (i % 2 == 0) { // this will determine if the number is odd or even by using modulus division
                rouletteNumbers[i] = "Black";// if even set the the sting "Black"
                totalBlack ++ ; // add 1 to the totalBlack variable
                //System.out.println(totalBlack);

            } else {

                rouletteNumbers[i] = "Red";// if even set the the sting "Red"
                totalRed ++;// add 1 to the totalRed variable
                //System.out.println(totalRed);
            }

            //System.out.println(rouletteNumbers[i]);


        }

         */

