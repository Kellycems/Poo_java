package Heranca.Parte01;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("André");
        p3.setNome("João");
        p4.setNome("Maria");

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("M");
        p4.setSexo("F");

        p2.setCurso("Programação Mod.");
        p3.setSalario(2500.75f);
        p4.setSetor("Secretaria");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
        
}
