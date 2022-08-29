package Datentypen;

public class TypeCasting {


    public static void main(String[] args) {

        int VarZahl = 3;
        int varZahl2 = 5;

        double varZahl3 = 4.3d;
        double varZahl4 = 1.0d;

        // Explizite Typumwandlung

        int ergebnis1 = (int)varZahl3;

        System.out.println(ergebnis1);

        // Implizite Typumwandlung

        int varZahl5 = 9;

        double ergebnis2 = varZahl5;

        System.out.println(ergebnis2);


    }
}
