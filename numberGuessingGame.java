// Author : Rakesh Giri
// Description: In this game user should guess numbers 0 or 1. If the user is correct for first time then user gets 10 Points and user moves 
// to next Stage. In the next stage, points is increased by 10 and two numbers are increased by one i.e. numbers will be 0,1, and 2. The pattern
//  of score for each game play is 10,20,30,40, .... Score is 

import java.util.*;
class numberGuessingGame{
    
    //method to generate random number between firstNum and LastNum
    public static int generateRandomNumber(int num){
        Random rand = new Random();
        int randomNumber = rand.nextInt(num);
        return randomNumber;
    }
    
    //main
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int score = 0;
        int initPoint = 10;
        while(true){
            System.out.println("Guess the numbers between 0 and " + count + " : \n");
            int num = sc.nextInt();
            if(num<=count && num>=0){
                if(generateRandomNumber(count)==num){
                    count++;
                    score = score + initPoint;
                    initPoint = initPoint + 10;
                    System.out.println("* " + num + "- Correct.  Next Challenge: \n");
                }
                else{
                    System.out.println("* " + num + "-Incorrect. Your total score is: " + score);
                    break;
                }
            }
            else{
                System.out.println("You entred wrong number. Please choose correct number. \n");

            }
        }    
    }
}
