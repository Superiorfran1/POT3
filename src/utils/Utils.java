package utils;

import java.util.Scanner;

public class Utils {

    public static void pulsaEnter() {
        new Scanner(System.in).nextLine();
    }

    public static void limpiaPantalla() {
        for (int i = 0; i < 40; i++) {
            System.out.println();
        }
    }
}
