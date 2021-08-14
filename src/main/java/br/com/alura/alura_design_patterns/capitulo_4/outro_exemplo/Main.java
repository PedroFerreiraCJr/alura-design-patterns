package br.com.alura.alura_design_patterns.capitulo_4.outro_exemplo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * O primeiro critério de filtragem de contas que são consideradas fraudulentas
 * é o de valor mínimo, que é R$ 100,00. Caso o valor da conta seja menor que
 * isso, ela se encaixa no critério e deve ser retornada pelo filtro.
 * 
 * O segundo critério de filtragem de contas é quando a conta possue um saldo
 * maior que R$ 500.000,00. Neste caso a mesma é retornada como resultado da
 * filtragem.
 * 
 * @author Pedro Junior
 *
 */
public class Main {
	public static void main(String[] args) {
		List<Conta> contas = new ArrayList<>();
		contas.add(new Conta(90.00d, new Date()));
		contas.add(new Conta(400.00d, new Date()));
		contas.add(new Conta(1_000_000_000.00d, new Date()));
		contas.add(new Conta(2_000_000_000.00d, new Date()));

		// a composição de decorators é demonstrada na linha de código seguinte
		Filtro f1 = new SaldoMenorQueCem(new SaldoMaiorQueQuinhentosMil());
		List<Conta> result = f1.filtrar(contas);
		for (final Conta c : result) {
			System.out.println(c.getSaldo());
		}
	}
}
