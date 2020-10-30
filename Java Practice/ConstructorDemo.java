
public class ConstructorDemo{
    public static void main(String[] args){
        Demo obj1 = new Demo(1);
        Demo obj2 = new Demo(2);
        Demo obj3 = new Demo(3);
        Demo obj4 = new Demo(4);
        Demo obj5 = new Demo(5);
        Demo obj6 = new Demo(6);
        Demo obj7 = new Demo(7);
        Demo obj8 = new Demo(8);
        Demo obj9 = new Demo(9);
        System.out.println(obj1.salary);
        System.out.println(obj2.salary);
        System.out.println(obj3.salary);
        System.out.println(obj4.salary);
        System.out.println(obj5.salary);
        System.out.println(obj6.salary);
        System.out.println(obj7.salary);
        System.out.println(obj8.salary);
        System.out.println(obj9.salary);
        
    }
}
class Demo{
    int salary;
    public Demo(int n){
        salary=n;
    }
    
}