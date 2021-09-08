package com.lojadegames.LojaDeGames.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.LojaDeGames.model.CategoriaModel;
import com.lojadegames.LojaDeGames.repository.CategoriaRepository;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	private @Autowired CategoriaRepository repository;
	
	//GET
	@GetMapping("/getAll")
	public ResponseEntity<List<CategoriaModel>> getAll() {
		List<CategoriaModel> objetoCategoria = repository.findAll();
		
		if(objetoCategoria.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoCategoria);
		}
	}
	
	@GetMapping("/getById/{id_categoria}")
	public ResponseEntity<CategoriaModel> getById(@PathVariable(value = "id_categoria") Long idCategoria){
		Optional<CategoriaModel> objetoCategoria = repository.findById(idCategoria);
		
		if(objetoCategoria.isPresent()) {
			return ResponseEntity.status(200).body(objetoCategoria.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/getByDescricao/{descricao}")
	public ResponseEntity<CategoriaModel> getByDescricao(@PathVariable(value = "decricao") String descricao) {
		return repository.findByDescricao(descricao)
				.map(descricaofounded -> ResponseEntity.ok(descricaofounded))
				.orElse(ResponseEntity.notFound().build());
	}
	
	//POST
	@PostMapping("/criar")
	public ResponseEntity<CategoriaModel> cadastrar(@Valid @RequestBody CategoriaModel novaCategoria) {
		
		return ResponseEntity.status(201).body(repository.save(novaCategoria));
	}
	
	//PUT
	@PutMapping("/atualizar")
	public ResponseEntity<CategoriaModel> atualizar(@Valid @RequestBody CategoriaModel atualizadoCategoria) {
		
		return ResponseEntity.status(201).body(repository.save(atualizadoCategoria));
	}
	
	//DELETE
	@DeleteMapping("/deletar/{id_categoria}")
	public void deletar(@PathVariable(value = "id_categoria") Long idCategoria) {
		repository.deleteById(idCategoria);
	}
	
}