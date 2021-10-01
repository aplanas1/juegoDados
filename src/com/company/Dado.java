package com.company;

public class Dado {
    private int valor;

    public Dado() {
        valor = 0;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int points) {
        this.valor = points;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "valor='" + valor +
                '}';
    }

    public void tirar() {
        valor = (int) (Math.random()*6+1);
    }
}
