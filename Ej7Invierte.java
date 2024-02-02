/*
 * Crea un programa que invierta el orden de una cadena de texto
 * sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */


public class Ej7Invierte {

    public static void main(String[] args) {
        String cadena = "Hola";
        cadena = invierteCadena(cadena);
        System.out.println(cadena);

    }

    public static String invierteCadena(String cadena){
        
        char [] arreglo;
        char [] arregloinv = new char[cadena.length()];
        int longitud = cadena.length();
        arreglo = cadena.toCharArray();
        for(int i=0;i<longitud;i++){
            arregloinv[i]=arreglo[cadena.length()-i-1]; // Debe ser -i-1 ya que el valor de la longitud de la cadena es 4 pero con los arreglos comienzo en 0 (por tanto 4 letras es del 0 al 3)
        }
        return String.valueOf(arregloinv);
    }

}
