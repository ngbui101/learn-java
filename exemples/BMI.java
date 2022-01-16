/*****************************
** BMI Berechnung Programm ***
*****************************/
import java.util.Scanner;

public class BMI
{
    public static void main(String arg[])
    {
        Scanner eingabe = new Scanner(System.in);
        System.out.println
            ("Wilkommen zu BMI Berechnungsprogramm. Wie soll ich dich nennen?");
        String userName = eingabe.nextLine();
        
        Scanner eingabe1 = new Scanner(System.in);
        System.out.println
            ("Hello " + userName + "! Kannst du mir dein Gewicht verraten?");
        double gewicht = eingabe1.nextDouble();
        
        System.out.println
            ("Sehr gut " + userName + "! Wie gross bist du?");
        Scanner eingabe2 = new Scanner(System.in);
        double groesse = eingabe2.nextDouble();
        
        double bmi = gewicht / (groesse * groesse);
        
        if ( bmi < 20 ) {
            System.out.println
                ("Dein BMI Wert liegt bei " + bmi + " Sollst du mehr essen");
        }
        else if ( bmi >= 20 & bmi <= 24 ) {
            System.out.println
                ("Glueckwusch!! Du hast ideale Gewicht. Deine BMI Wert liegt bei " + bmi );
        }
        else if ( bmi > 24 & bmi < 30 ) {
            System.out .println
                ("Du bist leicht uebergewicht bei BMI Wert von " + bmi );
        } 
        else {
            System.out.println("Fettsack wenig essen und Sport machen!!!");
        }
    }
}
