package inout;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Locale;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.regex.Pattern;
import java.text.ParseException;
import java.text.DateFormat;

/** Diese Klasse stellt Methode zur Verfügung, <br/>
 * um Texte und einfach Typen von der Konsole einzulesen <br/>
 * Die Ausnahmebehandlung ist Aufgabe des Aufrufers <br/>
 * @version 2,1 / 1.11.2012
 */
public class Console 
{
    private static Scanner sc;

    //Unterdrückung des default-Konstruktor,
    //um eine Objekterzeugung zu verhindern
    private Console()
    {
        //Dieser Konstruktor wird nie aufgerufen
    }

    /**Liest eine Zeile von der Konsole 
     * @return Eingelesene Zeile von Type String.
     * @exception NoSuchElementException:
     *  Es wurde keine Eingabezeile gefunden.
     *@Exception IllegalStateException:
     *  Die verwendete Methode ist nicht geöffnet.
     */
    public static String readString()
        throws NoSuchElementException, IllegalStateException
    {
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    /**Liest eine Zeile von der Konsole
     * @return Eingelesene Zeile von Typ char[].
     * @exception NoSuchElementException:
     *  Es wurde kein Eingabezeile gefunden.
     * @exception IllegalStateException:
     *  Die verwendete Methodeist nicht geöffnet.
     */
    public static char[] readCharArray()
        throws NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        String text = sc.nextLine();
        return text.toCharArray();
    }

    /** Boolean */
    public static boolean readBoolean() throws
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        sc = new Scanner(System.in);
        return sc.nextBoolean();
    }

    /** ganze Zahl von Type int */
    public static int readInt() throws 
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        return new Scanner(System.in).nextInt();
    }
    
    // ganze Zale von Type long 
    public static long readLong() throws
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        return new Scanner(System.in).nextLong();
    }
    // Gleitpunktzahl von Typ float English
    public static float readFloatPoint() throws 
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        Locale.setDefault(Locale.ENGLISH);
        return new Scanner(System.in).nextFloat();
    }

    //Gleitpunktzahl von Typ float Deutsch
    public static float readFloatComma() throws
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        Locale.setDefault(Locale.GERMAN);
        return new Scanner(System.in).nextFloat();
    }

    //Gleitpunktzahl von Typ double English
    public static double readDoublePoint() throws 
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        Locale.setDefault(Locale.ENGLISH);
        return new Scanner(System.in).nextDouble();
    }

    //Gleitpunktzahl von Typ double Deutsch 
    public static double readDoubleComma() throws 
        InputMismatchException, NoSuchElementException, IllegalStateException
    {
        Locale.setDefault(Locale.GERMAN);
        return new Scanner(System.in).nextDouble();
    }

    //Zeichen von Type char
    public static char readChar() throws 
        NoSuchElementException, IllegalStateException
    {
        String s = new Scanner(System.in).next();
        return s.charAt(0);
    }
}
