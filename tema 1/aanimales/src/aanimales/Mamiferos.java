package aanimales;

import java.util.Scanner;

public class Mamiferos {

    private String familia;
    private String nombregemeral;
    private int edad;
    private int crias;
    Scanner teclado = new Scanner(System.in);

    public Mamiferos(String nombregemeral, String familia, int edad) {
        this.familia = familia;
        this.nombregemeral = nombregemeral;
        this.edad = edad;
    }

    public Mamiferos(String nombregemeral, String familia) {
        this.familia = familia;
        this.nombregemeral = nombregemeral;
        this.edad = 0;
    }

    public Mamiferos(String familia, int edad) {
        this.familia = familia;
        this.nombregemeral = " sin nombre";
        this.edad = edad;
    }

    public Mamiferos(int edad) {
        this.familia = "sin familia";
        this.nombregemeral = "sin nombre";
        this.edad = edad;
    }

    public Mamiferos() {
        this.familia = "sin familia";
        this.nombregemeral = "sin nombre";
        this.edad = 0;
    }

    public void tienecrias() {
        System.out.println("dime cuantas crias tienes");
        crias = teclado.nextInt();
    }

    public void imprimi() {
        System.out.println("el nombre general es" + nombregemeral
                + "la familia es " + familia
                + " la edad es " + edad
                + " tiene" + crias + "crias");
    }
}
