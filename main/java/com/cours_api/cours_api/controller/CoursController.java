package com.cours_api.cours_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cours_api.cours_api.model.Cours;
import com.cours_api.cours_api.repository.CoursRepository;
/*
@RestController
@RequestMapping("/cours")
public class CoursController {

	private final CoursRepository coursRepository;
	
	// Injection du repository via le constructeur
	public CoursController(CoursRepository coursRepository) {
		this.coursRepository = coursRepository;
	}
	
	@GetMapping("/")
	public List<Cours> getAllCours() {
		return coursRepository.findAll();
	}
	
	/*@PostMapping("/")
    public Cours getSave(@RequestBody Cours cours) {
        return coursRepository.save(cours);
    }
	
	@DeleteMapping("/{id}")
	public void deleteCours(@PathVariable Long id) {
		coursRepository.deleteById(id);
	}
	
	@GetMapping("/search")
	public List<Cours> searchByMatiere(@RequestParam String matiere) {
        return coursRepository.findByMatiereContainingIgnoreCase(matiere);
    }
	
	
}*/

@RestController

@RequestMapping("/cours")

public class CoursController {
	
	private final CoursRepository coursRepository;


// Injection du repository via le constructeur

public CoursController(CoursRepository coursRepository) {

this.coursRepository = coursRepository;

}



// GET /cours → lister tous les cours

@GetMapping

public List<Cours> getAllCours() {

return coursRepository.findAll();

}



// POST /cours → ajouter un nouveau cours

@PostMapping

public Cours addCours(@RequestBody Cours cours) {

return coursRepository.save(cours);

}
}
