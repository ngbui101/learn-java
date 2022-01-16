public class DemoBlock
{
    public static void main(String[] args)
    {
        int merkeZahl = 0;
        merkeZahl = merkeZahl + 10;
        System.out.println("Merkezahl: " + merkeZahl);
        { //Blöck1
            int merkeZahl2 = 20;
            merkeZahl = merkeZahl + 20;
            System.out.println("Merkezahl in Blöck 1: " + merkeZahl);
            merkeZahl2 = merkeZahl;
            System.out.println
                ("Merkezahl 2 in Block1: " + merkeZahl2);
        }
        merkeZahl = merkeZahl + 50;
        System.out.println("Merkezahl: " + merkeZahl);
    }
}

