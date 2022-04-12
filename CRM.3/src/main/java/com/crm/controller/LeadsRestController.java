package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crm.entities.Leads;
import com.crm.repository.LeadsRepository;

@RestController
@RequestMapping("/leads")
public class LeadsRestController {
	
	@Autowired
	public LeadsRepository leadsRepo;
	
	@GetMapping
	public List<Leads> getleads(){
		List<Leads> leads = leadsRepo.findAll();
		return leads;	

	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteLeads(@PathVariable("id") long id) {
		leadsRepo.deleteById(id);
	}
	
	@PostMapping
	public void saveLeads(@RequestBody Leads leads) {
		leadsRepo.save(leads);
	}
	
	@PutMapping
	public void updateLeads(@RequestBody Leads leads) {
		leadsRepo.save(leads);
	}
}
