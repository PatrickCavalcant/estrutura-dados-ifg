package br.edu.ifg.pilha;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pilha p = new Pilha();
		String texto = "TESTE";
		String inv ="";
		int y;
		//empilhar
		for(int x= 0; x < texto.length(); x++){
			y = x + 1;
			p.push(texto.substring(x, y));
		}
		//Desempilhar
		while(p.isFull()){
			inv = inv + p.pop();
		}
		System.out.println(inv);
	}

}
