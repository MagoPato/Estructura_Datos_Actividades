package Leer_numeros_arreglo;

import java.util.Scanner;

class numeros {
    private double numeros[] = new double[10];
    private double suma=0;
    Scanner teclado = new Scanner(System.in);

    public numeros() {
    }

    public void predirDatos() {
        int n = 0;
        for (int i = 0; i < numeros.length; i++) {
            n++;
            System.out.println("dime el numero " + n);
            numeros[i] = teclado.nextDouble();
        }
    }

    public void sumaimpares() {
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i]%2 !=0){
               suma+=numeros[i];
            }
        }
    }
    
    public double getSuma(){
        return suma;
    }
}
