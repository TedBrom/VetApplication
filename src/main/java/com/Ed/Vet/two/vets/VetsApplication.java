package com.Ed.Vet.two.vets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class VetsApplication
{

	public static AnimalList newAnimalList = new AnimalList();
	public static void main(String[] args)
	{
		SpringApplication.run(VetsApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/customRoute")
	@ResponseBody
	public String myResponse()
	{
		return newAnimalList.toString();
	}

	@PutMapping("/change/{id}")
	@ResponseBody
	public void change(@PathVariable int id, @RequestParam String name, @RequestParam int age,
					   @RequestParam String species)
	{
		newAnimalList.changeAnimal(id,new Animals(name,age,species));

	}


	@PutMapping("/add")
	@ResponseBody
	public void change(@RequestParam String name,
					   @RequestParam int age, @RequestParam String species)
	{
		newAnimalList.addAnimal(new Animals(name, age, species));
	}


}
