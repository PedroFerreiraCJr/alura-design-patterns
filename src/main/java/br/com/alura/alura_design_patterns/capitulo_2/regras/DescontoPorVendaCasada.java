package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_2.modelo.Item;

public class DescontoPorVendaCasada extends AbstractDesconto {

	public DescontoPorVendaCasada(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double descontar(Orcamento orcamento) {
		if (aplicavel(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.descontar(orcamento);
	}

	private boolean aplicavel(Orcamento orcamento) {
		long total = orcamento.getItens().stream().map(Item::getNome)
				.filter(n -> n.equals("Caneta") || n.equals("Lápis")).count();
		return total >= 2;
	}
}
