package com.example.br.edu.ufape.transporte.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Motorista extends Pessoa {
	
	@Id
	@GeneratedValue
	private Long id; 
	private String cnh;
	private List<Integer> avaliacoes;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Veiculo veiculo;
}
