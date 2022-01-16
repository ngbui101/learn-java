import inout.Console;

public class DemoUmkehren
{
    public static void main(String[] args)
    {
        int zahl1, zahl2, zahl3;
        System.out.println("Geben Sie zwei Zählen ein");
        zahl1 = Console.readInt();
        zahl2 = Console.readInt();
        zahl3 = zahl1;
        zahl1 = zahl2;
        zahl2 = zahl3;
        System.out.println("1.Zahl ist: " + zahl1);
        System.out.println("2.Zahl ist: " + zahl2);
    }
}


