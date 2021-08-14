package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ICCC extends Imposto {

	public ICCC() {
		super();
	}

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	@Override
	public double calcular(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1_000.0) {
			return valor * 0.05 + super.calcularOutroImposto(orcamento);
		} else if (valor >= 1000.0 && valor <= 3000.0) {
			return valor * 0.07 + super.calcularOutroImposto(orcamento);
		} else {
			return valor * 0.08 + 30.0 + super.calcularOutroImposto(orcamento);
		}
	}
}
