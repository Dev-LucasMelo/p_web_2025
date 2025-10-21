package com.example.br.edu.ufape.transporte.model;

public abstract class Pessoa {
	private String nome;
	private String cpf;
	private String telefone;
	
	
	public Pessoa () {
		// TODO Auto-generated constructor stub
	}
	
	public Pessoa(String nome, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	
	//getters
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	
	//setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
