package Aufgaben;

public class HochDrei {

    public static void main(String[] args) {

        double ergebnis = hochDrei(13.37);
        System.out.println(ergebnis);

        System.out.println(hochDreiDouble(2));


    }




    public static double hochDrei (double zahl1) {

       return zahl1 * zahl1 * zahl1;
    }

    static double hochDreiDouble(double zahl2) {

        return zahl2 * zahl2 *zahl2;
    }
}
