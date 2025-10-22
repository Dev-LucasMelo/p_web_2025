package com.example.br.edu.ufape.transporte.model;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Pessoa {
	@Id
	@GeneratedValue
	private Long id; 
	private String nome;
	private String cpf;
	private String telefone;
}
