
package br.edu.ifg.arvoreBinaria;
/**
 * @author Patrick Cavalcante Moraes	
 * @date 2020/09/02
 */
import java.io.*;
import java.util.*;
public class Node {
    String data;
    float keyData;
    public Node leftChild;    //filho à esquerda deste nó
    public Node rightChild;   //filho à direita deste nó
    
    public void displayNode(){  //exibe-nos
        System.out.print("{");
        System.out.print(this.keyData);
        System.out.print(",  ");
        System.out.print(this.data);
        System.out.print("}  ");
    }
}
