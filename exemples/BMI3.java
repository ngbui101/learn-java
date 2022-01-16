import inout.Console;

public class BMI3
{
    public static void main(String[] args)
    {
        double bmi;
        double koeperGewicht = 0.0;
        double koeperGroesse = 0.0;
        System.out.println("Geben Sie bitte Ihr Gewicht in kg ein");
        koeperGewicht = Console.readDoubleComma();
        System.out.println("Geben Sie bitte Ihre Groesse in m ein");
        koeperGroesse = Console.readDoubleComma();
        bmi = koeperGewicht / (koeperGroesse * koeperGroesse);
        System.out.println
            ("Ihr Gewicht von " + koeperGewicht + " kg");
        System.out.println
            ("Ihre Groesse von " + koeperGroesse + " m");
        System.out.println("ergeben sich BMI Wert von " + bmi);
    }
}
