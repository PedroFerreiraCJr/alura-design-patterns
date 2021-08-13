package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

public class DescontoPorMaisDeQuinhentosReais extends AbstractDesconto {

	public DescontoPorMaisDeQuinhentosReais(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double descontar(Orcamento orcamento) {
		if (aplicavel(orcamento)) {
			return orcamento.getValor() * 0.07;
		}
		return proximo.descontar(orcamento);
	}

	private boolean aplicavel(Orcamento orcamento) {
		return orcamento.getValor() > 500.0;
	}
}
