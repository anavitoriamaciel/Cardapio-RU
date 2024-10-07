package ru;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Refeicao> refeicoes;

    public Cardapio() {
        refeicoes = new ArrayList<>();
    }

    public void adicionarRefeicao(Refeicao refeicao) {
        refeicoes.add(refeicao);
    }

    public void exibirCardapio(String[] diasDaSemana) {
        System.out.println("\nCardápio da semana:");
        for (String dia : diasDaSemana) {
            System.out.println("Dia: " + dia);
            boolean encontrouRefeicao = false;
            for (Refeicao refeicao : refeicoes) {
                if (refeicao.getDia().equals(dia)) {
                    System.out.println("  " + refeicao);
                    encontrouRefeicao = true;
                }
            }
            if (!encontrouRefeicao) {
                System.out.println("  Nenhuma refeição cadastrada.");
            }
        }
    }
}
