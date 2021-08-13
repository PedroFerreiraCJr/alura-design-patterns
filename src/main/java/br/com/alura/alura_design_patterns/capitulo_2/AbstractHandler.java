package br.com.alura.alura_design_patterns.capitulo_2;

/**
 * Abstração que deve ser seguida por cada implementação concreta
 * 
 * @author Pedro Junior
 *
 * @param <T>, tipo do elemento que deve ser processado pela cadeia
 */
public abstract class AbstractHandler<T> implements Handler<T> {
	protected AbstractHandler<T> next;

	@Override
	public final void handle(T request) {
		if (accept(request)) {
			if (execute(request)) {
				return;
			}
		}
		next(request);
	}

	@Override
	public void next(T request) {
		if (this.next != null) {
			this.next.handle(request);
		}
	}

	@Override
	public void setNext(Handler<T> next) {
		this.next = (AbstractHandler<T>) next;
	}
}