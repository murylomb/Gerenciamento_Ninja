package DesafioHeranca;

public class Uchiha extends Ninja {
    private String habilidadeEspecial = "Sharingan";

    public Uchiha(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Uchiha");
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
