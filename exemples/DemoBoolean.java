//Das Programm demontriert die 
//boolesche Operationen

import inout.Console;

public class DemoBoolean
{
    public static void main(String[] args)
    {
        boolean schalter1 = false;
        boolean schalter2 = true;
        System.out.println("Boolsche Operation");
        System.out.println("Schalter 1 (true oder false eingeben)");
        schalter1 = Console.readBoolean();
        System.out.println("Schalter 2 (true oder false eingeben)");
        schalter2 = Console.readBoolean();
        boolean und = schalter1 & schalter2;
        boolean oder = schalter1 | schalter2;
        boolean xoder = schalter1 ^ schalter2;
        System.out.println("Schalter 1 = " + schalter1);
        System.out.println("Schalter 2 = " + schalter2);
        System.out.println("Und = " + und);
        System.out.println("Oder = " + oder);
        System.out.println("Xoder = " + xoder);
    }

}
