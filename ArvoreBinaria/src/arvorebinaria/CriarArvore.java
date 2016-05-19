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
public class CriarArvore {
    
    Node raiz;
    
    
    public void criarRaiz (int valor) {
        if (raiz != null){
            System.out.println("Raiz já criada");
            return;
        }
        raiz = new Node (valor);
        raiz.filhoDir = null;
        raiz.filhoEsq = null;
    }
    
    public void inserirFilhoEsq (int valor) {
        raiz.filhoEsq = new Node (valor);
        

    }
    
    public void inserirFilhoDir (int valor) {
        raiz.filhoDir = new Node (valor);
    }

    
}
