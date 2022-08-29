package Operatoren;

import java.util.Scanner;

public class Steuerung {

    public static void main(String[] args) {

        int temperature;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Temperatur eingeben: ");
        temperature = scan.nextInt();

        if (temperature >= 0 && temperature <= 10) {
            System.out.println("Die Raumtemperatur wird auf: " + temperature + " gesetzt");
            System.out.println("Es ist noch kalt..");

        } else if (temperature > 11 && temperature <= 22) {
            System.out.println("Die Raumtemperatur wird auf: " + temperature + " gesetzt");
            System.out.println("Es ist nun etwas angenehmer..");

        } else if (temperature > 23 && temperature <= 33) {
            System.out.println("Die Raumtemperatur wird auf: " + temperature + " gesetzt");
            System.out.println("Es ist nun  schön warm..");

        } else if (temperature >= 35) {
            System.out.println("Die Raumtemperatur wird auf: " + temperature + " gesetzt");
            System.out.println("Es ist zu heiß");

        }
        else if (temperature <= -1) {

            System.out.println("Die Raumtemperatur wird auf: " + temperature + " gesetzt");
            System.out.println("Kalt..Kalt..es Schneit");
        }
    }

}




