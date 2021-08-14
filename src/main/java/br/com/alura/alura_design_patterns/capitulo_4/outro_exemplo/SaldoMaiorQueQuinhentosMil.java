package br.com.alura.alura_design_patterns.capitulo_4.outro_exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SaldoMaiorQueQuinhentosMil extends Filtro {
	public SaldoMaiorQueQuinhentosMil() {
		super(null);
	}

	public SaldoMaiorQueQuinhentosMil(Filtro outro) {
		super(outro);
	}

	@Override
	public List<Conta> filtrar(List<Conta> contas) {
		List<Conta> result = new ArrayList<>();
		for (final Conta c : contas) {
			if (c.getSaldo() > 500_000) {
				result.add(c);
			}
		}

		if (!result.isEmpty()) {
			return result;
		}

		if (this.outro == null) {
			return Collections.emptyList();
		}

		return this.outro.filtrar(contas);
	}
}