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
    
    Object valor;
    Node filhoEsq;
    Node filhoDir;

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public Node getFilhoEsq() {
        return filhoEsq;
    }

    public void setFilhoEsq(Node filhoEsq) {
        this.filhoEsq = filhoEsq;
    }

    public Node getFilhoDir() {
        return filhoDir;
    }

    public void setFilhoDir(Node filhoDir) {
        this.filhoDir = filhoDir;
    }


}
