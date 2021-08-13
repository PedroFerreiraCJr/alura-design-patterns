package br.com.alura.alura_design_patterns.capitulo_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.alura.alura_design_patterns.capitulo_1.modelo.ICMS;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.ICPP;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.IKCV;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.ISS;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.Imposto;
import br.com.alura.alura_design_patterns.capitulo_1.modelo.Orcamento;
import br.com.alura.alura_design_patterns.capitulo_1.service.CalculadorImposto;

public class Main {
	private static final List<String> CODIGO_DO_IMPOSTO = Arrays.asList("1", "2", "3", "4");

	public static void main(String[] args) {
		final CalculadorImposto calculador = new CalculadorImposto();

		Scanner scan = new Scanner(System.in);
		outer: while (true) {
			String option = null;
			Orcamento orcamento = null;
			while (true) {
				System.out.println("********** Calculadora de Imposto **********");
				System.out.println("Escolha o tipo de imposto:");
				System.out.println("1. :: ISS");
				System.out.println("2. :: ICMS");
				System.out.println("3. :: ICPP");
				System.out.println("4. :: IKCV");
				System.out.println();
				System.out.println();
				System.out.println("Digite 'exit' para sair.");
				System.out.println("********************************************");

				option = scan.nextLine();
				if ("exit".equals(option.trim())) {
					break outer;
				}

				if (!CODIGO_DO_IMPOSTO.contains(option.trim())) {
					System.out.println("Imposto inválido.");
					System.out.println("Selecione uma das opções: 1, 2, 3, 4.");
					continue;
				}

				try {
					System.out.println("Informe o valor do orçamento: ");
					orcamento = new Orcamento(Double.parseDouble(scan.nextLine()));
				} catch (NumberFormatException e) {
					e.printStackTrace();
					System.out.println("Valor do orçamento inválido.");
					continue;
				}

				break;
			}

			OrcamentoEImposto data = processarInput(option, orcamento);
			calculador.realizarCalculo(data.orcamento, data.imposto);
		}
		scan.close();
	}

	private static OrcamentoEImposto processarInput(String option, Orcamento orcamento) {
		// configura um tipo de imposto padrão
		Imposto imposto = new ISS();
		if ("2".equals(option)) {
			imposto = new ICMS();
		} else if ("3".equals(option)) {
			imposto = new ICPP();
		} else if ("4".equals(option)) {
			imposto = new IKCV();
		}
		return new OrcamentoEImposto(orcamento, imposto);
	}
}

class OrcamentoEImposto {
	Orcamento orcamento;
	Imposto imposto;

	public OrcamentoEImposto(Orcamento orcamento, Imposto imposto) {
		super();
		this.orcamento = orcamento;
		this.imposto = imposto;
	}
}
