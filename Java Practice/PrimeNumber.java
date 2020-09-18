import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args) {
        int num;
        int t=1;
            int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        num=in.nextInt();
        temp=num;
        if(num==0){
            System.out.println("The Number is Zero");
        }
        else{
            for(int i=1; i<num; i++){
                if(i==1){
                    continue;
                }
                temp=temp%i;
            }
            if(temp==0){
                System.out.println("The Number is Not Prime Number");
            }
            else{
                System.out.println("The Number is Prime Number");
            }
        }
    }
}