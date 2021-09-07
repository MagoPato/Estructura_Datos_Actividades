package recursi_uniddad2;

import java.util.Scanner;

public class Recursi_uniddad2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Fibonacci Fibonacci = new Fibonacci();
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("dime hasta que posicion quieres ver la seria de Fibonacci");
        n = teclado.nextInt();
        if (n > 0) {
            Fibonacci.setTam(n);
            Fibonacci.mostraSerie();
        } else {
            System.out.println("pone numeros mayores a 0");
        }
    }
}
