//Programm, das das Wetter auswerten
import inout.Console;
public class Wetter {
    public static void main(String[] args) {
        double temperatur = 0.0, summeMinus = 0.0;
        int tempAnzahl = -1, tempAnzahlMinus = 0;
        final int ende = 999;
        System.out.println("Geben Sie bitte die Temperatur ein");
        System.out.println("Ende bei Eingabe von 999");

        do {
            tempAnzahl ++;
            temperatur = Console.readDoubleComma();
            if (temperatur >= 0)
               continue;
            summeMinus += temperatur;
            tempAnzahlMinus ++;
        } while (temperatur != ende);

        if (tempAnzahl > 0) {
            System.out.println("Durchschnitte Minus Temperatur:\t" + 
                    (summeMinus/tempAnzahlMinus));
            System.out.println("Anzahl der eingegebene Temperatur:\t" + 
                tempAnzahl);
            System.out.println("Anzahl der Minus Temperatur:\t" + 
                tempAnzahlMinus);
        } else 
            System.out.println("Keine Wert eingegeben");
    }
}
