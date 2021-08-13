package br.com.alura.alura_design_patterns.capitulo_2;

/**
 * Classe responsável por organizar a cadeia de processamento
 * 
 * @author Pedro Junior
 *
 * @param <T>, tipo de elemento que será processado pela cadeia
 */
public class HandlerChainOfResponsability<T> {
	private AbstractHandler<T> first;

	public HandlerChainOfResponsability() {
		super();
	}

	public void add(AbstractHandler<T> handler) {
		if (first == null) {
			first = handler;
			return;
		}

		AbstractHandler<T> curr = first;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.setNext(handler);
	}

	public void execute(T value) {
		if (first == null) {
			throw new IllegalStateException("Handler chain is empty");
		}

		first.handle(value);
	}
}