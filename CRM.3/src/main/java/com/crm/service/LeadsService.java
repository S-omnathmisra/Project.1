package com.crm.service;


import java.util.List;

import com.crm.entities.Leads;

public interface LeadsService {
	
	public void saveleads(Leads leads);

	public List<Leads> getLeads();

	public Leads findLeadById(long id);



}
