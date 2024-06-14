package Polimorfismo.sobreposicao;

public class Gato extends Mamifero {
    @Override
    public void locomover() {
        System.out.println("Gato pulando pelas coisas");
    }

    @Override
    public void alimentar() {
        System.out.println("Tomando leite");
    }

    @Override
    public void emitirSom() {
       System.out.println("MIAU");
    }
}
