package ProjetoFinal;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video[] videos = new Video[3];
        videos[0] = new Video("Aula de teoria musical");
        videos[1] = new Video("Musica titanic");
        videos[2] = new Video("Orquestra ao vivo");

        Usuario[] u = new Usuario[2];
        u[0] = new Usuario("Eduardo", 18, "M", "eduardo@login");
        u[1] = new Usuario("Eric", 12, "M", "eric@login");

        Visualizacao v = new Visualizacao(u[0], videos[2]);
        System.out.println(v.toString());
        System.out.println("==================");
        v.avaliar(5);
        System.out.println(v.toString());


        // System.out.println("=======VIDEOS=======");
        // System.out.println(videos[0].toString());
        // System.out.println(videos[1].toString());
        // System.out.println(videos[2].toString());
        // System.out.println("==================");

        // videos[0].play();
        // System.out.println("==================");
        // videos[0].play(); //já está sendo reproduzido
        // System.out.println("==================");
        // videos[0].pause();
        // System.out.println("==================");
        // videos[0].like();
        // videos[0].like();
        // videos[0].like();
        // System.out.println(videos[0].toString()); //mostrando resultado final com a curtida

       
        // System.out.println(" ");
        // System.out.println("====USUARIOS==== ");
        // System.out.println(u[0].toString());
        // System.out.println(u[1].toString());
        // System.out.println(" ");


    }
}
