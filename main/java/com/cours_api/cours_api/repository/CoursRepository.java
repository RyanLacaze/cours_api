package com.cours_api.cours_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cours_api.cours_api.model.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
	
	List<Cours> findByMatiereContainingIgnoreCase(String matiere);
}
