import inout.Console;
public class Funktionsauswahl {
    public static void main(String[] args) {
        for(;;) {
            System.out.println("Bitte Funktion asuwählen:");
            System.out.println("Funktion 1");
            System.out.println("Funktion 2");
            System.out.println("Funktion 3");
            System.out.println("Abbruch: 9");
            System.out.println("Bitte nur 1, 2 ,3 oder 9 eingeben");
            char auswahl = Console.readChar();
            if (auswahl == '9') break;
            switch (auswahl) {
                case '1': System.out.println
                          ("Funktion 1 wird ausgeführt"); break;
                case '2': System.out.println
                          ("Funktion 2 wird ausgeführt"); break;
                case '3': System.out.println
                          ("Funktion 3 wird ausgeführt"); break;
                default: System.out.println("Fehlerhafte Eingabe: " +
                                 "Bitte nur 1, 2, 3 oder 9 eingeben");
                         continue;
            }
        }
        System.out.println("Ende des Programms");
    }
}
