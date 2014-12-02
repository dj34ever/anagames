/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

/**
 *
 * @author david
 */
public class Palavra {

    public static String doGerarNovaPalavra() {
        int max = Lista.lista.length;
        int num = (int) (Math.random()*(max));
        String palavra = Lista.lista[num];
        
        return palavra;
    }
    private static String doAlterarLetras(String palavra){
        
        System.out.println();
         
        
       
        
        return palavra;
    }
}
