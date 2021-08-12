package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ICMS {
	public double calcularICMS(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}
}
