package br.com.valceliofontene.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.valceliofontene.cursomc.domain.Categoria;
import br.com.valceliofontene.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
		
	
	public Categoria find(Integer id) {
	Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);  
	}

}
