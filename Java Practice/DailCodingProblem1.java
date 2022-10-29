import java.util.Scanner;

public class DailCodingProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the size : ");
        int size = scan.nextInt();
        int numbers [] = new int[size];
        for(int i=0; i<numbers.length; i++){
            System.out.print("Please enter the number : ");
            numbers[i] = scan.nextInt();
        }
        System.out.print("Please enter the value : ");
        int key = scan.nextInt();
        for(int j = 0; j<numbers.length; j++){
            for(int k = 0; k<numbers.length; k++){
                if(numbers[i]+numbers[j] == key){
                    System.out.println("The numbers are : " + numbers[i] + " " + numbers[j]);
                }
            }
        }
    }
}
