import java.util.Random;

public class MonteCarloOneMil {
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
        while (count <= 999999) { // 999,999 is set for the max count because to count the 0 index would make 1,000,000 total spins.
            //this number also matches the totals of adding the occurrences in each of the five outputs.
            //int randomNumber;
            randomNumber = randomNum.nextInt(37);// this will choose random number between 0 and 36
            //if statement to determine is the number is odd or even
            if (randomNumber == 0) {// if statement for landing on Green
                totalGreen++;//increase green by 1
                count++;//increase count by 1
                continue;
            }

            if (randomNumber % 2 == 0) {// this will determine if the number is even or odd by using remainder division
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28){
                    totalBlack++;//increase black by 1
                    count++;//increase count by 1
                }
                else
                {
                    totalRed++;//increase red by 1
                    count++;//increase count by 1
                }
            }else{
                if (randomNumber >= 1 && randomNumber <= 10 || randomNumber >= 19 && randomNumber <= 28) {
                    totalRed++;//increase red by 1
                    count++;//increase count by 1
                }
                else
                {
                    totalBlack++;//increase black by 1
                    count++;//increase count by 1
                }
            }
            // if statement for the max streak of odds and evens
            if (randomNumber % 2 == 0){

                currentEvenCount++;

                if (currentEvenCount > maxEvenStreak) {
                    maxEvenStreak = currentEvenCount;
                    count++;//increase count by 1

                }
                else
                {
                    currentOddCount = 0;
                    count++;//increase count by 1
                }

            }else{

                currentOddCount++;
                if (currentOddCount > maxOddStreak) {
                    maxOddStreak = currentOddCount;
                    count++;//increase count by 1
                }
                else
                {
                    currentEvenCount = 0;
                    count++;//increase count by 1
                }


            }


        }
        // Printing results of the simulation
        System.out.println("The total number of times a red number appeared:" + totalRed);
        System.out.println("The total number of times a black number appeared:" + totalBlack);
        System.out.println("The total number of times a green number appeared.:" + totalGreen);
        System.out.println("The longest streak of even numbers:" + maxEvenStreak);
        System.out.println("The longest streak of odd numbers:" + maxOddStreak);
    }
}
