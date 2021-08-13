package br.com.alura.alura_design_patterns.capitulo_2.impl;

import br.com.alura.alura_design_patterns.capitulo_2.AbstractHandler;

/**
 * Primeira implementação concreta para o tipo de elemento Integer
 * 
 * @author Pedro Junior
 *
 */
public class Handler3Impl extends AbstractHandler<Integer> {
	public Handler3Impl() {
		super();
		this.next = null;
	}

	@Override
	public boolean accept(Integer value) {
		return value.intValue() == 3;
	}

	@Override
	public boolean execute(Integer value) {
		System.out.println(String.format("Handling value %s", value));
		return true;
	}
}
