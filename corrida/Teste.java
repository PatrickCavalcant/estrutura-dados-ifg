package br.edu.ifg.trabalho;
/**
 * Classe de teste da corrida
 * 
 * @author Patrick Cavalcante Moraes 
 * @date 2019/10/04
 */
import java.util.Random;

public class Teste {

    public static void main(String[] args) {
    	Lista list = new Lista();
    	//Cria a lista com 24 posições
        Random aleatorio = new Random();
        for (int i = 1; i < 25; i++) {
            list.adicionar(i, aleatorio.nextInt(500));

        }
        
       
        System.out.println("PRIMEIRA VOLTA");
        //Mostrar os valores ordenados
        list.Ordenar();
        System.out.println(list.primeiraVolta());
        
     
        System.out.println("SEGUNDA VOLTA");
        //Trocar o valor das 17 posições classificadas
        list.trocarValor(17);
        //Ordenar os 17 valores
        list.Ordenar();
       //Mostrar a lista ordenada com os 17 valores
        System.out.println(list.segundaVolta());
        
      
        
        System.out.println("TERCEIRA VOLTA");
        //Trocar o valor das 10 posições classificadas
        list.trocarValor(10);
        //Mostrar a lista ordenada com os 10 valores
        list.Ordenar();
       //Mostrar a lista ordenada com os 10 valores
        System.out.println(list.terceiraVolta());
        
        
        
        

    }
}
