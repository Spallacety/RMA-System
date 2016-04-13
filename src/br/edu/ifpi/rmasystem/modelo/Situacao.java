package br.edu.ifpi.rmasystem.modelo;

public enum Situacao {

	SOLICITADO("Solicitado"),
	EM_ORCAMENTO("Em orçamento"),
	AUTORIZADO("Autorizado"),
	EM_SERVICO("Em serviço"),
	NEGADO("Negado"),
	DISPONIVEL_PARA_RETIRADA("Disponível para retirada"),
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
