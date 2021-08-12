package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ICCC implements Imposto {
	public double calcular(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1_000.0) {
			return valor * 0.05;
		}
		else if (valor >= 1000.0 && valor <= 3000.0) {
			return valor * 0.07; 
		}
		else {
			return valor * 0.08 + 30.0;
		}
	}
}
