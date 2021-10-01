package com.company;

public class Game {

    private JuegoDados juegoDados;
    private Menu menu;
    private Dado[] dados;

    public Game() {
        dados = new Dado[3];
        juegoDados = new JuegoDados(dados);
        menu = new Menu(this,juegoDados);
    }

    public void start() {
        menu.show();
    }

}
