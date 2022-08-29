package Methoden;

import java.util.Locale;
import java.util.Scanner;

public class Methoden {

    public static void main(String[] args) {


        String userName = user("user"); // <-- Diese Variable Speichert die Rückgabe der Username Methode
        String userPassword = password("password"); // <-- Diese Variable Speichert die Rückgabe der Password Methode

        // Ausgabe der Daten
        System.out.print("Der neue Benutzer:  " + userName.toUpperCase(Locale.ROOT) +" mit dem Password:  "+ userPassword+ " wurde im System Angelegt");




    }


    // Methode für Anlegen/Speichern eines Benutzernamen
    public static String user (String user) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihren Usernamen ein;");
        user = scan.nextLine();

        return user;
    }

    // Methode für Anlegen/Speichern eines Benutzer Passwords
    public static String password (String password) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihren Password ein;");
        password = scan.nextLine();

        return password;
    }

    public static void daten (String daten){

        Scanner scan = new Scanner(System.in);

         String data = scan.nextLine();

    }

}
