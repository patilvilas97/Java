package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// Load the Spring Config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach theCoach1 = context.getBean(Coach.class);
		
		//call methods on them
		System.out.println(theCoach1.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
