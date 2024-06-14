package Polimorfismo.sobreposicao;

public abstract class Animal {
    protected int idade;
    protected float peso;
    protected int membros;

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

}
