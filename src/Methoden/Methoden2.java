package Methoden;

public class Methoden2 {

    public static void main(String[] args) {
        int wert1 = 20;
        int wert2 = 18;

        identifikation("David","Maurin",38, "Blond");

        System.out.println("Das Ergebnis von der Addition von " + wert1 +" und "+ wert2 +" ist: " + addition(wert1,wert2));

    }




    static void identifikation(String name,String nachname, int alter, String haarfarbe) {

        System.out.println("Ich bin " + name + " "+ nachname+ " und bin " + alter + " Jahre alt "+ "meine Haarefarbe ist " + haarfarbe );

    }

    static int addition(int zah1, int zahl2) {

        return zah1 + zahl2;
    }
}
