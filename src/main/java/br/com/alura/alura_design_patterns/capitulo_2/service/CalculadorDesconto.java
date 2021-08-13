package br.com.alura.alura_design_patterns.capitulo_2.service;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_2.regras.Desconto;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorCincoItens;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorMaisDeQuinhentosReais;
import br.com.alura.alura_design_patterns.capitulo_2.regras.DescontoPorVendaCasada;
import br.com.alura.alura_design_patterns.capitulo_2.regras.SemDesconto;

public class CalculadorDesconto {
	public double calcular(Orcamento orcamento) {
		Desconto d1 = new DescontoPorCincoItens();
		Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto d3 = new DescontoPorVendaCasada();
		Desconto semDesconto = new SemDesconto();

		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(semDesconto);

		return d1.descontar(orcamento);
	}
}
