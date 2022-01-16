/****************************************************
 * Program zur Berechnung des BMI ( Body Mass Index)
 * **************************************************/
import java.util.*;

public class BMI2
{
    public static double readDoubleComma() throws
        InputMismatchException, NoSuchElementException,
        IllegalStateException
    {
        Locale.setDefault(Locale.GERMAN);
        return new Scanner(System.in).nextDouble();
    }

    public static void main(String arg[])
    {
        double bmi;
        double koerperGewicht = 0.0;
        double koerperGroesse = 0.0;
        System.out.println
            ("Geben Sie bitte Ihr Gewicht in kg ein:");
        koerperGewicht = readDoubleComma();
        System.out.println
            ("Geben Sie bitte Ihre Groesse in m ein:");
        koerperGroesse = readDoubleComma();

        bmi = koerperGewicht / (koerperGroesse * koerperGroesse);
        System.out.println
            ("Ihr Gewicht von " + koerperGewicht + " kg");
        System.out.println 
            ("und Ihre Groesse von " + koerperGroesse + " m");
        System.out.println("ergeben einen BMI von " + bmi);
        System.out.println
            ("Die hoechste Lebenserwartung haben Menschen");
        System.out.println("mit einem BMI zwischen 20 und 24");
    }
}  
