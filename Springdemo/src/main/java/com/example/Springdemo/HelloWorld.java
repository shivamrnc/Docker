package com.example.Springdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorld {
	@GetMapping("/Shivam")
	public String Hello() 
	{return "Welcome";}
	

}
