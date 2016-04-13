package br.edu.ifpi.rmasystem.modelo;

import java.util.List;

public class Garantia extends SolicitacaoAbstract{

	public Garantia(String nomeSolicitante, String cpfSolicitante, String descricaoProduto,
			String marcaProduto, String modeloProduto, String motivoSolicitacao){
		super(nomeSolicitante, cpfSolicitante, descricaoProduto, marcaProduto, modeloProduto, motivoSolicitacao);
		this.setPrazo(30);
	}

	public Garantia(Solicitante solicitante, Situacao situacao, String codigo, List<Movimentacao> movimentacao,
			int prazo, Equipamento equipamento, Detalhes detalhes) {
		super(solicitante, situacao, codigo, movimentacao, prazo, equipamento, detalhes);
	}

	protected void gerarCodigo() {
		String codigo = "G";
		int random = (int)(Math.random() * 1000);
		codigo += random;
		this.setCodigo(codigo);
	}

	public Particular converterParticular(){
		this.adicionarMovimentacao("Cliente aceitou o pedido de conversão para particular.");
		Solicitante solicitante = this.getSolicitante();
		Situacao situacao = Situacao.AUTORIZADO;
		String codigo = this.getCodigo().substring(1);
		List<Movimentacao> movimentacao = this.getMovimentacao();
		int prazo = this.getPrazo();
		Equipamento equipamento = this.getEquipamento();
		Detalhes detalhes = this.getDetalhes();
		Particular p = new Particular(solicitante, situacao, "P"+codigo, movimentacao, prazo, equipamento, detalhes);
		return p;
		//
	}
	
	public void negativaCliente(){
		this.setSituacao(Situacao.DISPONIVEL_PARA_RETIRADA, "Cliente negativou o pedido de conversão para particular.");
	}

	public void avisarCliente(){
		this.getSolicitante().getContatos();
	}

	@Override
	public String toString() {
		String str = "Tipo: Garantia\n" + super.toString();
		return str;
	}
}
