package br.edu.ifg.corrida;

public class No {
	private No proximo;
	private No anterior;
	private int valor;
	
	public No() {
		proximo = null;
		anterior = null;
		valor = 0;
	}
	
	public No(int valor) {
		setValor(valor);
		setProximo(null);
		setAnterior(null);
	}

	public No getProximo() {
		return proximo;
	}

	public void setProximo(No proximo) {
		this.proximo = proximo;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
