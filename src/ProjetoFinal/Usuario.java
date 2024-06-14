package ProjetoFinal;

public class Usuario extends Pessoa {
    private String login;
    private int totAssistido;

    public Usuario(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.login = login;
        this.totAssistido = 0;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return this.totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

}
