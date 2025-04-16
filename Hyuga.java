package DesafioHeranca;

public class Hyuga extends Ninja {
    private String habilidadeEspecial = "Byakugan";

    public Hyuga(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
        super(nome, idade, missao, nivelDificuldade, statusMissao);
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Clã: Hyuga");
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
