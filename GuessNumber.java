package TASK2;

import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int lowerlimit = 1;
        int upperlimit = 100;
        int totalRounds = 3;
        int maxAttempts = 8;
        int finalScore = 0;

        System.out.println("Welcome to the guessing game!");
        System.out.println("You have to guess the number between "+ lowerlimit + "and "+ upperlimit);
        System.out.println("You have "+ maxAttempts +" attempts per round and "+totalRounds +" rounds in total.\n");

        for(int round=1;round<=totalRounds; round++){
            System.out.println("******** ROUND "+ round +" ********");

            int numberToGuess = r.nextInt(upperlimit - lowerlimit +1)+lowerlimit;
            int attempts = 0;
            boolean hasGuessedCorrect = false;



            while(attempts < maxAttempts){
                System.out.print("Enter your guess: ");
                int yourGuess = sc.nextInt();
                attempts++;

                if(yourGuess == numberToGuess){
                    hasGuessedCorrect = true;
                    break;
                }
                else if(yourGuess < numberToGuess){
                    System.out.println("Too low! Try again");
                }
                else{
                    System.out.println("Too high! Try again" );
                }  
            }

            if(hasGuessedCorrect){
                int score = (maxAttempts - attempts + 1)*10;
                finalScore += score;
                System.out.println("You guessed the correct number in "+ attempts +" attempts");
                System.out.println("Your score for this round: "+ score+"\n");
            }
            else{
                System.out.println("Out of attempts! The correct number was: "+numberToGuess);
                System.out.println("Your score for this round: 0\n");
            }
        }

        System.out.println("******** GAME FINISH ********");
        System.out.println("Your total score after "+ totalRounds + " rounds is: "+ finalScore);

        if(finalScore > 100){
            System.out.println("Excellent! You guess the number too quickly. You are a Pro player.");
        }
        else if(finalScore >= 75){
            System.out.println("Good! You are average in guessing the number.");
        }
        else{
            System.out.println("Keep practicing! you will get better after practicing.");
        }

        sc.close();


    
    }
        
    
   
    


    
}