package com.OdkApprenant.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.services.ApprenantService;

@CrossOrigin(origins="*")
@RestController
public class ApprenantController {

	@Autowired
	ApprenantService apprenantService;
	
	@PostMapping("/save")
	public String save (@RequestBody Apprenant apprenant) {
		apprenantService.saveOrUpdate(apprenant);
		return "insertion reussi";
	}
	
	@GetMapping("/liste")
	public List<Apprenant> list() {
		return apprenantService.getAllApprenant();
	}
	
	@GetMapping("/liste/{id}")
		public Apprenant getById(@PathVariable Long id){
		return apprenantService.getById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteApprenant(@PathVariable (value="id") Long id) {
		apprenantService.deleteApprenant(id);
		return "suppression reussi "+id;
	}
	
	@GetMapping("/user/{login}&{password}")
	public Apprenant autheUser(@PathVariable String login, @PathVariable String password) {
		return this.apprenantService.autheUser(login, password);
	}


}
