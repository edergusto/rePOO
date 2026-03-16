package br.com.petshop;

import java.util.Scanner;

public class Servicos {
    public static void servicosPet() {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("# MENU PRINCIPAL > SERVIÇOS");
            System.out.println("1.Banho\n2.Tosa\n3.Banho e Tosa\n4.Consulta Veterinária\n0.Voltar");
            System.out.println("Escolha um opção:");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Executando: Banho");
                    break;
                case 2:
                    System.out.println("Executando: Tosa");
                    break;
                case 3:
                    System.out.println("Executando: Banho e Tosa");
                    break;
                case 4:
                    System.out.println("Executando: Consulta Veterinária");
                    break;
                case 0:
                    System.out.println("Voltando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }
}
