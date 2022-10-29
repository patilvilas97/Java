package springDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseballCoach implements Coach{
	
	@Override
	@Bean
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
}
