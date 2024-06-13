package Relacionamento;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;


    public Luta() {
    }

    public Luta(Lutador desafiante, Lutador desafiado, int rounds, boolean aprovado) {
        this.desafiante = desafiante;
        this.desafiado = desafiado;
        this.rounds = rounds;
        this.aprovado = aprovado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovado() {
        return this.aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }


    //Metódos 
    public void marcarLuta(Lutador l1, Lutador l2){
        if(l1.getCategoria() == l2.getCategoria() && !l1.equals(l2)){
            aprovado = true;
            desafiado = l1;
            desafiante = l2;
        }else{
            aprovado = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar(){
        if(this.getAprovado()){
            System.out.println("###DESAFIADO###");
            desafiado.apresentar();
            System.out.println("###DESAFIANTE###");
            desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("========RESULTADO DA LUTA========");
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
            
                case 1:
                    System.out.println("Venceu " + desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("Venceu " + desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
            System.out.println("====================");

        }else{
            System.out.println("Essa Luta não foi aprovada!");
        }
    }
}
