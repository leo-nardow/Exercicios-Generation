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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojadegames.LojaDeGames.model.ProdutoModel;
import com.lojadegames.LojaDeGames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
	private @Autowired ProdutoRepository repository;
	
	//GET
	@GetMapping("/getAll")
	public ResponseEntity<List<ProdutoModel>> getAllProduto(){
		List<ProdutoModel> objetoProduto = repository.findAll();
		
		if (objetoProduto.isEmpty()) {
			return ResponseEntity.status(204).build();
		} else {
			return ResponseEntity.status(200).body(objetoProduto);
		}
	}
	
	@GetMapping("/getById/{id_produto")
	public ResponseEntity<ProdutoModel> getById(@PathVariable(value = "id_produto") Long idProduto){
		Optional<ProdutoModel> objetoProduto = repository.findById(idProduto);
		
		if (objetoProduto.isPresent()) {
			return ResponseEntity.status(200).body(objetoProduto.get());
		} else {
			return ResponseEntity.status(204).build();
		}
	}

	@GetMapping("/getByTitulo/{titulo}")
	public ResponseEntity<ProdutoModel> getByTitulo(@PathVariable(value = "titulo") String titulo) {
		return repository.findByTitulo(titulo)
				.map(tituloencontrado -> ResponseEntity.ok(tituloencontrado))
				.orElse(ResponseEntity.notFound().build());
	}

	//POST
	@PostMapping("/criar")
	public ResponseEntity<ProdutoModel> cadastar(@Valid @RequestBody ProdutoModel novoProduto) {
		return ResponseEntity.status(201).body(repository.save(novoProduto));
	}

	//PUT
	public ResponseEntity<ProdutoModel> atualizar(@Valid @RequestBody ProdutoModel atualizadoProduto) {
		return ResponseEntity.status(201).body(repository.save(atualizadoProduto));
	}

	//DELETE
	@DeleteMapping("deletar/{id_produto}")
	public void deletar(@PathVariable(value = "id_produto") Long idProduto) {
		repository.deleteById(idProduto);
	}
}
