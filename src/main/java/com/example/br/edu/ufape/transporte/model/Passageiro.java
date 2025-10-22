package com.example.br.edu.ufape.transporte.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Passageiro extends Pessoa {
	@Id
	@GeneratedValue
	private Long id; 
	private Double saldo;
	private List<Integer> avaliacoes;
}
