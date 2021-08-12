package br.com.alura.alura_design_patterns.capitulo_1.service;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.Imposto;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;

/**
 * #Contexto: É necessário calcular o valor do imposto de acordo com o imposto
 * recebido no método realizarCalculo, que recebe o orçamento e o tipo de
 * imposto a ser calculado sobre o parâmetro orçamento.
 *
 * Dessa forma o método teria que ser alterado a cado novo imposto que fosse
 * adicionado ao sistema. Sendo necessário fazer diversos if's para cada um dos
 * tipos de imposto.
 * 
 * Pensando nos princípios S.O.L.I.D, está classe não estaria respeitando o
 * princípio de Single Responsability (<strong>S</strong>), e o princípio
 * Open-Closed (<strong>O</strong>).
 * 
 * #Solução: Separar as responsabilidades em classes, para que cada uma delas
 * fique mais coesa, desempenhando somente uma tarefa.
 * 
 * @author Pedro Junior
 *
 */
public class CalculadorImposto {
	/**
	 * Quando várias classes relacionadas possuem uma API em comum, 
	 * é possível extrair um contrato - interface.
	 */
	public void realizarCalculo(Orcamento orcamento, Imposto imposto) {
		double valor = imposto.calcular(orcamento);
		System.out.println("Valor do Orcamento com Imposto");
		double total = valor + orcamento.getValor();
		System.out.println(total);
	}
}
