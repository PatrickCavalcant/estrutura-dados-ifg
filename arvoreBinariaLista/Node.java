
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
    public Node leftChild;    //filho � esquerda deste n�
    public Node rightChild;   //filho � direita deste n�
    
    public void displayNode(){  //exibe-nos
        System.out.print("{");
        System.out.print(this.keyData);
        System.out.print(",  ");
        System.out.print(this.data);
        System.out.print("}  ");
    }
}
