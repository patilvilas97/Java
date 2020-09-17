class calculator{
	int num1;
	int num2;
	int result;
	public void operation(){
		result=num1+num2;
	}
}
class Demo{
	public static void main(String[] args){
		calculator obj= new calculator();
		calculator.obj.num1=10;
		calculator.obj.num2=20;
		operation();
		System.out.print( result );
	}
}