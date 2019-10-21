package br.edu.ifg.compareTo;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/10/21
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainLista {
		public static void main(String[] args) {
					

				List<Jogador> jogadores = new ArrayList<Jogador>();
				jogadores.add(new Jogador("Matheus Rui", "5", "Bahia", "Brasil"));
				jogadores.add(new Jogador("Patrick Cavalcante", "1", "Flamengo", "Brasil"));
				jogadores.add(new Jogador("Lionel Messi", "8", "Barcelona", "Argentina"));
				jogadores.add(new Jogador("João Bola", "3", "Luziânia", "Brasil"));
				jogadores.add(new Jogador("Ramiro Victor", "6", "Joenvile", "Brasil"));
				jogadores.add(new Jogador("Pepe Moreno", "7", "Acre", "Brasil"));
				jogadores.add(new Jogador("Felipe Teles", "2", "Goiás", "Brasil"));
				jogadores.add(new Jogador("Hugo Freitas", "4", "BSB", "Brasil"));
				
	
		
				jogadores.sort(Comparator.comparing(Jogador::getPontuacao));
				System.out.println(jogadores);
		}

}
