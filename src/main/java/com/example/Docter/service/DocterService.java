package com.example.Docter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Docter.Repo.DocterRepo;
import com.example.Docter.modle.Docter;

@Service
public class DocterService {
	@Autowired
	private DocterRepo repo;

	public Docter save(Docter docter) {
		
		return repo.save(docter);
	}

	public List<Docter> getallemp() {
		return repo.findAll();
	}

	public void deleteD(int id) {
		repo.deleteById(id);
	}

	
	
	
	
	
	}

