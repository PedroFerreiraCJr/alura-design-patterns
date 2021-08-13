package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

public class SemDesconto extends AbstractDesconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	public double descontar(Orcamento orcamento) {
		return 0;
	}
}