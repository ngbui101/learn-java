/*******************************************************
 * Programm zur Berechnung des Weizenkorn von Sessa Ebn*
 * ****************************************************/
public class SessaEbn
{
    public static void main(String[] args)
    {
        int kornanzahl = 1;
        for (int i = 0; i < 64; i++) 
        {
            if (i == 0) 
            {
                System.out.println
                    ("Auf das " + (i+1) +".Feld gibt es " +
                     kornanzahl + " Weizenkörner");
            }
            else 
            {
                kornanzahl = kornanzahl * 2;
                System.out.println
                    ("Auf das " + (i+1) +".Feld gibt es " + 
                    kornanzahl + " Weizenkörner");
            }
        }
    }
}

