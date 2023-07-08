package com.example.webdev.restobackend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.webdev.restobackend.models.chefM;
import com.example.webdev.restobackend.services.ChefService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

@RequestMapping("/chefs")
public class ChefController {



	@Autowired
	private ChefService  chefService;
	
	@GetMapping
	 public List<chefM> getAllChefs(){
	 return chefService.getAllChefs();
	}
	@PostMapping
	public chefM addMatch(@RequestBody chefM chef) {
	 return chefService.addChef(chef);
	 }
	@GetMapping("/{id}")
	public chefM getMatchesById(@PathVariable Integer id  ) {
	return chefService.getChefById(id);
	}
	@PutMapping
	public chefM update(@RequestBody chefM chef) {
		//matche.setId(id);
	 return chefService.editChef(chef);
	}
	

	 
	 @DeleteMapping("/{id}")
	public void delete(@PathVariable  Integer  id) {
		 chefService.deleteChefById(id);
	 }
		
	
	
}
