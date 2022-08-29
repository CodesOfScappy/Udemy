package Aufgaben;

public class Rechnen {
    public static void main(String[] args) {

        ausgabe(5);
        ausgabe(10);
        System.out.println(rechnen(5));






    }

    public static int rechnen(int wert) {
        int ergebnis = wert * wert;

        return ergebnis;
    }
    public static void ausgabe(int zahl) {
        int summe = zahl * zahl;
        System.out.println(summe);


    }

}
