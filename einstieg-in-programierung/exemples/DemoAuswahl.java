import inout.Console;
public class DemoAuswahl
{
    public static void main(String[] args)
    {
        char zchn;
        String text;
        System.out.println("Geben Sie bitte ein Zeichen ein");
        zchn = Console.readChar();
        if ( zchn >= '0' && zchn <= '9' )
            text = "eine Ziffer";
        else 
            text = "keine Ziffer";
        System.out.println("Das Zeichen " + zchn + " ist " + text);
    }
}
        

