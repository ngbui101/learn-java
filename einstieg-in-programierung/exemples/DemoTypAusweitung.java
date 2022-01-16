public class DemoTypAusweitung
{
    public static void main(String[] args)
    {
        int wertInt1 = 1235, wertInt2 = 524;
        double wertDouble1, wertDouble2, wertDouble3;
        wertDouble1 = wertInt1 / wertInt2;
        System.out.println("WertDouble1 ist: " + wertDouble1);
        wertDouble2 = (double)wertInt1 / (double)wertInt2;
        System.out.println("WertDouble2 ist: " + wertDouble2);
        wertDouble3 = ((double)wertInt1) / wertInt2;
        System.out.println("WertDouble 3 ist; " + wertDouble3);
    }
}
