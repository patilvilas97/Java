// Hangman Code.
import java.util.Scanner;
import java.util.*;
public class Hangman {
    public static void main(String[] args) {
        String str = "elephant";
        char guess;
        int ctr=0;
        int chances=str.length();
        Scanner in = new Scanner(System.in);
        char word [] = str.toCharArray();                           //Array to Store the Original Word or Question word
        char guesses [] = new char [100];                           //Array to Store the User Gusses
        char letters [] = new char [str.length()];                  //Array to Show after the user guesses
        for(int i=0; i<str.length(); i++){
            letters[i]= '-';
        }
        System.out.println("Welcome to the Game");
        do{
            boolean chanceCheck=false;
            System.out.println("Your Chances are " + chances);
            System.out.print("Predicted Word : ");
            for(int i=0; i<str.length(); i++){
                System.out.print(letters[i]);
            
            }
            System.out.println();
            System.out.print("User Guesses : ");
            for(int i=0; i<100; i++){
                System.out.print(guesses[i] + " ");
            }
            System.out.println();
            System.out.print("Enter a Letter : ");
            guess= in.next().charAt(0);
            guesses[ctr]=guess;
            ctr++;
            for(int i=0; i<str.length(); i++){
                if(guess==word[i]){
                    letters[i]= guess;
                    chanceCheck = true;
                }
            }
            System.out.println(str);
            System.out.println(String.valueOf(letters));
            // boolean count = (String.valueOf(letters) == str);
            if(chanceCheck == false){
                chances--;
            }
            if(String.valueOf(letters) == str){
                System.out.println("Hurray! You Won!");
                chances = 0;
            }
            // System.out.println(count);
            // tried to print that u are a winner but not completed
            // Not Ready yet
            System.out.println();
        }while(chances!=0);
    }
}
