package br.edu.ifg.pilha;

//stack
public class Pilha {
	private NoPilha topo;
	private int qtd;

	public Pilha() {
		topo = null;
		qtd = 0;
	}


	public int getQtd() {
		return qtd;
	}
	
	public NoPilha getTopo() {
		return topo;
	}

	/**
	 * retorna se a pilha est� vazia
	 * 
	 * @return true or false
	 */
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		} else {
			return false;
		}
	}

	// est� cheio
	/**
	 * retorna se a pilha est� cheia
	 * 
	 * @return true or false
	 */
	public boolean isFull() {
		if (topo != null) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Simplesmente retorna o valor do n� que esta no topo da lista porem n�o exclui
	 * o n�.
	 * 
	 * @return atual.getValor() valor do n� que est� no topo
	 */
	public String peek() {
		if (topo == null) {
			return "";
		}
		NoPilha atual = topo;
		return atual.getValor();
	}

	/**
	 * retorna o valor do n� que esta no topo da lista e remove o n� da pilha.
	 * 
	 * @return n� que est� no topo
	 */
	public String pop() {// remove
		String x;
		NoPilha aux;
		if (topo == null) {
			return "";
		} else {
			aux = topo;
			x = topo.getValor();
			topo = topo.getProx();
			aux = null;
			System.gc();
			qtd--;
		}
		return x;
	}

	/**
	 * Incrementa um n� no topo da pilha.
	 * 
	 * @param valor
	 *            valor do NoPilha
	 */
	public void push(String valor) {// insere
		NoPilha novo = new NoPilha(valor);
		if (isEmpty()) {
			topo = novo;
		} else {
			novo.setProx(topo);
			topo = novo;
		}
		qtd++;
	}
}
