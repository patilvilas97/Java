
import java.util.Scanner;
public class Assignment{
    public double radius;
    public Assignment(double radius){
        this.radius = radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Assignment A1 = new Assignment(sc.nextDouble());
        double surface = A1.surfaceOfSphere();
        double volume = A1.volumeOfSpehere();
        System.out.println(surface);
        System.out.println(volume);
    }
    public double volumeOfSpehere(){
        double volume = (Math.PI*radius*radius*4)/3;
        return volume;
    }
    public double surfaceOfSphere(){
        double surface = 4*Math.PI*radius*radius;
        return surface;
    }
}