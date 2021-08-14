package br.com.alura.alura_design_patterns.capitulo_4;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.ICMS;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.ICPP;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.ISS;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.Imposto;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

/**
 * Classe que demonstra a utilização da composição de impostos através do design
 * pattern <strong>Decorator</strong>.
 * 
 * @author Pedro Junior
 *
 */
public class Main {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS(new ICPP()));
		Orcamento orcamento = new Orcamento(500.0);
		double valor = iss.calcular(orcamento);
		System.out.println(valor);
	}
}
