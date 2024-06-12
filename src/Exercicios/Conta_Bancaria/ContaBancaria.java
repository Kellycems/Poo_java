package Exercicios.Conta_Bancaria;
public class ContaBancaria {
    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;



    public ContaBancaria() {
        this.saldo = 0;
        this.status = false; //a conta ainda permanece fechada
    }

    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean setStatus() {
        return this.status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public void abrirConta(String t){
        this.setStatus(true);
        this.setTipo(t);
        if(tipo == "cc"){
            this.setSaldo(50);
            System.out.println("Sua conta corrente foi aberta com um saldo inicial de R$50,00");
            
        }
        else if(tipo == "cp"){
            this.setSaldo(150);
            System.out.println("Sua conta poupança foi aberta com um saldo inicial de R$150,00");
        }
    }

    public void fecharConta(){
        if(this.getSaldo()< 0){
            System.out.println("Não é possível fechar sua conta, saldo negativo!");
        }
        else if(this.getSaldo() > 0){
            System.out.println("Favor sacar todo valor antes para fechar sua conta.");
        }
        else{
            this.setStatus(false);
            System.out.println("Conta fechada.");
        }
    }   

    public void sacar(double valor){
        if(this.getStatus() && this.getSaldo() >=valor){
            this.saldo -= valor;
        }
        else if(this.getStatus() == false){
            System.out.println("Favor abrir uma conta para sacar dinheiro.");
        }
        else if(this.getSaldo() <= valor){
            System.out.println("Saldo insuficiente");
        }
    }
    public void depositar(double valor){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo() + valor);
        }
        else{
            System.out.println("Abra uma conta para depositar o dinheiro.");
        }
    }
    public void pagarMensal(double valor){
        if(this.getTipo() == "cc"){
            this.setSaldo(this.getSaldo()-12);
        }
        else{
            this.setSaldo(this.getSaldo()-20);
        }
    }



    
}
