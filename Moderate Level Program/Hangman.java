// Hangman Code.
import java.util.Scanner;
import java.util.*;
public class Hangman {
    public static void main(String[] args) {
        String str = "elephant";
        char guess;
        int chances=str.length();
        do{
            Scanner in = new Scanner(System.in);
            char word [] = str.toCharArray();
            char letters [] = new char [str.length()];
            char guesses [] = new char [100];
            System.out.print("Welcome to the Game");
            System.out.println();
            System.out.print("Word : ");
            for(int i=0; i<str.length(); i++){
                letters[i]= '-';
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
            chances--;
        }while(chances!=0);
    }
}
