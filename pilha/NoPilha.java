package br.edu.ifg.pilha;

public class NoPilha {
	private String valor;
	private NoPilha prox;

	public NoPilha() {
	}

	public NoPilha(String valor) {
		this.valor = valor;
		prox = null;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public NoPilha getProx() {
		return prox;
	}

	public void setProx(NoPilha prox) {
		this.prox = prox;
	}
}