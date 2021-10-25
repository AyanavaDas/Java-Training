package com.example.Calculator.application;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Calculator {

	@GetMapping("/add/{number1}/{number2}")
	public int add(@PathVariable int number1,@PathVariable int number2 )
	{
		return number1+number2;
	}
	
	@GetMapping("/substract/{number1}/{number2}")
	public int substract(@PathVariable int number1,@PathVariable int number2 )
	{
		return number1-number2;
	}
	
	@GetMapping("/multiply/{number1}/{number2}")
	public int multiply(@PathVariable int number1,@PathVariable int number2 )
	{
		return number1*number2;
	}
	
	@GetMapping("/divide/{number1}/{number2}")
	public int divide(@PathVariable int number1,@PathVariable int number2 )
	{
		return number1/number2;
	}
	
	@GetMapping("/power/{number1}/{number2}")
	public double power(@PathVariable int number1,@PathVariable int number2 )
	{
		return Math.pow(number1, number2);
	}
	
	@GetMapping("/squareRoot/{number1}")
	public double squareRoot(@PathVariable int number1)
	{
		return Math.sqrt(number1);
	}
}