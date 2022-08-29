package Datentypen;

public class Einkaufen {
    public static void main(String[] args) {
        int haushaltsgeld = 40;


        int schokolade = 5;
        int kastenBier =20;
        int schuhEinlagen = 16;

        int ergebnisEinkauf = schokolade + kastenBier + schuhEinlagen;

        int restlichesHaushaltsGgld = haushaltsgeld - ergebnisEinkauf;

        System.out.println("Der Einkauf kostet: " + ergebnisEinkauf +" €");
        System.out.println("Das Hauhalstgeld beraegt nun: " + restlichesHaushaltsGgld + " €");
    }
}
