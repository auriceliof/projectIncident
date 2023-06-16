package com.project.projectIncident.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.projectIncident.dto.IncidentDTO;
import com.project.projectIncident.services.IncidentService;

@RestController
@RequestMapping(value = "/incidents")
public class IncidentResource {

	@Autowired
	private IncidentService service;
	
	@GetMapping
	public ResponseEntity<List<IncidentDTO>> findAll(){
	
		List<IncidentDTO> list = service.findAll();
		
		return ResponseEntity.ok().body(list);		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<IncidentDTO> findById(@PathVariable Long id){
		
		IncidentDTO dto = service.findById(id);
		
		return ResponseEntity.ok().body(dto);
	}	
}
