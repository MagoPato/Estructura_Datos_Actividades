package aanimales;

public class MamiferosPpl {
    //ATRIBUTOS

    //METODOS
    public static void main(String[] args) {
        Mamiferos Mamiferos1 = new Mamiferos("jirafa", "Giraffidae", 12);
        Mamiferos1.tienecrias();
        Mamiferos1.imprimi();

        Mamiferos Mamiferos2 = new Mamiferos("Delfin", "Cetaceos");
        Mamiferos2.tienecrias();
        Mamiferos2.imprimi();

        Mamiferos Mamiferos3 = new Mamiferos("Elefantes", 5);
        Mamiferos3.tienecrias();
        Mamiferos3.imprimi();

        Mamiferos Mamiferos4 = new Mamiferos(6);
        Mamiferos4.tienecrias();
        Mamiferos4.imprimi();

        Mamiferos Mamiferos5 = new Mamiferos();
        Mamiferos5.tienecrias();
        Mamiferos5.imprimi();
    }

}
