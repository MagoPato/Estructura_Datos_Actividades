package recursi_uniddad2;

public class Fibonacci {

    private int tam;

    public Fibonacci(int tam) {
        this.tam = tam;
    }

    public Fibonacci() {
        this.tam = 0;
    }

    void mostraSerie() {
        for (int i = 0; i <= getTam(); i++) {
            System.out.print(resolucion(i) + " ");
        }
    }

    int resolucion(int n) {
        if (n < 2) {
            return n;
        }
        return resolucion(n - 1) + resolucion(n - 2);
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }

}
