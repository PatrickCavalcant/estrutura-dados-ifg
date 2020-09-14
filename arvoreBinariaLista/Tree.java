package br.edu.ifg.arvoreBinaria;

import java.util.Stack;
/**
 * @author Patrick Cavalcante Moraes	
 * @date 2020/09/02
 */
public class Tree {

    private Node root;       // primeiro n� da arvore(N� raiz)


    /**
     *  Contrutor sem n�s na �rvore ainda
     */
    public Tree() {
        this.root = null;
    }

    /**
     * Localiza n� com chave dada (assume que a �rvore n�o vazia)
     *
     * @param key
     * @return A localiza��o do n� buscado.
     */
    public Node find(int key) {
        Node current = this.root;  //come�a na raiz

        while (current.keyData != key) {  //enquanto o dado chave n�o for o valor procurado ele vai percorrer os n�s ate achar.
            if (key < current.keyData) {  ///vai para esquerda
                current = current.leftChild;
            } else {                       // se n�o achar vai para direita.
                current = current.rightChild;
            }
            if (current == null) {        // se n�o h� filho.
                return null;            // n�o localizado.
            }
        }
        return current;                //Localidado.
    }

    /**
     * Insert cria um novo n� na arvore e insere dados nela.
     *
     * @param keyValue
     * @param value
     */
    public void insert(int keyValue, String value) {
        Node node = new Node();     // Cria um novo n�
        node.keyData = keyValue;    //insere os dados
        node.data = value;
        if (this.root == null) {    //verifica se a raiz e nula
            this.root = node;
        } else {                    //raiz ocupada
            Node current = this.root;// come�a na raiz
            Node parent;
            while (true) {          //sai internamente
                parent = current;
                if (keyValue < current.keyData) { //vai para esquerda?
                    current = current.leftChild;
                    if (current == null) {      // se for o fim da linha,
                        parent.leftChild = node;    //insere a esquerda.
                        return;
                    }
                } else {                          //ou para direita?
                    current = current.rightChild;
                    if (current == null) {      // se for o fim da linha,
                        parent.rightChild = node;//insere a direita.
                        return;
                    }
                }
            }
        }
    }
    /**
     * Elimina um n� da arvore com a chave passada por parametro.
     *
     * @param key
     * @return True quando eleiminar op n� passado por parametro
     */
    public boolean delete(int key) {
        Node current = this.root;
        Node parent = this.root;
        boolean isLeftChild = true;

        while (current.keyData != key) { //busca o n�
            parent = current;
            if (key < current.keyData) {//vai para esquerda?
                isLeftChild = true;
                current = current.leftChild;
            } else {                    //ou para a direita?
                isLeftChild = false;
                current = current.rightChild;
            }
            if (current == null) {//n� n�o encontrado return falso
                return false;
            }
        }
      //se o n� desejado n�o possuir filhos(ou seja for folha), simplesmente o elimine

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null; //se a raiz for vazia
            } else if (isLeftChild) {
                parent.leftChild = null;// desconecta do pai
            } else {
                parent.rightChild = null;
            }

            //se n�o e filho � direita, substitui pela sub�rvore � esquerda
        } else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }

            //se n�o e filho � esquerda, substitui pela sub�rvore � direita.
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        } else {// se os dois s�o filhos, subistituia o sucessor em ordem
        	 //obter o sucessor do n� para exclus�o
            Node sucessor = getSucessor(current);
            // conecta o parente atual com o sucessor
            if (current == root) {
                this.root = sucessor;
            } else if (isLeftChild) {
                parent.leftChild = sucessor;
            } else {
                parent.rightChild = sucessor;
            }
          //conecte o sucessor ao filho � esquerda de current
            sucessor.leftChild = current.leftChild;
        }
        //sucessor n�o pode ter filhos a esquerda
        return true;
    }
    /**
     * Retorna n� com pr�ximo valor mais alto depois de delNode, vai para o
     * filho a direita, depois para o filho a esquerda
     *
     * @param delNode
     * @return
     */
    private Node getSucessor(Node delNode) {
        Node sucessorParent = delNode;
        Node sucessor = delNode;
        Node current = delNode.rightChild;  //vai para filho a direita ate n�o haver mais

        while (current != null) {// filhos a esquerda vai para filho a esquerda
            sucessorParent = sucessor;
            sucessor = current;
            current = current.leftChild;
        }
        if (sucessor != delNode.rightChild) {// se o sucessor n�o e filho a direita, faz conex�o
            sucessorParent.leftChild = sucessor.rightChild;
            sucessor.rightChild = delNode.rightChild;
        }
        return sucessor;
    }

    public void traverse(int traverseType) {
        switch (traverseType) {
            case 1:
                System.out.println("\n Travessia preOrder: ");
                preOrder(this.root);
                break;
            case 2:
                System.out.println("\n Travessia inOrder: ");
                inOrder(this.root);
                break;
            case 3:
                System.out.println("\n Travessia postOrder: ");
                postOrder(this.root);
                break;
        }
        System.out.println();
    }

    private void preOrder(Node localRoot) {

        if (localRoot != null) {
            System.out.println(localRoot.data + " ");
            preOrder(localRoot.leftChild);
            preOrder(localRoot.rightChild);
        }
    }

    private void inOrder(Node localRoot) {

        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.println(localRoot.data + " ");
            inOrder(localRoot.rightChild);
        }
    }

    private void postOrder(Node localRoot) {

        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            inOrder(localRoot.rightChild);
            System.out.println(localRoot.data + " ");
        }
    }

    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(this.root);
        int nBlanks = 32;
        boolean isRowEmpty = false;

        System.out.println("--------------------------------------------------");
        while (isRowEmpty == false) {
            Stack localStack = new Stack();
            isRowEmpty = true;

            for (int i = 0; i < nBlanks; i++) {
                System.out.println(' ');
            }

            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.leftChild);
                    localStack.push(temp.rightChild);

                    if (temp.leftChild != null || temp.rightChild != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.println("- -");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int i = 0; i < nBlanks * 2 - 2; i++) {
                    System.out.println(' ');
                }
            }
            System.out.println();
            nBlanks /= 2;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());
            }
        }
        System.out.println("--------------------------------------------------");
    }
}
