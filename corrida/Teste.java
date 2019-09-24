package br.edu.ifg.corrida;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/09/24
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Teste {
	public static void main(String[] args) {
		 List<Integer> list = new ArrayList<Integer>();
		 List<Integer> list2 = new ArrayList<Integer>();
		 List<Integer> list3 = new ArrayList<Integer>();
	
		//Cria o vetor com 27 posições
		for(int i = 0; i < 24; i++) {
            int rnd = (int) (1 + Math.random() * 100); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
            list.add(rnd); // atribui o valor a cada indice do vetor
        }
		
		//Ordenar o vetor
		Collections.sort(list);
		
		
		System.out.println("Primeira Volta da Corrida " + list.toString()); 
		//Mostrar o vetor ordenado
		for(int i = 0; i < 24; i++) {
			 System.out.println(i+1 + "° Colocado:  " + list.get(i) + " minutos");
		 }
		
		
		
		//Remover os 7 ultimos
		for(int i = 0; i < 7; i++) {
			list.remove(list.size()-1);	
		}
		
		
		System.out.println("CLASSIFICADOS: " + list.toString());
		System.out.println("---------------------------------------------------------------------------------------------"); 
		
		
		
		
		
		
		//Cria o vetor com 17 posições
		for(int i = 0; i < 17; i++) {
			int rnd = (int) (1 + Math.random() * 100); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
			list2.add(rnd); // atribui o valor a cada indice do vetor
		}
				
		//Ordenar o vetor
		Collections.sort(list2);
				
				
		System.out.println("Segunda Volta da Corrida " + list2.toString()); 
		//Mostrar o vetor ordenado
		for(int i = 0; i < 17; i++) {
			System.out.println(i+1 + "° Colocado:  " + list2.get(i) + " minutos");
		}
		
		
		
		//Remover os 7 ultimos
		for(int i = 0; i < 7; i++) {
			list2.remove(list2.size()-1);	
		}
				
				
		System.out.println("CLASSIFICADOS: " + list2.toString());
		System.out.println("---------------------------------------------------------------------------------------------"); 
		
		
		
		//Cria o vetor com 17 posições
		for(int i = 0; i < 10; i++) {
			int rnd = (int) (1 + Math.random() * 100); // gera um valor randomico de 0.0 ate menores q 1.0, multiplica por 100 e soma 1. Convertendo o resultado para int.
			list3.add(rnd); // atribui o valor a cada indice do vetor
		}
						
		//Ordenar o vetor
		Collections.sort(list3);
						
						
		System.out.println("Terceira Volta da Corrida " + list3.toString()); 
		//Mostrar o vetor ordenado
		for(int i = 0; i < 10; i++) {
			System.out.println(i+1 + "° Colocado:  " + list3.get(i) + " minutos");
		}
					

	}
}
