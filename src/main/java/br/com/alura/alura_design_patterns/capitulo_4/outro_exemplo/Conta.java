package br.com.alura.alura_design_patterns.capitulo_4.outro_exemplo;

import java.util.Date;

public class Conta {
	private double saldo;
	private Date abertura;

	public Conta(double saldo, Date abertura) {
		super();
		this.saldo = saldo;
		this.abertura = abertura;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getAbertura() {
		return abertura;
	}

}
