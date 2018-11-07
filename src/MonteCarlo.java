import java.util.Random;

public class MonteCarlo {

    public static void main(String[] args) {


        // setting variables

        // variable for the random number

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
        int randomNumber;
        int count = 0; // setting sound to 0
        while (count <= 10) { // while logic for conditional statement
            //int randomNumber;
            randomNumber = randomNum.nextInt(37);// this will choose random number between 0 and 36
            //if statement to determine is the number is odd or even and add
            if (randomNumber == 0) {// if statement for landing on Green
                totalGreen++;
                count++;
                continue;
            }

            if (randomNumber % 2 == 0) {
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28){
                    totalBlack++;
                    count++;
                }
                else
                {
                    totalRed++;
                    count++;
                }
            }else{
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28) {
                    totalRed++;
                    count++;
                }
                else
                {
                    totalBlack++;
                    count++;
                }
            }
            // if statement for the max streak of odds and evens
            if (randomNumber % 2 == 0){

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
        System.out.println("The total number of times a red number appeared:" + totalRed);
        System.out.println("The total number of times a black number appeared:" + totalBlack);
        System.out.println("The total number of times a green number appeared.:" + totalGreen);
        System.out.println("The longest streak of even numbers:" + maxEvenStreak);
        System.out.println("The longest streak of odd numbers:" + maxOddStreak);
    }
}

