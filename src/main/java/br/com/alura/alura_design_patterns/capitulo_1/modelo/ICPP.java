package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ICPP extends TemplateImpostoCondicional {

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}
}
