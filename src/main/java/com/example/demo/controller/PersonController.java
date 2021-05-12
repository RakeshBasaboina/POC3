package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonDaoo;
import com.example.demo.model.Person;

@RestController
public class PersonController {

	@Autowired
	PersonDaoo persondao;
	
	@PostMapping("/person")
	 
	public Person addperson(@RequestBody Person person) {
		return persondao.save(person);
	}
	@GetMapping("/getpersons")
	public Iterable<Person> getpersons() {
		return persondao.findAll();
	}
	@GetMapping("/getpersons/{id}")
	public Optional<Person> getperson(@PathVariable Integer id) {
		return persondao.findById(id);
	}
	
	@DeleteMapping("/getpersons/{id}") 
		public void deleteperson(@PathVariable Integer id) {
			 persondao.deleteById(id);
		}
	
}
