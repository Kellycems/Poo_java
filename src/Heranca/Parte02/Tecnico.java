package Heranca.Parte02;

public class Tecnico extends Aluno {
    private int registroProfissional;

    public void praticar(){
        System.out.println("Tecnico praticando...");
    }

    public int getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
