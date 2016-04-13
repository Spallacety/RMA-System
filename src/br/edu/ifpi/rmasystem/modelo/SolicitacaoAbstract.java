package br.edu.ifpi.rmasystem.modelo;

import java.util.ArrayList;
import java.util.List;

public abstract class SolicitacaoAbstract implements Solicitacao{

	private Solicitante solicitante;
	private Situacao situacao;
	private String codigo;
	private List<Movimentacao> movimentacao = new ArrayList<>();
	private int prazo;
	private Equipamento equipamento;
	private Detalhes detalhes;
	
	public SolicitacaoAbstract(String nomeSolicitante, String cpfSolicitante, String descricaoProduto,
			String marcaProduto, String modeloProduto, String motivoSolicitacao){
		this.solicitante = new Solicitante(nomeSolicitante, cpfSolicitante);
		this.equipamento = new Equipamento(descricaoProduto, marcaProduto, modeloProduto);
		this.detalhes = new Detalhes(motivoSolicitacao);
		this.situacao = Situacao.SOLICITADO;
		this.detalhes = new Detalhes(motivoSolicitacao);
		this.adicionarMovimentacao("Solicitação aberta.");
		this.gerarCodigo();
	}
	
	public SolicitacaoAbstract(Solicitante solicitante, Situacao situacao, String codigo, List<Movimentacao> movimentacao,
			int prazo, Equipamento equipamento, Detalhes detalhes) {
		this.solicitante = solicitante;
		this.situacao = situacao;
		this.codigo = codigo;
		this.movimentacao = movimentacao;
		this.prazo = prazo;
		this.equipamento = equipamento;
		this.detalhes = detalhes;
	}

	protected abstract void gerarCodigo();
	//o código é gerado aleatório, mas quando for implementado para salvar em banco de dados
	//o algoritmo de randomicidade deve ser retirado e começar a salvar o código pelo id da tabela
	
	public void adicionarMovimentacao(String detalhes){
		movimentacao.add(new Movimentacao(detalhes));
	}
	
	public void mostrarMovimentacoes(){
		for (Movimentacao m : movimentacao) {
			System.out.println(m);
		}
	}
	
	public Solicitante getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao, String detalhes) {
		this.situacao = situacao;
		this.adicionarMovimentacao(detalhes);
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public List<Movimentacao> getMovimentacao() {
		return movimentacao;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public Equipamento getEquipamento() {
		return equipamento;
	}

	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}

	public Detalhes getDetalhes() {
		return detalhes;
	}

	@Override
	public String toString() {
		String str = "Código da solicitação: " + this.codigo + "\nNome do cliente: " + this.solicitante.getNome()
				+ "\nEquipamento: " + this.equipamento.getDescricao() + " " + this.equipamento.getMarca() + " " + this.equipamento.getModelo() + "\nDetalhes: " + this.detalhes.getDescricao();
		
		
		str += "\nPrazo: ";
		if (prazo == 0){
			String nop = "não estipulado";
			str += nop;
		} else {
			str += prazo + " dias";
		}
		str += "\nSituação: " + situacao.getSituacao();
		this.mostrarMovimentacoes(); // mostro movimentações apenas para teste, não deve exibir na versão final a não ser que o usuário peça
		return str;
	}
}
