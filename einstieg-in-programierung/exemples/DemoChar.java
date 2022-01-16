import inout.Console;
public class DemoChar
{
    public static void main(String[] args)
    {
        char zchn1, zchn2, zchn3, tab;
        zchn1 = '\u0057'; //Hexadezimal
        zchn3 = 88; //dezimal
        tab = '\t'; //Tabulatorzeichen
        System.out.println
            ("Zeichen zu Uni-Code 0057 (hexadezimal) :" + tab + zchn1);
        System.out.println
            ("Zeichen zu ASCII-Code 88 (dezimal) :" + tab + zchn3);
        System.out.println
            ("Bitte ein Zeichen geben.");
        zchn2 = Console.readChar();
        System.out.println
            ("Eingegebene Zeichen: " + tab + tab + tab + zchn2);
        zchn2++;
        System.out.println
            ("Nächstes zeichen in der Code-Tabelle: " + tab + zchn2);
    }
}
