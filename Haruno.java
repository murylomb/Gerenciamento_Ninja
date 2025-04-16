package DesafioHeranca;

public class Haruno extends Ninja {
    private String habilidadeEspecial = "Cura Elevada";

    public Haruno(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Haruno");
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
