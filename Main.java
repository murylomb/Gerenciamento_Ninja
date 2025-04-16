package DesafioHeranca;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Ninja> listaNinjas = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("O ninja pertence a um clã especial? (s/n): ");
                    String temClã = entrada.nextLine();

                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();
                    System.out.print("Idade: ");
                    int idade = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Missão: ");
                    String missao = entrada.nextLine();
                    System.out.print("Dificuldade: ");
                    String dificuldade = entrada.nextLine();
                    System.out.print("Status: ");
                    String status = entrada.nextLine();

                    if (temClã.equalsIgnoreCase("s")) {
                        System.out.print("Qual o clã do ninja? (Uchiha / Hyuga / Haruno / Uzumaki): ");
                        String clã = entrada.nextLine().toLowerCase();

                        switch (clã) {
                            case "uchiha":
                                listaNinjas.add(new Uchiha(nome, idade, missao, dificuldade, status));
                                break;
                            case "hyuga":
                                listaNinjas.add(new Hyuga(nome, idade, missao, dificuldade, status));
                                break;
                            case "haruno":
                                listaNinjas.add(new Haruno(nome, idade, missao, dificuldade, status));
                                break;
                            case "uzumaki":
                                listaNinjas.add(new Uzumaki(nome, idade, missao, dificuldade, status));
                                break;
                            default:
                                System.out.println("Clã não reconhecido. Salvando como ninja comum.");
                                listaNinjas.add(new Ninja(nome, idade, missao, dificuldade, status));
                        }

                    } else {
                        listaNinjas.add(new Ninja(nome, idade, missao, dificuldade, status));
                    }

                    System.out.println("✅ Ninja cadastrado com sucesso!");
                    break;

                case 2:
                    if (listaNinjas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                    } else {
                        System.out.println("\n===== Lista de Ninjas =====");
                        for (Ninja ninja : listaNinjas) {
                            ninja.mostrarInformacoes();
                            System.out.println("---------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Encerrando programa!");
                    entrada.close();
                    return;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
