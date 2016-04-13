package br.edu.ifpi.rmasystem.modelo;

import java.util.ArrayList;
import java.util.List;

public class Detalhes {
	
	private String descricao;
	private List<String> detalhes = new ArrayList<>();
	
	public Detalhes(String descricao){
		this.descricao = descricao;
	}
	
	public void adicionarDetalhe(String detalhe){
		detalhes.add(detalhe);
	}
	
	public void mostrarDetalhes(){
		System.out.println("Detalhes adicionais: \n");
		for (String detalhe : detalhes) {
			System.out.println(detalhe);
		}
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<String> getDetalhes() {
		return detalhes;
	}

}
