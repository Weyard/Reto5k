/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.examenkairos;
import org.apache.commons.lang3.StringUtils;


/**
 *
 * @author juanjo.perez
 */
public class Principal {
    public static void main(String[] args) {
        String frase = "Cómo será dar con Nekgikis V...";
        int[] ordre = new int[]{23, 24, 25, 18, 19, 5, 6, 7, 20, 15, 17, 8, 10, 11, 4, 3,12, 2, 16, 14, 9, 21, 0, 1, 13, 22};
        String frase2 = StringUtils.stripAccents(frase);
        frase2 = frase2.toLowerCase();
        frase2 = StringUtils.deleteWhitespace(frase2);
        char[] fraseArray = new char[frase2.length()];
        for(int i = 0;i<frase2.length();i++){
            fraseArray[ordre[i]] = frase2.charAt(i);
        }
        System.out.println("La URL es : " + String.valueOf(fraseArray));
    }
}

