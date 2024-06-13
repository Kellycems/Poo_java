package Encapsulamento;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean tocando;
    private boolean ligado;

    public ControleRemoto() {
        volume = 50;
        ligado = false;
        tocando = false;
    }

    private void setVolume(int v){
        this.volume = v;
    }

    private int getVolume(){
        return this.volume;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getTocando() {
        return this.tocando;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    @Override
    public void ligar() {
       this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
        System.out.println("Ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());

        for(int i = 0; i <= this.getVolume(); i+=10){
            System.out.print("[]");
        }
        System.out.println("");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
       if(this.getLigado()){
        setVolume(getVolume()+1);
       }else{
        System.out.println("A TV não está ligada...");
       }
    }

    @Override
    public void menosVolume() {
       if(this.getLigado()){
        setVolume(getVolume()-1);
       }
       else{
        System.out.println("A TV não está ligada");
       }
    }

    @Override
    public void ligarMudo() {
       if(this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
       }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(getLigado() && !getTocando()){
            setTocando(true);
            System.out.println("Tocando...");
        }
    }

    @Override
    public void pause() {
        if(getLigado() && getTocando()){
            setTocando(false);
            System.out.println("Desligado!");
        }
    }


}
