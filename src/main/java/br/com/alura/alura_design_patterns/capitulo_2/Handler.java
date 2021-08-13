package br.com.alura.alura_design_patterns.capitulo_2;

/**
 * Interface genérica desenvolvida para generalizar a implementação
 * 
 * @author Pedro Junior
 *
 * @param <T>, tipo de elemento a ser processado
 */
public interface Handler<T> {
	void handle(T request);

	boolean accept(T request);

	boolean execute(T request);

	void next(T request);

	void setNext(Handler<T> next);
}