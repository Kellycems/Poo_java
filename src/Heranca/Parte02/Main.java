package Heranca.Parte02;

public class Main {
    public static void main(String[] args) {
    
        Aluno a1 = new Aluno();
        a1.setNome("Arthur");
        a1.setIdade(18);
        a1.setSexo("M");
        a1.setCurso("Informática");
        a1.setMatricula(123);
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Larissa");
        b1.setSexo("F");
        b1.setIdade(20);
        b1.setMatricula(321);
        b1.setBolsa(12.5f);
        b1.pagarMensalidade();

        Tecnico c1 = new Tecnico();
        c1.setNome("João");
        c1.setSexo("M");
        c1.setIdade(30);
        c1.setMatricula(3221);
        c1.pagarMensalidade();

        Professor p1 = new Professor();
        p1.setNome("Cleia");
        p1.setSexo("F");
        p1.setIdade(50);
        p1.setEspecialidade("BPMN");
        p1.setSalario(5500.00f);
        System.out.println(p1.toString());
    }
}
