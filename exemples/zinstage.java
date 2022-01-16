import inout.Console;

public class zinstage
{
    public static void main(String[] args)
    {
        int zinstag, tage;
        tage = Console.readInt();
        zinstag = tage > 28 ? 28 : tage;
        System.out.println("Ihre Zinstage sind " + zinstag + " Tage");
    }
}
