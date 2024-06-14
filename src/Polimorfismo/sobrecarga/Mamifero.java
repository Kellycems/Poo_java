package Polimorfismo.sobrecarga;
public class Mamifero extends Animal{
    protected String corPelo; 

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero corPelo(String corPelo) {
        setCorPelo(corPelo);
        return this;
    }
    
}
