package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public abstract class Imposto {

	protected Imposto outroImposto;

	protected Imposto() {
		super();
	}

	protected Imposto(Imposto outroImposto) {
		super();
		this.outroImposto = outroImposto;
	}

	protected double calcularOutroImposto(Orcamento orcamento) {
		if (this.outroImposto == null) {
			return 0;
		}
		return this.outroImposto.calcular(orcamento);
	}

	public abstract double calcular(Orcamento orcamento);
}
