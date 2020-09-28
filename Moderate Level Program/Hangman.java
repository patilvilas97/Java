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
            System.out.print("Predicted Word : ");
            for(int i=0; i<str.length(); i++){
                System.out.print(letters[i]);
            
            }
            System.out.println();
            System.out.print("User Guesses : ");
            for(int i=0; i<str.length(); i++){
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
                }
            }
            for(int i=0; i<str.length(); i++){
                for(int k=0; k<100; k++){
                    if(word[i]==guesses[k]){
                        System.out.println("Congratulation You are a Winner!!");
                        chances=1;
                    }
                }
            }
            // tried to print that u are a winner but not completed
            System.out.println();
            chances--;
        }while(chances!=0);
    }
}
