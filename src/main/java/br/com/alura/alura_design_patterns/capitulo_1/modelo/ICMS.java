package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ICMS extends Imposto {
	
	public ICMS() {
		super();
	}
	
	public ICMS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1 + super.calcularOutroImposto(orcamento);
	}
}
