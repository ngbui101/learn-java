public class DemoByteCode
{
    public static void main (String Args[])
    {
        int Menge = 50;
        int PreisNetto = 50;
        double MwSt = 19.0;
        double WarenwertNetto = Menge * PreisNetto;
        double WarenwertBrutto = 
            WarenwertNetto * (MwSt + 100) / 100.0;
        System.out.println(WarenwertNetto);
    }
}
