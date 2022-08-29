package Aufgaben;

import java.util.Scanner; // Importieren der Methode: Scanner aus der Klasse: java.util

/**
 *  Java-Programm:  if/else-if und else Endscheidungen.
 * <p>
 *   Eine Methode die den Nutzer nach einer Eingabe fragt.
 *   Hier wird if und Else-if dazu verwendet
 *   bei folgenden Bedingungen den jeweiligen Text auszugeben
 * <p>
 *   Bedingungen
 *   1. Sofern Eingabe kürzer als 10 Zeichen ist, wird - "Zu faul" ausgeben.
 *   2. Sofern Eingabe zwischen 10 und 15 Zeichen ist, wird -" 10-15 Zeichen Lang" ausgeben.
 *   3. Sofern Eingabe länger als 15 Zeichen ist -" Langer Text" ausgeben.
 * <p>
 *   Hier wird zur Bestimmung der Zeichenlänge die Methode: "length" der Klasse: String verwendet.
 *   eingabe.length() - dies gibt den Wert aus, der bei der Abfrage geprüft wird.
 *
 * @author David Maurin"
 */

public class Entscheidung {

    public static void main(String[] args) {

        String eingabe; // Deklarieren der Variable.

        Scanner scan = new Scanner(System.in); // Objekt der Klasse: Scanner erzeugen.

        System.out.println("Bitte gebe einen Text ein:"); // Dialog/Anweisung an Benutzer.
        eingabe = scan.nextLine();  // Speicher der Nutzereingabe in die Variable.

        if (eingabe.length() < 10) {
            System.out.println("Zu faul");

        } else if (eingabe.length() > 10 && eingabe.length() <= 15) {
            System.out.println("10-15 Zeichen Lang");

        } else if (eingabe.length() >= 16) {
            System.out.println("Langer Text");
        }


    }
}


