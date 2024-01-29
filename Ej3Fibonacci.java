/*
 * Escribe un programa que imprima los 50 primeros números de la sucesión
 * de Fibonacci empezando en 0.
 * - La serie Fibonacci se compone por una sucesión de números en
 *   la que el siguiente siempre es la suma de los dos anteriores.
 *   0, 1, 1, 2, 3, 5, 8, 13...
 */

public class Ej3Fibonacci {
    public static void main(String[] args) {
        
    long numeroFibo;
    long numeroFibo2=0;
    long numeroFibo1=1;
    int contador = 0;

    if(contador<2){
        System.out.println("0");
        System.out.println("1");
        numeroFibo1 = 1;
        numeroFibo2 = 0;
    }
    for(contador =2; contador<50;contador++){
        numeroFibo=numeroFibo1+numeroFibo2;
        System.out.println(numeroFibo);
        numeroFibo2=numeroFibo1;
        numeroFibo1=numeroFibo;
    }
    }


}
