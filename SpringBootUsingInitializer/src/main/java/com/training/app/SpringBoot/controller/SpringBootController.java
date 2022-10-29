package com.training.app.SpringBoot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {

	@GetMapping(value="/")
//	@RequestMapping(value="/", method=RequestMethod.GET)
	public String hello() {
		return "Hello World!!";
	}
}
