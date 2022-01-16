/******************************************************************
 * Programm zur Berechnung von Liter in US-Gallonen und umgekehrt**
 ********* Eingabewerte werden über die Konsole eingeben***********
 *****************************************************************/

import inout.Console;

public class Liter
{
    public static void main(String[] args)
    {
        double liter, gallon;
        System.out.println("Geben Sie die Literanzahl ein");
        liter = Console.readDoubleComma();
        gallon = 3.785411784 * liter;
        System.out.println
            ( liter + " Litern ist gleich " + gallon + " US-Gallonen");
        System.out.println("Geben Sie die Gallonanzahl ein");
        gallon = Console.readDoubleComma();
        liter = 0.264172052 * gallon;
        System.out.println
            ( gallon + " Gallonen ist umgerechnet gleich " + liter + " Litern");
    }
}
