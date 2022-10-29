package com.training.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(value="/welcome")
	public String HelloWorld() {
		return "Hello World!!";
	}
}
