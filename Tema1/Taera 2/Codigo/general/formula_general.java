package general;

import java.util.Scanner;

class formula_general {

    Scanner teclado = new Scanner(System.in);
    private double a, b, c, x1, x2, coeficientes;

    public formula_general() {
        a=b=c=x1=x2=coeficientes=0;
    }

    public void leerDatos() {
        System.out.println("Formula general ");
        System.out.println("dime el valo a ");
        setA(teclado.nextInt());
        System.out.println("dime el valo b ");
        setB(teclado.nextInt());
        System.out.println("dime el valo c ");
        setC(teclado.nextInt());
    }

    public void resolucion() {
        setCoeficientes((getB() * getB()) - (4 * getA() * getC()));
        setX1((-getB() + Math.sqrt(getCoeficientes())) / (2 * getA()));
        setX2((-getB() - Math.sqrt(getCoeficientes())) / (2 * getA()));
    }

    public void mostar() {
        if (getCoeficientes() > 0) {
            System.out.println("x1 " + getX1());
            System.out.println("x2 " + getX2());
            System.out.println("la ecuacion tiene dos soluciones");
        } else if (getCoeficientes() == 0) {
            System.out.println("x1 " + getX1());
            System.out.println("x2 " + getX2());
            System.out.println("la ecuacion tiene una soluciones");
        } else {
            System.out.println("x1 " + getX1());
            System.out.println("x2 " + getX2());
            System.out.println("la ecuacion no tiene soluciones");
        }
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getCoeficientes() {
        return coeficientes;
    }

    public void setCoeficientes(double coeficientes) {
        this.coeficientes = coeficientes;
    }
}
