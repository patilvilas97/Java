import java.util.Scanner;
import java.util.Arrays;
public class ArraysBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the Size : ");
        int size = scan.nextInt();
        int numbers [] = new int [size];
        for(int i=0; i<size; i++){
            System.out.print("Please enter the number : ");
            numbers[i] = scan.nextInt();
        }
        System.out.print("Before Sorting : ");
        for (int k : numbers) {
            System.out.print(k + " ");
        }
        Arrays.sort(numbers);
        System.out.println();
        System.out.print("After Sorting : ");
        for (int j : numbers) {
            System.out.print(j + " ");
        }
        int key = Arrays.binarySearch(numbers, 5);
        System.out.println(key);
    }
}
