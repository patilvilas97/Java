class Calculator{
	int num1;
	int num2;
	int result;
	public void operation(){
		result=num1+num2;
	}
}
class Demo{
	public static void main(String[] args){
		Calculator obj = new Calculator();
		obj.num1=3;
		obj.num2=5;
		obj.operation();
		System.out.print( obj.result );
	}
}
