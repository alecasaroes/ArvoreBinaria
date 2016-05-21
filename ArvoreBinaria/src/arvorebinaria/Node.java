/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arvorebinaria;

/**
 *
 * @author alexandre.gcazaroes1
 */
public class Node {
    
    int valor;
    Node filhoEsquerdo;
    Node filhoDireito;

    public Node(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getFilhoEsq() {
        return filhoEsquerdo;
    }

    public void setFilhoEsq(Node filhoEsq) {
        this.filhoEsquerdo = filhoEsq;
    }

    public Node getFilhoDir() {
        return filhoDireito;
    }

    public void setFilhoDir(Node filhoDir) {
        this.filhoDireito = filhoDir;
    }
    
}
