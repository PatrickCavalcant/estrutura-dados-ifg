package br.edu.ifg.corrida;

public class Lista {
	private No inicio = null;
	private int tamanho = 0;
	private No ultimo = null;

	public Lista() {
		inicio = null;
		tamanho = 0;
		ultimo = null;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void add(int valor) {// add fim
		No node = new No(valor);
		if (inicio == null) {
			inicio = node;
			node.setAnterior(null);
		} else {
			ultimo.setProximo(node);
			node.setAnterior(ultimo);
		}
		ultimo = node;
		tamanho++;
	}

	public boolean remover(int valor) {
		No atual = inicio;
		while (atual != null && atual.getValor() != valor) {
			atual.setAnterior(atual);
			atual = atual.getProximo();
			//current.setNext(current.getNext());
		}
		if (atual == null) {
			return false;
		} else {
			if (atual == inicio) {
				inicio = atual.getProximo();
				atual.setProximo(atual.getProximo());
			} else if (atual == ultimo) {
				atual.getAnterior().setProximo(atual.getProximo());
				atual.setAnterior(atual.getProximo());
			} else {
				atual.getAnterior().setProximo(atual.getProximo());
				atual.getProximo().setAnterior(atual.getAnterior());
			}
			tamanho--;
			return true;
		}
	}

	public String nodeAnterior() {
		String listString = "";
		No atual = ultimo;
		for (int i = 0; i < tamanho; i++) {
			listString += atual.getValor() + " ";
			atual = atual.getAnterior();
		}
		return listString;
	}

	@Override
	public String toString() {
		String listString = "";
		No atual = inicio;
		for (int i = 0; i < tamanho; i++) {
			listString += atual.getValor() + " ";
			atual = atual.getProximo();
		}
		return listString;
	}

}
