// Programm, das die Parkkosten berechnet und Eingabe von Münzen zählt

import inout.Console;
public class Parkscheinautomat {
    public static void main(String args[]) {
        int parkzeit = 0;
        double gebuehr = 0.0;
        double einzahlung = 0.0;
        int muenzen = 0;
        System.out.println
            ("Geben Sie bitte Ihre gewünsche Parkzeit in Minuten ein");
        parkzeit = Console.readInt();
        if (parkzeit <= 15)
            gebuehr = 35;
        else  
            gebuehr = 120 * Math.ceil((double)parkzeit/60);
        System.out.println("Die Gebühr beträgt: " + gebuehr + "\tCent");
        System.out.println
            ("Bitte verwenden Sie nur 10, 20, 50 Cent & 1 Euro Münze");
        System.out.println
            ("Achtung Überzahlung werden nicht erstattet!");
        while (einzahlung < gebuehr) {
            System.out.println
                ("Bitte Münzenwert eingeben (1 Euro als 100 Cent)");
            muenzen = Console.readInt();
            switch (muenzen) {
                case 10:
                case 20:
                case 50:
                case 100:
                einzahlung = einzahlung + (double)muenzen;
                System.out.println
                    ("Es fehlt noch: " + (gebuehr - einzahlung) + " Cent");
                break;
                default: System.out.println("Keine zulässige Münzart!");
            }
        }
        System.out.println("Sie haben die Gebühr bezahlt! Danke");
        System.out.println
            ("Gebühr: " + gebuehr + " Einzahlung : " + einzahlung);
    }    
}

