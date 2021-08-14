package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ISS extends Imposto {

	public ISS() {
		super();
	}

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06 + super.calcularOutroImposto(orcamento);
	}
}
