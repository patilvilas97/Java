import java.util.Scanner;
public class Carry{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        Carry obj = new Carry();
        int count = obj.NumberOfCarries(num1, num2);
        System.out.println(count);
    }   
    public int NumberOfCarries(int num1, int num2){
        int carry = 0;
        int count = 0;
        while(num1!=0 && num2!=0){
            int p = num1%10;
            int q = num2%10;
            int sum = p + q + carry;
            if(sum>9){
                carry = 1;
                count++;
            }
            else{
                carry=0;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return count;
    }
}