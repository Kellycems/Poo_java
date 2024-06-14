package Polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args) {
        Cachorro c1 = new Cachorro();
        c1.reagir("Olá");
        c1.reagir(7);
        c1.reagir("Cachorro feio");
    }
}
