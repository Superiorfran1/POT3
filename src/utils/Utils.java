package utils;

import java.util.Scanner;

public class Utils {
    public static void pulsaEnter() {
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static void limpiaPantalla() {
        for(int i = 0; i < 50; ++i) {
            System.out.println();
        }

    }
}
