package br.edu.ifpi.rmasystem.modelo;

import java.util.List;

public class Particular extends SolicitacaoAbstract{

	private double valor;

	public Particular(String nomeSolicitante, String cpfSolicitante, String descricaoProduto,
			String marcaProduto, String modeloProduto, String motivoSolicitacao){
		super(nomeSolicitante, cpfSolicitante, descricaoProduto, marcaProduto, modeloProduto, motivoSolicitacao);
	}
	
	public Particular(Solicitante solicitante, Situacao situacao, String codigo, List<Movimentacao> movimentacao,
			int prazo, Equipamento equipamento, Detalhes detalhes){
		super(solicitante, situacao, codigo, movimentacao, prazo, equipamento, detalhes);
	}
	
	protected void gerarCodigo(){
		String codigo = "P";
		int random = (int)(Math.random() * 1000);
		codigo += random;
		this.setCodigo(codigo);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void adicionarPrazoEValor(int prazo, double valor){
		this.setPrazo(prazo);
		this.setValor(valor);
	}
	
	@Override
	public String toString() {
		String str = "Tipo: Particular\n" + super.toString() + "\nValor total: ";
		if(valor == 0){
			str += "ainda não orçamentado";
		} else {
			str+= "R$ " + this.valor;
		}
		return str;
	}

}
