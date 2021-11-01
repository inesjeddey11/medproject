package com.pharmacie.pharmacie.domain.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pharmacie.pharmacie.domain.entities.medecine;
import com.pharmacie.pharmacie.domain.services.medecineService;

@RestController
@RequestMapping("/api/v1/medecine")
public class medecineController {

	@Autowired
	private final medecineService mService;
	
	public medecineController(medecineService mService){
		this.mService = mService;
	}
	@GetMapping("/showAll")
	public List<medecine> showAll(){
		return mService.getMedecineAll();
	}
	
	@PostMapping("/add")
	public void registerMedecine(@RequestBody medecine m){
		mService.addMedecine(m);
		
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteMedecine(@RequestBody long id){
		mService.deleteMedecine(id);
	}
	}

