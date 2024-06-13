package Exercicios.projetolivro;

public class Main {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Ana", 18, "F");
        p[1] = new Pessoa("Pedro", 20, "M");

        l[0] = new Livro("A Seleção", "Kiera Cass",363, p[0] );
        l[1] = new Livro("Aprendendo java", "José da Silva", 202, p[1]);
        l[2] = new Livro("Poo para iniciantes", "Pedro Paulo", 500, p[1]);

        System.out.println(l[1].detalhes());

    }
}
