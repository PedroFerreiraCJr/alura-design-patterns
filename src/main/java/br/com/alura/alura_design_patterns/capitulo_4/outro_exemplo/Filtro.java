package br.com.alura.alura_design_patterns.capitulo_4.outro_exemplo;

import java.util.List;

public abstract class Filtro {
	protected final Filtro outro;

	protected Filtro() {
		super();
		this.outro = null;
	}

	protected Filtro(Filtro outro) {
		super();
		this.outro = outro;
	}

	public abstract List<Conta> filtrar(List<Conta> contas);
}