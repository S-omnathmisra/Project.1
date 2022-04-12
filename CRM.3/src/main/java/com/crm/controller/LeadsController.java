package com.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.crm.entities.Leads;
import com.crm.service.LeadsService;

@Controller
public class LeadsController {
	
	@Autowired
	public LeadsService leadsSerivce;
	
	
	@RequestMapping("/leads")
	public String showleadsPage() {
		
		return"leads";
	}
	
	@RequestMapping("/saveleads")
	public String saveleads(@ModelAttribute("leads") Leads leads, ModelMap modelMap) {
		leadsSerivce.saveleads(leads);
		
		modelMap.addAttribute("leads", leads);
		return "leadsInfo";
		
		
	}
	
	@RequestMapping("/getleads")
	public String grtAllLeads(ModelMap modelMap) {
		List<Leads> leads = leadsSerivce.getLeads();
		modelMap.addAttribute("leads", leads);
		return "leadsSearchResult";
	}
	
	@RequestMapping("/getLead")
	public String saveleads(@RequestParam("id") long id, ModelMap modelMap) {
		Leads leads = leadsSerivce.findLeadById(id);
		
		modelMap.addAttribute("leads", leads);
		return "leadsInfo";

	}
}
