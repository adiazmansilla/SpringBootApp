package com.adm.springbootquickstart.greetings;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {
	
	@RequestMapping("/greetings")
	public String greeting(@RequestParam(name="name")String name) {
		return "Hello "+name;
	}

}
