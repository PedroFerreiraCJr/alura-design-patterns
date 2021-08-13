package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_2.modelo.Item;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {
		if (aplicavel(orcamento)) {
			return orcamento.getValor() * 0.05;
		}
		return proximo.descontar(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	private boolean aplicavel(Orcamento orcamento) {
		long total = orcamento.getItens().stream().map(Item::getNome)
				.filter(n -> n.equals("Caneta") || n.equals("Lápis")).count();
		return total >= 2;
	}
}
