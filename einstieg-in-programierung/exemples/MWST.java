/**********************************************
 * Programm zur Berechnung des Mehrwertsteuers*
 * *******************************************/
import java.util.*;
public class MWST
{   
    public static double readDoubleComma() throws
        InputMismatchException, NoSuchElementException, IllegalStateException
        {
            Locale.setDefault(Locale.GERMAN);
            return new Scanner(System.in).nextDouble();
        }

    public static void main(String arg[])
    {
        final double VOLLE_MWST = 19.0;
        System.out.println("Geben Sie den Bruttobetrag ein:");
        double brutto = readDoubleComma();
        double netto = brutto * 100 / (VOLLE_MWST + 100);
        double mwstBetrag = brutto * VOLLE_MWST /(VOLLE_MWST + 100);
        
        System.out.println("Brutto: " + brutto);
        System.out.println("Netto: " + netto);
        System.out.println("MwSt(19%): " + mwstBetrag);
    }
}
