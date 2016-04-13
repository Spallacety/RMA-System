package br.edu.ifpi.rmasystem.modelo;

import java.util.ArrayList;
import java.util.List;

public class Solicitante {

	private String nome;
	private String cpf;
	private List<Contato> contatos = new ArrayList<>();
	
	public Solicitante(String nome, String cpf){
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public void adicionarContato(String tipo, String detalhes){
		contatos.add(new Contato(tipo, detalhes));
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public List<Contato> getContatos() {
//		for (Contato c : contatos) {
//			System.out.println(c);
//		}
		return contatos;
	}
	
	@Override
	public String toString() {
		String str = this.nome + ", CPF " + this.cpf + "\n" + this.getContatos();
		return str;
	}
	
}
