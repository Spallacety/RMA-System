package br.edu.ifpi.rmasystem.aplicacao;

import br.edu.ifpi.rmasystem.modelo.Contato;
import br.edu.ifpi.rmasystem.modelo.Garantia;
import br.edu.ifpi.rmasystem.modelo.Particular;
import br.edu.ifpi.rmasystem.modelo.Situacao;
import br.edu.ifpi.rmasystem.modelo.Solicitacao;
import br.edu.ifpi.rmasystem.modelo.Solicitante;

public class Testes {
	
	public static void main(String[] args) {
		
		Solicitacao s = new Garantia("Lucas", "000", "Celular", "Samsung", "S5 Mini", "Entrada de carregador queimada");
		Solicitacao s2 = new Particular("Leoncio", "111", "Fogão", "Brastemp", "123", "Boca não acende");
		
		((Particular)s2).setSituacao(Situacao.EM_ORCAMENTO, "O orçamento está sendo realizado.");
		((Particular)s2).setSituacao(Situacao.AUTORIZADO, "O cliente aceitou o prazo e o preço. O produto foi para a manutenção.");
		((Particular)s2).adicionarPrazoEValor(45, 100);
		
		System.out.println(s);
		System.out.println(s2);

		((Garantia)s).setSituacao(Situacao.NEGADO, "A marca rejeitou o pedido de garantia.");
//		s = ((Garantia) s).converterParticular();
		
//		((Particular) s).setValor(250);
		
		((Garantia) s).negativaCliente();
		
		System.out.println(s);
		
//		((Particular) s).getSolicitante().adicionarContato("e-mail", "a@a.com");
		
//		System.out.println(((Particular) s).getSolicitante().getContatos());
		
	}

}