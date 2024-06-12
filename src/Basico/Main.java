public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        // c1.cor = "Azul";
        // c1.modelo = "BIC";
        // c1.ponta = 0.7f;
        c1.setCor("Azul");
        c1.setModelo("BIC");
        c1.setPonta(0.7f);
        c1.tampar();
        c1.escrever();
        c1.status();

        System.out.println("---------");
        Caneta c2 = new Caneta();
        c2.setCor("Vermelha");
        c2.setModelo("BIC");
        c2.setPonta(0.4f);
        c2.destampar();
        c2.escrever();
        c2.status();
    }
}
