package br.com.alura.alura_design_patterns.capitulo_2;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_2.modelo.Item;
import br.com.alura.alura_design_patterns.capitulo_2.service.CalculadorDesconto;

public class Main {
	public static void main(String[] args) {
		cenarioSemDesconto();
		cenarioComDescontoCincoPorCentoDeDesconto();
		cenarioComDescontoDeDezPorCento();
		cenarioComDescontoDeSetePorCento();
	}

	private static void cenarioSemDesconto() {
		CalculadorDesconto descontos = new CalculadorDesconto();
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionarItem(new Item("Caneta", 250.0));
		orcamento.adicionarItem(new Item("Lapiseira", 250.0));

		double resultado = descontos.calcular(orcamento);
		System.out.println("Resultado sem desconto: " + resultado);
	}

	private static void cenarioComDescontoCincoPorCentoDeDesconto() {
		CalculadorDesconto descontos = new CalculadorDesconto();
		Orcamento orcamento = new Orcamento(100.0);
		orcamento.adicionarItem(new Item("Caneta", 250.0));
		orcamento.adicionarItem(new Item("Lápis", 250.0));

		double resultado = descontos.calcular(orcamento);
		System.out.println("Resultado com 5% de desconto: " + resultado);
	}
	
	private static void cenarioComDescontoDeSetePorCento() {
		CalculadorDesconto descontos = new CalculadorDesconto();
		Orcamento orcamento = new Orcamento(600.0);
		orcamento.adicionarItem(new Item("Caneta", 250.0));
		orcamento.adicionarItem(new Item("Lápis", 250.0));

		double resultado = descontos.calcular(orcamento);
		System.out.println("Resultado com 7% de desconto: " + resultado);
	}

	private static void cenarioComDescontoDeDezPorCento() {
		CalculadorDesconto descontos = new CalculadorDesconto();
		Orcamento orcamento = new Orcamento(200.0);
		orcamento.adicionarItem(new Item("Caneta", 150.0));
		orcamento.adicionarItem(new Item("Lápis", 150.0));
		orcamento.adicionarItem(new Item("Caderno", 100.0));
		orcamento.adicionarItem(new Item("Lapiseira", 300.0));
		orcamento.adicionarItem(new Item("Apontador", 80.0));
		orcamento.adicionarItem(new Item("Borracha", 50.0));

		double resultado = descontos.calcular(orcamento);
		System.out.println("Resultado com 10% de desconto: " + resultado);
	}
}
