/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1b;

/**
 *
 * @author Portatil
 */
public class Problema1b {
    public static void main(String[] args) {
        java.util.Scanner get = new java.util.Scanner(System.in);
        
        char playAgain = 'y';
        while (playAgain=='y'){
            GuessingGame();
            System.out.println("Would you like to play another game(y/n):" );
            playAgain = get.next().charAt(0);
        }
        
    }

    public static void GuessingGame(){
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        int answer = (int) Math.floor((Math.random()*100)+1);
        int guess = 0;
        int numGuesses =1;
        
        while (numGuesses < 7 && guess != answer){
            System.out.println("Guess a number");
            guess=teclado.nextInt();
            if(guess<answer){
                System.out.println("Higher...");
            }
            else{
                if (guess>answer){
                    System.out.println("Lower...");
                }
                else{
                    System.out.println("You win");
                }
            }
            numGuesses=numGuesses+1;
        }
        if(numGuesses==7){
            System.out.println("You loser");
        }
    }
}
    
    

