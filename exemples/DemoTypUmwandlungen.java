public class DemoTypUmwandlungen
{
    public static void main(String[] args)
    {
        double zahl1 = 10.5;
        double zahl2 = 10.49;
        int zahl1int = (int)zahl1;
        int zahl1intgerundet = (int)Math.round(zahl1);
        int zahl2int = (int)zahl2;
        int zahl2intgerundet = (int)Math.round(zahl2);
        System.out.println("Zahl 1: " + zahl1);
        System.out.println("Zahl 1 abgeschnitten: " + zahl1int);
        System.out.println("Zahl 1 gerundet: " + zahl1intgerundet);
        System.out.println("Zahl 2: " + zahl2);
        System.out.println("Zahl 2 abgeschnitten: " + zahl2int);
        System.out.println("Zahl 2 gerundet: " + zahl2intgerundet);
        byte b; //Wertbereich 0 bis 255
        int i = 260;
        b = (byte)i;
            //führt zu eine Modulo-256-Operation (Rest 4)
        System.out.println("i: " + i + " b: " + b);
    }
}
