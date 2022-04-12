package com.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crm.entities.Contacts;

public interface ContactsRepository extends JpaRepository<Contacts, Long> {

}
