package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

public class DescontoPorCincoItens extends AbstractDesconto {

	public DescontoPorCincoItens(Desconto proximo) {
		super(proximo);
	}

	@Override
	public double descontar(Orcamento orcamento) {
		if (aplicavel(orcamento)) {
			return orcamento.getValor() * 0.1;
		}
		return proximo.descontar(orcamento);
	}

	private boolean aplicavel(Orcamento orcamento) {
		return orcamento.getItens().size() > 5;
	}
}
