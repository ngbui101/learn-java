//Programm, das die Frachtkosten in Abhängigkeit von der Tarifzone ermittel

import inout.Console;
public class Frachtberechnung {
    public static void main(String[] args) {
        int tarifzone = 0;
        double frachtkostenanteil = 0.0;
        boolean ok = true;
        System.out.println("Geben Sie bitte die Tarifzone ein");

        tarifzone = Console.readInt();
        switch (tarifzone) {
            case 1: frachtkostenanteil = 15.0; break;
            case 2: frachtkostenanteil = 25.5; break;
            case 3: frachtkostenanteil = 35.5; break;
            case 4: frachtkostenanteil = 40.0; break;
            default: ok = false;
        }
        if (ok)
            System.out.println("Frachtkostenanteil: " + frachtkostenanteil);
        else 
            System.out.println("Keine gültige Tarifzone: " + tarifzone);
    }
}
