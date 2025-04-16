package DesafioHeranca;

public class Uzumaki extends Ninja {
    private String habilidadeEspecial = "Grande quantidade de chakra";

    public Uzumaki(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Uzumaki");
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
