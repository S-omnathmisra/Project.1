package com.crm.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crm.entities.Leads;
import com.crm.repository.LeadsRepository;

@Service
public class LeadsServiceimpl implements LeadsService {

	@Autowired
	public LeadsRepository leadsRepo;
	
	
	@Override
	public void saveleads(Leads leads) {
		leadsRepo.save(leads);
		
		
	}


	@Override
	public List<Leads> getLeads() {
		
		List<Leads> leads = leadsRepo.findAll();
		
		return leads;
	}


	@Override
	public Leads findLeadById(long id) {
		Optional<Leads> findById = leadsRepo.findById(id);
		Leads leads = findById.get();
		return leads;
	}


	

	

}
