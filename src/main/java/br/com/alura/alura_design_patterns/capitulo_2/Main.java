package br.com.alura.alura_design_patterns.capitulo_2;

import br.com.alura.alura_design_patterns.capitulo_2.impl.Handler1Impl;
import br.com.alura.alura_design_patterns.capitulo_2.impl.Handler2Impl;
import br.com.alura.alura_design_patterns.capitulo_2.impl.Handler3Impl;

class Main {
	public static void main(String[] args) {
		HandlerChainOfResponsability<Integer> chain = new HandlerChainOfResponsability<>();
		chain.add(new Handler1Impl());
		chain.add(new Handler2Impl());
		chain.add(new Handler3Impl());
		chain.execute(1);
		chain.execute(2);
		chain.execute(3);
	}
}
