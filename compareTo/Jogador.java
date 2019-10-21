package br.edu.ifg.compareTo;
/**
 * @author Patrick Cavalcante Moraes
 * @email patrick0000.pc@gmail.com	
 * @date 2019/10/21
 */
public class Jogador  implements Comparable<Jogador>{
	public String nome;
	public String pontuacao;
	public String clube;
	public String pais;
	
	public Jogador (String nome,String pontuacao, String clube, String pais) {
		// TODO Auto-generated method stub
		
		this.nome = nome;
		this.pontuacao = pontuacao;
		this.clube = clube; 
		this.pais = pais;
	}
	public String getNome() {
		 return nome;
	 }
	
	public String getPontuacao() {
		 return pontuacao;
	 }
	
	public String getClube() {
		 return clube;
	 }
	
	public String getPais() {
		 return pais;
	 }
	 
	public String toString() {
		return "Pontuação: " + pontuacao + "  Nome: " + nome + "  Clube: "+ clube+ "  Pais: " + pais + "\r\n";
	}

	@Override
	public int compareTo(Jogador col) {
		// TODO Auto-generated method stub
		return this.pontuacao.compareTo(col.pontuacao);
	}

}
