//Kasse Programm
import inout.Console;
public class Kasse {
    public static void main(String[] args) {
        int wert = 0;
        int summe = 0, maximal = 0, minimal = 10000, anzahlPos = -1;
        final int ende = -999;
        System.out.println("Bitte Wert eingeben");
        System.out.println("Ende bei Eingabe von -999");

        do {
            summe += wert;
            anzahlPos ++;
            if (wert < minimal && wert > 0)
               minimal = wert;
            if (wert > maximal)
               maximal = wert; 
            wert = Console.readInt();

        } while (wert != -999);

        if (anzahlPos > 0) {
            System.out.println("Summe:\t" + summe);
            System.out.println("Anzahl der Postionen:\t" + anzahlPos);
            System.out.println("Maximaler Bertrag:\t" + maximal);
            System.out.println("Minimaler Betrag:\t" + minimal);
        }
        else 
            System.out.println("Keine Wert eingegeben");
    }
}
