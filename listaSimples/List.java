package br.edu.ifg.listaSimples;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/09/03
 */
public class List {

	private Node head;
	private Node last;
	private int size;

	public List() {
		head = null;
		size = 0;
		last = null;
	}

	public int getSize() {
		return size;
	}

	public void insert(int value) {
		Node node = new Node(value);
		node.setNext(head);
		head = node;
		size++;
	}

	public void insertFinal(int value) {
		Node node = new Node(value);
		if (head == null) {
			head = node;
		} else {
			last.setNext(node);
		}
		last = node;
		size++;
	}

	public boolean remove(int value) {
		Node current = head;
		Node sentinel = null;
		while (current != null && current.getValue() != value) {
			sentinel = current;
			current = current.getNext();
		}
		if (current == null) {
			return false;
		} else {
			if (current == head) {
				head = head.getNext();
			} else {
				sentinel.setNext(current.getNext());
			}
			size--;
			return true;
		}
	}

	@Override
	public String toString() {
		String listString = "";
		Node atual = head;
		for (int i = 0; i < size; i++) {
			listString += atual.getValue() + " ";
			atual = atual.getNext();
		}
		return listString;
	}
}
