package com.Ed.Vet.two.vets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class VetsApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(VetsApplication.class, args);
	}

	//@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	public String myResponse()
	{
		AnimalList newAnimalList = new AnimalList();
		return newAnimalList.toString();
	}

	/*
	@PutMapping("/add")
	@ResponseBody
	void change(@PathVariable)
	 */

}
