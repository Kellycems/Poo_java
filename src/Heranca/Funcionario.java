package Heranca;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalhando(){
        this.trabalhando = !this.trabalhando;
    }


    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return this.trabalhando;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
