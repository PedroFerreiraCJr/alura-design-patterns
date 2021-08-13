package br.com.alura.alura_design_patterns.capitulo_1.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.alura_design_patterns.capitulo_2.modelo.Item;

public class Orcamento {
	private final Double valor;
	private final List<Item> itens;

	public Orcamento(Double valor) {
		super();
		this.valor = valor;
		this.itens = new ArrayList<>();
	}

	public Double getValor() {
		return valor;
	}

	public void adicionarItem(Item item) {
		this.itens.add(item);
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
}
