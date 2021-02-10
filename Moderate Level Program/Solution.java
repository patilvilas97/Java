import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        System.out.println("please Enter the Number of Testcases : ");
        int testcases = in.nextInt();
        Scanner in = new Scanner(System.in);
        while(testcases>0){
            int max = 0;
            int price = 0;
            int size;
            System.out.println("Please Enter the list of Price of chocklates : ");
            size = in.nextInt();
            int A[] = new int [size];
            for(int i=0; i<A.length; i++){
                System.out.print("Please Enter the Amount of Chocklates : ");
                A[i] = in.nextInt();
                if(A[i]>max){
                    max=A[i];
                }
            }
            for(int j=0; j<A.length; j++){
                if(max==A[j]){
                    continue;
                }
                else{
                    price+=A[j];
                }
            }
            System.out.println("The Minimum Amount Payable is : " + price);    
            testcases--;
        }
    }
}