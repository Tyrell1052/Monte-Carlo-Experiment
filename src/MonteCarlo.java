import java.util.Random;

public class MonteCarlo{

    public static void main(String[] args) {

        // number min and max
        //int max = 37;
        //int min = 1;

        int numberSpins = 0;
        int totalBlack = 0;
        int currentBlackStreak = 0;
        int maxBlackStreak = 0;
        int totalRed = 0;
        int currentRedStreak = 0;
        int maxRedStreak = 0;
        int totalGreen = 0;
        int currentGreenStreak = 0;
        int maxGreenStreak = 0;


        Random randomNum = new Random();
        int count = 0;
        while (count <= 100){

            count = randomNum.nextInt(36) + 1;
            System.out.println(count);
        count ++;

        }


        String[] rouletteNumbers = new String[37];

        for(int i = 0; i < rouletteNumbers.length; i++) {
            if (i % 2 == 0) {
                rouletteNumbers[i] = "Black";
                totalBlack ++ ;
                //System.out.println(totalBlack);

            } else {

                rouletteNumbers[i] = "Red";
                totalRed ++;
                //System.out.println(totalRed);
            }

            //System.out.println(rouletteNumbers[i]);


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

         */