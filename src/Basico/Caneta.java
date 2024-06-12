public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    protected boolean tampada;

    public Caneta(String modelo, String cor, float ponta, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
    }
    public Caneta() {

    }


    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta: " + this.ponta);
        System.out.println("tampada: " + this.tampada);
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void escrever(){
        if(this.tampada == true){
            System.out.println("Não posso escrever! Estou tampada");
        }
        else{
            System.out.println("Estou escrevendo");
        }
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }


    public String getCor() {
        return this.cor;
    }


    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public boolean isTampada() {
        return this.tampada;
    }

    public boolean getTampada() {
        return this.tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}