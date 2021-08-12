package br.com.alura.alura_design_patterns.capitulo_1.modelo;

public interface Imposto {
	/**
	 * Dado que todos os tipos de impostos dever receber uma orçamento é possível
	 * extrair uma interface de programação em comum aos impostos
	 */
	public abstract double calcular(Orcamento orcamento);
}
