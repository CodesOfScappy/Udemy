package Operatoren;

import javax.swing.*;

public class Software {

    public static void main(String[] args) {


        int iq = Integer.parseInt(JOptionPane.showInputDialog("Bitte Gebe deinen IQ wert ein!"));

        System.out.println(iq);

        if (iq < 100) {
            JOptionPane.showMessageDialog(null,"Ihr IQ beträgt: " + iq + " Dies ist Besser als der Durschnitt");
        } else {
            System.out.println("Ihr IQ beträgt: " + iq + " Dies ist Besser als der Durschnitt");
        }
    }
}
