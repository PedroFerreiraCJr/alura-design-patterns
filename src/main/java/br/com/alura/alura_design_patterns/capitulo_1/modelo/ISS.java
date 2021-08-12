package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public class ISS implements Imposto {
	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
}
