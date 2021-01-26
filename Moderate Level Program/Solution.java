import java.util.Scanner;
class Solution{
    public static void main(String[] args){
        int testcases=2;
        Scanner in = new Scanner(System.in);
        while(testcases>0){
            int max = 0;
            int price = 0;
            int A[] = new int [4];
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