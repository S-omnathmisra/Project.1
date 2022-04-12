package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
