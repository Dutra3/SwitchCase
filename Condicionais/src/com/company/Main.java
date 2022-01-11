package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Quantas patas tem o animal que você está observando?");
        int patas = keyboard.nextInt();
        String tipo;

        switch (patas) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6,8:
                tipo = "Aranhas";
                break;
            default:
                tipo = "ET";
        }

        System.out.println(tipo);

    }
}
