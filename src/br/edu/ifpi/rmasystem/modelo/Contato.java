package br.edu.ifpi.rmasystem.modelo;

public class Contato {
	
	private String tipo;
	private String detalhes;
	
	public Contato(String tipo, String detalhes){
		this.tipo = tipo;
		this.detalhes = detalhes;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getDetalhes() {
		return detalhes;
	}
	
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	
	@Override
	public String toString() {
		String str = tipo + ": " + detalhes;
		return str;
	}
	
}
