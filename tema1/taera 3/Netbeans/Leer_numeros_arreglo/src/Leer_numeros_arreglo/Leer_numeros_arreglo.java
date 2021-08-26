/*
       poo
       Leer 10 valores desde el teclado y almacenarlos en un arreglo 
       unidimensional, se desea calcular e imprimir la suma de los 
       valores impares almacenados en el arreglo
 */
package Leer_numeros_arreglo;

public class Leer_numeros_arreglo {

    public static void main(String[] args) {
        numeros numeros = new numeros();
        numeros.predirDatos();
        numeros.sumaimpares();
        System.out.print("la suma de los numeros impares es "+numeros.getSuma());
    }
    
}
