import java.util.Scanner;
class DuplicateElements{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Number of Elements : ");
        int size = in.nextInt();
        int ctr=0;
        int testarray[] = new int [size];
        int temparray[] = new int [size];
        int finalarray[] = new int [size];
        for(int i=0; i<size; i++){
            System.out.print("Enter Element " + i + " : ");
            testarray[i] = in.nextInt();
            temparray[i] = testarray[i];
        }
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(i==j){
                    continue;
                }
                else if(testarray[i]==temparray[j]){
                    finalarray[ctr]=testarray[i];
                    ctr++;
                }
            }
        }
        if(ctr==0){
            System.out.print("There are no Duplicate Elements");
        }
        else{
            System.out.print("The Duplicate elements are : ");
            for (int i=0; i<ctr; ) {
                System.out.print(finalarray[i] + " ");
                i=+2;
            }
        }
    }
}