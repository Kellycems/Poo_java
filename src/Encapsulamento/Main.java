package Encapsulamento;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.abrirMenu();
        c.ligar();
        c.maisVolume();
        c.play();
        c.abrirMenu();

    }
}
