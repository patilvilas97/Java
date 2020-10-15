import java.util.Scanner;
class ReverseAArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size;
        System.out.print("Enter the Size : ");
        size=in.nextInt();
        int testarray1[]= new int[size];
        for(int i=0; i<size; i++){
            System.out.print("Enter the Element : ");
            testarray1[i]=in.nextInt();
        }
         System.out.print("Before Reverse Order : ");
        for(int k : testarray1){
            System.out.print(k + " ");
        }
        System.out.println();
        System.out.print("Reverse Order : ");
        for(int i=4; i>=0; i--){
            System.out.print(testarray1[i] + " ");

        }
    }
}