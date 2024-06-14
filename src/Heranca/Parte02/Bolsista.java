package Heranca.Parte02;

public class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando a bolsa");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade de bolsista");
    }

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
