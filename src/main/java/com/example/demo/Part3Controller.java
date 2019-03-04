package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Part3Controller {
	@Autowired
	TeamRepository teamRepository;
	@GetMapping("/part3teams")
	  public Iterable<Team> getTeams() {
	  	return teamRepository.findAll();
	  }
	@GetMapping("/part3teams/{id}")
	public Team getTeam(@PathVariable Long id) {
		return teamRepository.findById(id).get();
	}
}
