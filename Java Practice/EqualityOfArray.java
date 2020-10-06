import java.util.Scanner;
class EqualityOfArray{
    public static void main(String[] args){
        int ctr=0;
        int array1 []= {5, 4, 3, 2, 1};
        int array2 []={5, 4, 3, 2, 1};
        for(int i=0; i<5; i++){
            if(array1[i]==array2[i]){
                ctr++;
            }
        }
        if(ctr==5){
            System.out.print("The Two Arrays are Equal");
        }
        else{
            System.out.print("The Two Arrays are Not Equal");
        }
    }
}
