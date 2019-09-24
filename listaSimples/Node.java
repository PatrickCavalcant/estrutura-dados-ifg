package br.edu.ifg.listaSimples;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/09/03
 */
public class Node {

	private int value;
	private Node next;

	public Node() {
		value = 0;
		next = null;
	}

	public Node(int number) {
		setValue(number);
		setNext(null);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

}
