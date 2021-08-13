package br.com.alura.alura_design_patterns.capitulo_2.regras;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

/**
 * Essa foi a interface extraída para representar as regras que devem ser
 * aplicadas, caso a condição seja satisfeita.
 * 
 * @author Pedro Junior
 *
 */
public interface Desconto {
	/**
	 * Método que deve ser usado para aplicar o desconto ao orçamento.
	 * 
	 * @param orcamento
	 * @return
	 */
	public abstract double descontar(Orcamento orcamento);

}
