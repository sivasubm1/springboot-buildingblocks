package com.practise.restservices.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")	
	public String HelloWorld() {
		return "Hello World";
	}
	
	@GetMapping("/helloworldbean")
	public UserDetails HelloUserDetails() {
		return new UserDetails("Madhan", "Siva", "Chennai");
	}

}
