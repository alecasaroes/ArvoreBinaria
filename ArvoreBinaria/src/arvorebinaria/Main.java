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
        
        CriarArvore arvoreBinaria = new CriarArvore();
        
        arvoreBinaria.criarRaiz(10);
        arvoreBinaria.inserirFilhoEsq(20);
        arvoreBinaria.inserirFilhoDir(30);
        arvoreBinaria.inserirFilhoEsq(40);
    }
    
}
