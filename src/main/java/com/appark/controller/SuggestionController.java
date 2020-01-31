package com.appark.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appark.model.Suggestion;
import com.appark.service.ISuggestionService;

@RestController
@RequestMapping("/suggestions")
@CrossOrigin(origins = { "https://apparkclient.firebaseapp.com" })
public class SuggestionController {
	
	@Autowired
	private ISuggestionService service;
	
	@PostMapping
	public Suggestion registrar(@RequestBody Suggestion obj) {
		return service.registrar(obj);
	}
	
	@PutMapping()
	public Suggestion modificar(@RequestBody Suggestion obj) {
		return service.modificar(obj);
	}
	
	@GetMapping
	public List<Suggestion> listar() {
		return service.listar();
	}
	
	@GetMapping("/{id}")
	public Suggestion listarById(@PathVariable Integer id) {
		return service.listarPorId(id);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		service.eliminar(id);
	}
	
}
