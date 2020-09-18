import java.util.Scanner;
class Rectangle{
    public static void main(String[] args) {
        double width;
        double height;
        double area;
        double perimeter;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Width of Rectangle : ");
        width=in.nextDouble();
        System.out.print("Enter the Height of Rectangle : ");
        height=in.nextDouble();
        area=width*height;
        perimeter=2*(width+height);
        System.out.println("The Area of Rectangle is : "+area );  
        System.out.println("The Perimeter of Rectangle is : "+perimeter );
    }
}