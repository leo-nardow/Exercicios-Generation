package com.lojadegames.LojaDeGames.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ProdutoModel {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long IdProduto;
	private @NotBlank String titulo;
	
}
