package ru;

import java.util.Scanner;

public class RUTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();
        String[] diasDaSemana = {"segunda", "terça", "quarta", "quinta", "sexta"};

        boolean continuar = true;

        while (continuar) {
            // Pergunta pelo dia da semana
            System.out.println("Para qual dia da semana você quer cadastrar a refeição? (segunda, terça, quarta, quinta, sexta)");
            String dia = scanner.nextLine().toLowerCase();

            // Verifica se o dia é válido
            if (!isDiaValido(dia, diasDaSemana)) {
                System.out.println("Dia inválido. Tente novamente.");
                continue;
            }

            // Pergunta pelo turno
            System.out.println("Qual turno? (manhã, tarde, noite)");
            String turno = scanner.nextLine().toLowerCase();

            // Pergunta pelos pratos
            System.out.println("Qual o prato principal?");
            String pratoPrincipal = scanner.nextLine();

            System.out.println("Qual o acompanhamento?");
            String acompanhamento = scanner.nextLine();

            System.out.println("Qual a salada?");
            String salada = scanner.nextLine();

            // Cadastra a refeição no cardápio
            Refeicao refeicao = new Refeicao(dia, turno, pratoPrincipal, acompanhamento, salada);
            cardapio.adicionarRefeicao(refeicao);

            // Pergunta se o usuário deseja cadastrar para outro dia
            System.out.println("Deseja cadastrar para outro dia? (sim/não)");
            String resposta = scanner.nextLine().toLowerCase();
            continuar = resposta.equals("sim");
        }

        // Exibe o cardápio da semana
        cardapio.exibirCardapio(diasDaSemana);
        scanner.close();
    }

    private static boolean isDiaValido(String dia, String[] diasDaSemana) {
        for (String d : diasDaSemana) {
            if (d.equals(dia)) {
                return true;
            }
        }
        return false;
    }
}
