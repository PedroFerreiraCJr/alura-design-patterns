package br.com.alura.alura_design_patterns.capitulo_2.service;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_2.regras.Desconto;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorCincoItens;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorMaisDeQuinhentosReais;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorVendaCasada;
import br.com.alura.alura_design_patterns.capitulo_2.regras.SemDesconto;

public class CalculadorDesconto {
	public double calcular(Orcamento orcamento) {
		Desconto semDesconto = new SemDesconto();
		Desconto d3 = new DescontoPorVendaCasada(semDesconto);
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais(d3);
		Desconto d1 = new DescontoPorCincoItens(d2);

		return d1.descontar(orcamento);
	}
}
