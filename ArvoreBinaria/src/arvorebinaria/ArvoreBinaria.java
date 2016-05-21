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
public class ArvoreBinaria {
    
    Node raiz;
    
    public Node criarRaiz (int valor) {
        if (raiz != null)
            System.out.println("Raiz já criada");
        else
            raiz = new Node (valor);
        return raiz;
    }
    
    public Node inserirEsquerda (Node no, int valor) {
        no.filhoEsquerdo = new Node (valor);
        return no.filhoEsquerdo;
    }
    
    public Node inserirDireita (Node no, int valor) {
        no.filhoDireito = new Node (valor);
        return no.filhoDireito;
    }
    
    void exibePreOrdem (Node no) {
        System.out.println (no.valor);
        if (no.filhoEsquerdo != null) {
            exibePreOrdem (no.filhoEsquerdo);
        }
        if (no.filhoDireito != null) {
            exibePreOrdem (no.filhoDireito);
        }
    }

    
}
