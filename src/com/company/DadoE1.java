package net.aplanas;

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class DadoE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cuantas veces quieres tirar los dados? ");
        int n = scanner.nextInt();
        int x,x1,x2;
        int num[] = new int[12];
        for (int i = 0; i < n; i++) {
            x1 = (int) (Math.random()*6+1);
            x2 = (int) (Math.random()*6+1);
            x = x1 + x2;
            for (int j = 0; j < 11; j++) {
                if (x == j + 2) {
                    num[j]++;
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            System.out.println((i+2) + " -------> " + num[i]);
        }
    }
}
