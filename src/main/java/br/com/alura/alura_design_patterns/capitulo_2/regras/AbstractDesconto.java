package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

public class AbstractDesconto implements Desconto {

	protected Desconto proximo;

	protected AbstractDesconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}

	@Override
	public double descontar(Orcamento orcamento) {
		return 0;
	}
}
