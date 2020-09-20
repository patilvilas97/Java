import java.util.Scanner;
public class SortingOfArray {
    public static void main(){
        int size;
        int temp;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Size : ");
        size=in.nextInt();
        int array[]= new int[size];
        for(int i=0; i<size; i++){
            array[i]=in.nextInt();
        }
        for(i=0; i<size; i++){
            if(array[i]<array[i+1]){
                temp=array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            }
        }
        for(int j:array){
            System.out.print(j + " ");
        }
    }
}
