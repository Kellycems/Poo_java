package Exercicios.projetolivro;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public String detalhes() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            "\n totPaginas='" + getTotPaginas() + "'" +
            "\n pagAtual='" + getPagAtual() + "'" +
            "\n aberto='" + getAberto() + "'" +
            "\n leitor='" + getLeitor().getNome() + "'" +
            "\n leitor idade='" + getLeitor().getIdade() + "'" +
            "\n leitor sexto='" + getLeitor().getSexo() + "'" +
            "}";
    }


    //Construtor
    public Livro ( String titulo, String autor, int totPaginas, Pessoa leitor){
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    
    @Override
    public void abrir() {
       this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPagina() {
        this.pagAtual++;
    }

    @Override
    public void voltarPagina() {
        this.pagAtual--;
    }




}
