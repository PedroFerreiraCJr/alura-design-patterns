package br.com.alura.alura_design_patterns.capitulo_2.modelo;

public class Item {

	private String nome;
	private double valor;

	public Item(String nome, double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}
}
