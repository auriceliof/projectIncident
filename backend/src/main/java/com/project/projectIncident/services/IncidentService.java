package com.project.projectIncident.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.projectIncident.entities.Incident;
import com.project.projectIncident.repositories.IncidentRepository;

@Service
public class IncidentService {

	@Autowired
	private IncidentRepository repository;
	
	@Transactional(readOnly = true)
	public List<Incident> findAll(){
		return repository.findAll();
	}
}
