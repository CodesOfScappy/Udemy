package Aufgaben;

import java.io.InputStream;

public class Scanner {

    public Scanner(InputStream in) {
    }

    public static void main(String[] args) {

        int wert1, wert2, ergebnis;


        java.util.Scanner scan = new java.util.Scanner(System.in);


        System.out.println("Willkommen beim Zahlen Rechener! \nBitte geben Sie 2. Ganzzahlen ein...");
        System.out.println(" ");
        System.out.println("Geben Sie nun die 1. Zahl ein: ");
        wert1 =scan.nextInt();
        System.out.println("Geben Sie auch die 2. Zahl ein: ");
        wert2 =scan.nextInt();
        ergebnis = wert1 + wert2;
        System.out.println("Das Ergebnis aus " + wert1 + " und "+ wert2 + " lautet: " + ergebnis);

        scan.close();
    }
}
