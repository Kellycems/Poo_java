package Exercicios.contabancaria;

public class Main {
   public static void main(String[] args) {
        ContaBancaria p1 = new ContaBancaria();
        p1.setDono("Kelly");
        p1.setNumConta(123);
        p1.abrirConta("cc");
        p1.depositar(100);
        p1.estadoAtual();
        
   }
}
