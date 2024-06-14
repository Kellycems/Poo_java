package ProjetoFinal;

public class Visualizacao {
    private Usuario espectador;
    private Video video;

    public void avaliar(){
        this.video.setAvaliacao(5);
    }
    public void avaliar(int nota){
        this.video.setAvaliacao(nota);
    }
    public void avaliar(float porc){
        int tot= 0;
        if(porc <=  25){
            tot = 3;
        }
        else if(porc <=  50){
            tot = 5;
        }
        else if(porc <=  75){
            tot = 7;
        }
        else if(porc <=  100){
            tot = 10;
        }
        this.video.setAvaliacao(tot);
    }   


    //CONSTRUTOR
    public Visualizacao(Usuario espectador, Video video) {
        this.espectador = espectador;
        this.video = video;
        espectador.setTotAssistido(espectador.getTotAssistido()+1);
        video.setViews(video.getViews()+1);
    }

    public Usuario getEspectador() {
        return this.espectador;
    }


    public void setEspectador(Usuario espectador) {
        this.espectador = espectador;
    }

    public Video getVideo() {
        return this.video;
    }

    public void setVideo(Video video) {
        this.video = video;
    }


    @Override
    public String toString() {
        return "{" +
            " espectador='" + getEspectador() + "'" +
            ", video='" + getVideo() + "'" +
            "}";
    }

}
