/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class Ej4NumPrimo {

    public static void main(String[] args) {
        int numero = 1;
        for(int i = 0; i<100; i++){
            if(esprimo(numero) == true){
                System.out.println(numero);
            }
            numero++;
        }

    }

    static boolean esprimo (int numero){

        for(int i=2; i<numero;i++){
            if(numero%i == 0){
                return false;
            }
        }
        return true;

    }

}
