package br.edu.ifg.recursividade;
import java.util.Scanner;

/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/09/03
 */
public class Recursividade {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
        int numero;
        Scanner recebe = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        numero = recebe.nextInt();
        imprimir(numero);
        System.out.println ("");
        imprimirDecrecente(numero);
    }

	private static void imprimir(int numero){
        if (numero>=0) {
            imprimir(numero-1);
        }
        System.out.print(numero + ", ");
    }

	private static void imprimirDecrecente(int numero){
        System.out.print(numero + ", ");
        if (numero>=0) {
            imprimir(--numero);
        }
    }

}
