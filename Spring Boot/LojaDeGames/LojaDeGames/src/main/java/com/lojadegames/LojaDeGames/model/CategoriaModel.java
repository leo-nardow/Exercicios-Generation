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
public class CategoriaModel {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idCategoria;
	private @NotBlank String categoria;
	private @NotBlank String descricao;

}
