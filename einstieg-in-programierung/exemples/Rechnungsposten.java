import inout.Console;
public class Rechnungsposten {
    public static void main(String[] args) {
        double teilsumme;
        double summe = 0;
        int anzahl = 0;
        System.out.println("Geben Sie bitte die Teilsumme ein:");
        do {    
            teilsumme = Console.readInt();
            summe = summe + teilsumme;
            anzahl = anzahl + 1;
        } while (teilsumme > 0);
        System.out.println("Anzahl Rechnungsposten: " + anzahl);
        System.out.println("Summe Rechnungsposten: " + summe);
    }
}
