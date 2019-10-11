package br.edu.ifg.trabalho;
/**
 * @author Patrick Cavalcante Moraes 
 * @date 2019/10/04
 */
import java.util.Random;

public class Lista {

    private Carro head = null;
    private int tamanho = 0;
    private Carro ultimo = null;

    public Lista() {
        head = null;
        tamanho = 0;
        ultimo = null;
    }
    /**
     * get tamanho mostra o tamanho total da lista
     * @return 
     */
    public int getTamanho() {
        return tamanho;
    }
    
    
    
    
    /**
     * adicionar cria a lista duplamente encadeada com o tempo e o carro 
     * @param carro
     * @param tempo
     */
    // adicionar fim
    public void adicionar(int carro, int tempo) {
        Carro node = new Carro(carro, tempo);
        if (head == null) {
            head = node;
            node.setAnterior(null);
        } else {
        	ultimo.setProximo(node);
            node.setAnterior(ultimo);
        }
        ultimo = node;
        tamanho++;
    }
       
    
    
    
    
    /**
     * remover tem a função de remover a posição da lista 
     * @param carro
     * @param posicao
     * @return
     */
    //Remover o valor da lista
    public boolean remover(int carro, int posicao) {
        Carro atual = head;
        while (atual != null && atual.getCarro() != carro && atual.getPosicao() != posicao) {
        	atual.setAnterior(atual);
        	atual = atual.getProximo();
        }
        if (atual == null) {
            return false;
        } else {
            if (atual == head) {
                head = atual.getProximo();
                atual.setProximo(atual.getProximo());
            } else if (atual == ultimo) {
            	atual.getAnterior().setProximo(atual.getProximo());
            	atual.setAnterior(atual.getProximo());
            } else {
            	atual.getAnterior().setProximo(atual.getProximo());
            	atual.getProximo().setAnterior(atual.getAnterior());
            }
            tamanho--;
            return true;
        }
    }

    
    
    
    
    
    /**
     * ordenar possui a função de ordenar a lista
     */
   //Ordenar a lista
    public void Ordenar() {
        Carro aux = this.head;

        while (aux != null) {
            Carro prox = aux.getProximo();
            while (prox != null) {
                if (aux.getTempo() > prox.getTempo()) {
                    int carroAux = aux.getCarro();
                    aux.setCarro(prox.getCarro());
                    prox.setCarro(carroAux);

                    int tempoAux = aux.getTempo();
                    aux.setTempo(prox.getTempo());
                    prox.setTempo(tempoAux);
                }
                prox = prox.getProximo();
            }
            aux = aux.getProximo();
        }
    }
    
    
    
    
    
    /**
     * trocarValor possui a função de trocar o valor da lista de acordo com a quantidade passada
     * @param quantidade
     */
    public void trocarValor(int quantidade ) {
    	Random aleatorio = new Random();
    	int tamanho = 0;
        Carro aux = head;
 
       
            while (aux != null && tamanho <= quantidade) {
            	aux.setTempo(aleatorio.nextInt(500));
            	aux = aux.getProximo();
            	tamanho++;
            }
 
    }
    
    
    
    
    
    /**
     * primeiraVolta mostra os valores da primeira lista por completo
     * @return
     */
    public String primeiraVolta() {
        String listString = "";
        Carro atual = head;
        for (int i = 0; i < tamanho; i++) {
        	listString +=  (i+1) + "° Carro: " + atual.getCarro() + " tempo: " + atual.getTempo() +"  minutos"+ " \n";
        	atual = atual.getProximo();
        }
        return listString;
    }
    
    
    
    
    /**
     * segundaVolta mostra os valores da segunda lista menos 7 posições
     * @return
     */
    public String segundaVolta() {
        String listString = "";
        Carro atual = head;
        for (int i = 0; i < tamanho - 7; i++) {
            listString += (i+1) + "° Carro: " + atual.getCarro() + " tempo: " + atual.getTempo() +"  minutos"+ " \n";
            atual = atual.getProximo();
        }
        return listString;
    }
    
    
    
    
    /**
     * terceiraVolta mostra os valores da segunda lista menos 14 posições
     * @return
     */
    public String terceiraVolta() {
        String listString = "";
        Carro atual = head;
        for (int i = 0; i < tamanho - 14; i++) {
            listString += (i+1) + "° Carro: " + atual.getCarro() + " tempo: " + atual.getTempo() +"  minutos"+ " \n";
            atual = atual.getProximo();
        }
        return listString;
    }
    
    
    
    
    /**
     * isVazia mostra se a lista estiver vazia
     * @return
     */
    public boolean isVazia() {
        return this.head == null;
    }

}
