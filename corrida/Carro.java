package br.edu.ifg.trabalho;
/**
 * Classe de geração dos metodos principais
 *  
 * @author Patrick Cavalcante Moraes
 * @date 2019/10/04
 */
public class Carro {
	private Carro proximo;
	private Carro anterior;
	private int carro;
	private int posicao;
        private int tempo; 
        
        
     /**
      *  O getTempo recebe o valor do objeto tempo
      * @return
      */
        
    public int getTempo() {
        return tempo;
    }
    
    
    
    /**
     * setTempo aplica valor instanciado do objeto
     * @param tempo
     */
    public void setTempo(int tempo) {
        this.tempo = tempo;
    }
    
   
	public Carro() {
		proximo = null;
		anterior = null;
		carro = 0;
		posicao = 0;
                tempo = 0;
	}
	
	
	
	/**
	 * setTempo e setCarro aplica valor instanciado do objeto
	 * @param carro
	 * @param tempo
	 */
	public Carro(int carro, int tempo) {
		setCarro(carro);
		setProximo(null);
		setAnterior(null);
                setTempo(tempo);
	}
        public Carro(int tempo) {
        setProximo(null);
        setAnterior(null);
                setTempo(tempo);
	}

        
      
	public Carro getProximo() {
		return proximo;
	}
	
	
	/**
	 * setProximo aplica valor instanciado do objeto
	 * @param proximo
	 */
	public void setProximo(Carro proximo) {
		this.proximo = proximo;
	}
	
	
	/**
	 * O getAnterior recebe o valor do objeto anterior
	 * @return
	 */
	public Carro getAnterior() {
		return anterior;
	}
	/**
	 * setAnterior aplica valor instanciado do objeto
	 * @param anterior
	 */
	public void setAnterior(Carro anterior) {
		this.anterior = anterior;
	}
	
	
	
	/**
	 * O getCarro recebe o valor do objeto carro
	 * @return
	 */
	public int getCarro() {
		return carro;
	}
	/**
	 * setCarro aplica valor instanciado do objeto
	 * @param carro
	 */
	public void setCarro(int carro) {
		this.carro = carro;
	}
	
	
	
	/**
	 * O getPosicao recebe o valor do objeto posicao
	 * @return
	 */
	public int getPosicao() {
		return posicao;
	}
	/**
	 * setPosicao aplica valor instanciado do objeto
	 * @param posicao
	 */
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	

	

}
