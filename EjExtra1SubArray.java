import java.util.Scanner;
import java.io.*;
import java.util.*;
public class EjExtra1SubArray {
        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int numeroElementos = scan.nextInt();
        int [] array = new int [numeroElementos];
        int sumatodo = 0;
        //Lleno el array
        
        for(int i=0;i<numeroElementos;i++){
            array [i] = scan.nextInt();
        }
        //Llamo tantas veces a mi funcion como numero de elementos para ir sacando la primera 
        //1 digito, la segunda dos... hasta sacar/sumar todos los del array
        for(int i=0;i<numeroElementos;i++){
            sumatodo = sumatodo + subcadenas(array,i+1);
        }
        
        System.out.println(sumatodo);
    }
    
    //La funcion subcadenas me ayuda a dar la suma de ciertos digitos seguidos del array (num)
    //es decir, si es de dos elementos sumare los pares de digitos contiguos de izq a der
    //cada una de estas sumas individualmente es evaluada, si su resultado es negativo incremento 
    //el contador para saber precisamente el numero de sumas negativas del array
    //Este proceso se realiza desde tomar digito a digito hasta sumar todos los elementos del arreglo
    public static int subcadenas ( int [] n, int num){
        int negativeSums = 0;
        for (int i=0;i<n.length+1-num;i++){ // <-- por ejemplo, en un arreglo de 5 elementos y ytomando 3 digitos de el contiguos, solamente podria realizar la suma 3 veces acompletando 3 elementos cada vez por eso (i<5+1-3 = 3 veces) 
            int ite = 0;
            int suma = 0;
            int j = i;
            do{
                //int j = i;
                suma = suma + n[j];
                ite++;
                j++;
            }while(ite < num);
            if(suma < 0){
                negativeSums ++;
 
            }
        }
        return negativeSums;
    }

}
