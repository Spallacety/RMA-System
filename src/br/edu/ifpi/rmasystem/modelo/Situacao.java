package br.edu.ifpi.rmasystem.modelo;

public enum Situacao {

	SOLICITADO("Solicitado"),
	EM_ORCAMENTO("Em or�amento"),
	AUTORIZADO("Autorizado"),
	EM_SERVICO("Em servi�o"),
	NEGADO("Negado"),
	DISPONIVEL_PARA_RETIRADA("Dispon�vel para retirada"),
	FINALIZADO("Finalizado");
	
	private final String situacao;
	
	private Situacao(String situacao){
		this.situacao = situacao;
	}
	
	public String getSituacao(){
		return this.situacao;
	}
	
	@Override
	public String toString() {
		return this.getSituacao();
	}
	
}
