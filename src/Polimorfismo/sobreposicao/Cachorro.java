package Polimorfismo.sobreposicao;

public class Cachorro extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("Cachorro correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ração");
    }

    @Override
    public void emitirSom() {
       System.out.println("AUAU");
    }
}
