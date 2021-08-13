package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public abstract class TemplateImpostoCondicional implements Imposto {
	@Override
	public double calcular(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}
		return minimaTaxacao(orcamento);
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);
}
