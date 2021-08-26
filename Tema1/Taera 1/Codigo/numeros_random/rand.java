package numeros_random;

public class rand {

    private int alatorio;
    private final int cantidad;

    public rand(int cantidad) {
        this.cantidad = cantidad;
    }
    
    void generaNumeros() {
        for (int i = 1; i <= cantidad; i++) {
            alatorio = (int)(Math.random() * 1000);
            System.out.println("Nmero alatorio "+i+" = "+ alatorio);
        }
    }    
}
