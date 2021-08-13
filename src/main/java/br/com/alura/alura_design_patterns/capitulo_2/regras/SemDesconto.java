package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

public class SemDesconto implements Desconto {

	@Override
	public double descontar(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto proximo) {
		throw new UnsupportedOperationException("Não é possível configurar um próximo valor");
	}
}
