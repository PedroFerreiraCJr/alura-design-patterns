package br.com.alura.alura_design_patterns.capitulo_1.modelo;

import br.com.alura.alura_design_patterns.capitulo_2.modelo.Item;

public class IKCV extends TemplateImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0 && temItemMaiorQueCemReais(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

	private boolean temItemMaiorQueCemReais(Orcamento orcamento) {
		long total = orcamento.getItens().stream().mapToDouble(Item::getValor).count();
		return total > 0;
	}
}
