package Relacionamento;

public class Combat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);

        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);

        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1 );

        l[3] = new Lutador("Dead code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);

        Luta luta = new Luta();

        luta.marcarLuta(l[3], l[2]);
        luta.lutar();
        l[2].apresentar();
    }
}