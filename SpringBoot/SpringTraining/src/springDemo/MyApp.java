package springDemo;

public class MyApp {

	public static void main(String[] args) {
		
		//Create the Object
		Coach theCoach = new BaseballCoach();
		
		//use the Object
		System.out.println(theCoach.getDailyWorkout());

	}

}
