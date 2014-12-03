/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagrama;

import java.util.Random;

/**
 *
 * @author david
 */
public class Palavra {

    public static String[] doGerarNovaPalavra() {
        int max = Lista.lista.length;
        String[] palavra = new String[2];
        Random r = new Random();
        int num = new Random().nextInt(max);
        palavra[0] = (Lista.lista[num]);
        palavra[1] = (doAlterarLetras(r, palavra[0]));
        return palavra;
    }

    private static String doAlterarLetras(Random random, String palavra) {

        // Convert your string into a simple char array:
        char a[] = palavra.toCharArray();

        // Scramble the letters using the standard Fisher-Yates shuffle, 
        for (int i = 0; i < a.length - 1; i++) {
            int j = random.nextInt(a.length - 1);
            // Swap letters
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        return new String(a);

    }
}
