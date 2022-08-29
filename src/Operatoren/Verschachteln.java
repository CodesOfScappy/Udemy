package Operatoren;

import javax.swing.*;
import java.util.Scanner;

public class Verschachteln {

    public static void main(String[] args) {




        int iq = Integer.parseInt(JOptionPane.showInputDialog("Bitte Gebe deinen IQ wert ein!"));


        if (iq < 100 ) {
            JOptionPane.showMessageDialog(null,"Ihr IQ beträgt: " + iq + " Dies ist Schlechter als der Durschnitt");
        }else {
            JOptionPane.showMessageDialog(null,"Ihr IQ beträgt: " + iq + " Dies ist Besser als der Durschnitt");
            if(iq >=130){
                JOptionPane.showMessageDialog(null,"Ab zur Mensa");
            }else{
                JOptionPane.showMessageDialog(null,"jedeoch nicht genug für die Mensa");
            }
        }




        System.out.println("Ende des Codes");

    }
}
