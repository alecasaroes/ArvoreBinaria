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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        
        Node raiz = arvoreBinaria.criarRaiz(30);
        Node x = arvoreBinaria.inserirEsquerda(raiz, 20);
        Node y = arvoreBinaria.inserirDireita(raiz, 40);
        Node z = arvoreBinaria.inserirEsquerda(x, 15);
        Node a = arvoreBinaria.inserirDireita(y, 50);
        Node b = arvoreBinaria.inserirDireita(a, 60);
        Node c = arvoreBinaria.inserirEsquerda(z, 10);
        Node d = arvoreBinaria.inserirEsquerda(b, 55);
        Node e = arvoreBinaria.inserirDireita(c, 13);
        
        arvoreBinaria.exibePreOrdem (raiz);
        
    }
    
}
