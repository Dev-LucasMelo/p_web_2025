package com.example.br.edu.ufape.transporte.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Veiculo {
	@Id
	@GeneratedValue
	private Long id; 
	private String placa;
	private String modelo;
	private String capacidade;
}
