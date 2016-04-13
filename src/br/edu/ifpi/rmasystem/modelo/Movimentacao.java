package br.edu.ifpi.rmasystem.modelo;

import java.util.Calendar;

public class Movimentacao {

	private String data;
	private String descricao;
	
	public Movimentacao(String descricao){
		this.descricao = descricao;
		Calendar c = Calendar.getInstance();
		int ano = c.get(Calendar.YEAR);
		int mes = c.get(Calendar.MONTH) + 1;
		int dia = c.get(Calendar.DAY_OF_MONTH);
		this.data = String.format("%02d/%02d/%04d", dia, mes, ano);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		String str = this.data + " - " + this.descricao;
		return str;
	}
}
