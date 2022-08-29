package Input;
import java.util.*;

public class Input {
    public static void main(String[] args) {


        double ergebnis, wert1 = 0, wert2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Willkommen beim Dezimal Rechener! \nBitte geben sie 2. Dezimalzahlen ein...");
        System.out.println(" ");
        System.out.println("Bitte geben Sie nun die 1. Gleitkommazahl ein: ");
        wert1 = scan.nextDouble();
        System.out.println("Bitte geben Sie auch die 2. Gleitkommazahl ein: ");
        wert2 = scan.nextDouble();
        ergebnis = wert1 + wert2;

        System.out.println("Das Ergebnis aus " + wert1 + " und "+ wert2 + " lautet: " + ergebnis);

        scan.close();


    }
}
