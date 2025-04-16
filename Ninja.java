package DesafioHeranca;

public class Ninja {
    protected String nome;
    protected int idade;
    protected String missao;
    protected String nivelDificuldade;
    protected String statusMissao;

    public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        this.nome = nome;
        this.idade = idade;
        this.missao = missao;
        this.nivelDificuldade = nivelDificuldade;
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Dificuldade: " + nivelDificuldade);
        System.out.println("Status da Missão: " + statusMissao);
    }
}
