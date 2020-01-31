package com.appark.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appark.model.Suggestion;
import com.appark.repo.ISuggestionRepo;
import com.appark.service.ISuggestionService;

@Service
public class SuggestionServiceImpl implements ISuggestionService{

	@Autowired
	private ISuggestionRepo repo;
	
	@Override
	public Suggestion registrar(Suggestion obj) {
		return repo.save(obj);
	}

	@Override
	public Suggestion modificar(Suggestion obj) {
		return repo.save(obj);
	}

	@Override
	public List<Suggestion> listar() {
		return repo.findAll();
	}

	@Override
	public Suggestion listarPorId(Integer id) {
		Optional<Suggestion> op= repo.findById(id);
		return op.isPresent()? op.get() : new Suggestion();	
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}
}
