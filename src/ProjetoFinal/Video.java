package ProjetoFinal;

public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private int curtidas;
    private int views;
    private boolean reproduzindo;

    public Video(String titulo){
        this.titulo = titulo;
        this.reproduzindo = false;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
    }

    @Override
    public void play() {
        if(!getReproduzindo()){
            this.reproduzindo = true;
            System.out.println("Seu video foi iniciado...");
        }else{
            System.out.println("Seu video já está sendo reproduzido");
        }
    }

    @Override
    public void pause() {
        if(getReproduzindo()){
            this.reproduzindo = false;
            System.out.println("Seu video foi pausado...");
        }
        else{
            System.out.println("Seu video já está pausado");
        }
    }

    @Override
    public void like() {
        this.curtidas++;
    }
    

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
       int tot = ((this.avaliacao + avaliacao)/this.views);
       this.avaliacao = tot;
    }


    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public boolean getReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }


    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", avaliacao='" + getAvaliacao() + "'" +
            ", curtidas='" + getCurtidas() + "'" +
            ", views='" + getViews() + "'" +
            ", reproduzindo='" + isReproduzindo() + "'" +
            "}";
    }


}
