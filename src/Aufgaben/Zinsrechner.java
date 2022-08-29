package Aufgaben;
import java.util.Scanner;

public class Zinsrechner {

    public static void main(String[] args) {

        double grundbetrag;
        double zinssatz;
        byte jahre;
        double endbetrag;

        Scanner scan = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("Willkommen beim Zinsrechner..");
       // System.out.println(" ");
        System.out.println("Bitte geben Sie ihren Grundbetrag als Gleitkommazahl ein: ");
        grundbetrag = scan.nextDouble();

        System.out.println("Nun den Zinssatz: ");
        zinssatz = scan.nextDouble();

        System.out.println("Zuletzt die Jahre bitte noch: ");
        jahre = scan.nextByte();

        System.out.println("Berechnung wird Durchgeführt......");
        endbetrag = grundbetrag*(Math.pow((1+zinssatz/100),jahre));
        System.out.printf("Ihr Grunbetrag: %5.2f"+"€", grundbetrag );
        System.out.println(" ");
        System.out.println("ihr Vereinbarter Zinssatz: " +zinssatz +" p.a");
        System.out.println("Ihre Laufzeit in Jahren: " +jahre);
        System.out.println(" ");
        System.out.printf("Ihr Enbetrag nach der Berechnung lautet: %3.2f"+"€", endbetrag);

        scan.close();
    }
}
