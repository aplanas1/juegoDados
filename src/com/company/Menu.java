package com.company;

import java.util.Scanner;

public class Menu {
    private Scanner sc = new Scanner(System.in);
    Game game;
    JuegoDados juegoDados;

    public Menu(Game game, JuegoDados juegoDados) {
        this.game = game;
        this.juegoDados = juegoDados;
    }

    public void show() {
        menuPricipal();
    }

    private void menuPricipal() {
        int option;
        do {
            System.out.println("Que juego quieres jugar?");
            System.out.println("1. Dados");
            System.out.println("2. Oca");
            System.out.println("3. Parchís");
            System.out.println("4. Salir");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    juegoDados.menu();
                    break;
                case 2:
                    System.out.println("No implementado.");
                    break;
                case 3:
                    System.out.println("No implementado.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("ATENCIÓN!!!! Debes seleccionar 1, 2, 3 o 4.");
            }
        }while(option != 4);
    }

}

