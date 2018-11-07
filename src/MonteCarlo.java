import java.util.*;

public class MonteCarlo{

    public static void main(String[] args){

        GameSimulator(10);

        //GameSimulator test = new GameSimulator(1);
        //GameSimulate(1000);
        //GameSimulate(1000000);

        //System.out.println();

    }
    public static void GameSimulator (int games){

        int totalBlack = 0;
        int urrentBlackStreak = 0;
        int maxBlackStreak = 0;
        int totalRed = 0;
        int currentRedStreak = 0;
        int maxRedStreak = 0;
        int totalGreen = 0;
        int currentGreenStreak = 0;
        int maxGreenStreak = 0;

        String[] rouletteNumbers = new String[37];

        for(int i = 0; i < rouletteNumbers.length; i++){
            if (i % 2 == 0)
            {
                rouletteNumbers[i] = "Red";
            }
            else{

                rouletteNumbers[i] = "Black";
            }

        //System.out.print(rouletteNumbers[i]);

        for(int ){

        }
        /*
        int blackTotal = 0;
        int blackCurrentStreak = 0;
        int blackMaxStreak = 0;
        int redTotal = 0;
        int redCurrentStreak = 0;
        int redMaxStreak = 0;
        int greenTotal = 0;
        int greenCurrentStreak = 0;
        int greenMaxStreak = 0;

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
                }
            }
            if (if red) {
                Do same as black
            }
            if (if green) {
                Do same as black
            }
        Print results;
        }
         */
    }
}