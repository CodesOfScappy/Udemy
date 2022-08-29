package Operatoren;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int temperatur = 23;
        String sender = "Radio 90.1";

        System.out.println("Hallo ich bin Lexi..");
        System.out.println("Bitte geben Sie ihr Namen ein!");
        name = scan.nextLine();
        System.out.println("Hallo " +name + " Was kann ich für dich tun?");
        String text = "";
        text = scan.nextLine();

        switch (text) {
            case "Hallo"+"":
                System.out.println("Hallo" + name + "Ich habe deinen Namen gespeichert");
                break;

            case "Spiele Radio"+"":
                System.out.println("Welchen sender möchtes du hören?");
                sender = scan.nextLine();
                System.out.println("Hallo" + name + " der Sender " + sender + " wird Abgespielt.");
                break;
            case "Wer Spielt am Wochenende"+"":
                System.out.println("Hallo " + name + " es Spiel am Wochenende....");
                break;
            case "Wie ist das Wetter"+ "":

                System.out.println("Aktuell betraegt die Temperatur: " +temperatur);
                break;
            default:
                System.out.println("Ich habe deine Frage nach: " + text + " nicht Verstanden oder nichts datu gefunden!" );
                break;

        }

        System.out.println("Code Ende...");
    }
}
