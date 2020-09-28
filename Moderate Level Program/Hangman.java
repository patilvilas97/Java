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
            System.out.print("Word : ");
            for(int i=0; i<str.length(); i++){
                System.out.print(letters[i]);
            }
            System.out.println();
            System.out.print("Enter a Letter : ");
            guess= in.next().charAt(0);
            for(int i=0; i<str.length(); i++){
                if(guess==word[i]){
                    letters[i]= guess;
                }
            }
            for (int k=0; k<str.length(); k++) {
                System.out.print(letters[k] + " ");
            }
            for(int i=0; i<str.length(); i++){
                if(word[i]==letters[i]);
                ctr++;
            }
            if(ctr==9){
                System.out.println("Congratulation You are a Winner !!");
            }
            // tried to print that u are a winner but not completed
            System.out.println();
            chances--;
        }while(chances!=0);
    }
}
