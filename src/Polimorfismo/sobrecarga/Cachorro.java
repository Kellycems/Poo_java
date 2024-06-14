package Polimorfismo.sobrecarga;

public class Cachorro extends Lobo{
    @Override
    public void emitirSom(){
        System.out.println("Som de cachorro");
    }

    //Sobrecarga -> Mesmo método com assinaturas diferentes na mesma classe
    public void reagir( String frase){
        if(frase.equals("Toma comida") || frase.equals("Olá")){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("rosnar");
        }
    }
    public void reagir( int hora){
        if(hora > 22 || hora < 8){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }

}
