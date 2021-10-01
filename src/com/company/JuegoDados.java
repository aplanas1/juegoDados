package com.company;

import java.util.Scanner;

public class JuegoDados {
    private Scanner sc = new Scanner(System.in);
    Dado[] dados = new Dado[3];
    private int partidas, ganadas;

    public JuegoDados(Dado[] dados) {
        this.dados = dados;
        for (int i = 0; i < 3; i++) {
            dados[i] = new Dado();
        }
    }
    public void menu() {
        int option;
        do {
            System.out.println("1. Juego");
            System.out.println("2. Salir");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    jugar();
                    break;
                case 2:
                    System.out.println("Has ganado " + ganadas + " partidas y perdido " + (partidas - ganadas) + " de un total de " + partidas + " partidas.");
                    break;
                default:
                    System.out.println("ATENCIÓN!!!! Debes seleccionar 1 o 2.");
            }
        }while(option != 2);
    }
    public void jugar() {
        for (int i = 0; i < 3; i++) {
            dados[i].tirar();
            System.out.println("Dado " + (i + 1) + ": Resultado:" + dados[i].getValor());
        }
        partidas++;
        if (dados[0].getValor() == dados[1].getValor() && dados[1].getValor() == dados[2].getValor()) {
            ganadas++;
        }
    }
}

