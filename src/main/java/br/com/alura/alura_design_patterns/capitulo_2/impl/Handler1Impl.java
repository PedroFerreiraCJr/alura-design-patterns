package br.com.alura.alura_design_patterns.capitulo_2.impl;

import br.com.alura.alura_design_patterns.capitulo_2.AbstractHandler;

/**
 * Primeira implementação concreta para o tipo de elemento Integer
 * 
 * @author Pedro Junior
 *
 */
public class Handler1Impl extends AbstractHandler<Integer> {
	public Handler1Impl() {
		super();
		this.next = null;
	}

	@Override
	public boolean accept(Integer value) {
		return value.intValue() == 1;
	}

	@Override
	public boolean execute(Integer value) {
		System.out.println(String.format("Handling value %s", value));
		return true;
	}
}
