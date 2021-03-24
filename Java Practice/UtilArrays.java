import java.util.Scanner;
import java.util.Arrays;
public class UtilArrays{
    public static void main(String[] args) {
        int numbers [] = {10, 55, 89, 56, 78, 8};
        for (int i : numbers) {
            System.out.println(i);
        }
        Arrays.sort(numbers);
        for (int k : numbers) {
            System.out.println(k);
        }
    }
}