/*
 * Escribe una función que reciba dos palabras (String) y retorne
 * verdadero o falso (Bool) según sean o no anagramas.
 * - Un Anagrama consiste en formar una palabra reordenando TODAS
 *   las letras de otra palabra inicial.
 * - NO hace falta comprobar que ambas palabras existan.
 * - Dos palabras exactamente iguales no son anagrama.
 */

import java.util.Arrays;

public class Ej2Anagrama {

    public static void main(String[] args) {
        boolean decision;
        decision = EsAnagrama("hola", "aloh");
        if(decision){
            System.out.println("Es anagrama");
        }
        else 
         System.out.println("No es anagrama");
    
    }

    public static boolean EsAnagrama (String palabra1, String palabra2){

        char [] pa1;
        char [] pa2;
        if(palabra1.equals(palabra2)){
            return false;
        }
        pa1 = palabra1.toCharArray();
        Arrays.sort(pa1);
        pa2 = palabra2.toCharArray();
        Arrays.sort(pa2);
        palabra1=String.valueOf(pa1); //paso de nuevo del arreglo a un string
        palabra2=String.valueOf(pa2);
        //System.out.println(palabra1);
        //System.out.println(palabra2);
        if(palabra1.equals(palabra2)){
            return true;
        }
         else 
          return false;
        



    }

}
