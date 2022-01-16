import inout.Console;
public class MwStTabelle {
    public static void main(String[] args) {
        final int  mwst_Voll = 19;
        final int mwst_Emaessig = 7;
        float mwst_v, mwst_e;
        int startwert, zielwert;    
        do {
            System.out.println("Geben Sie bitte Startwert und Zielwert ein");
            startwert = Console.readInt();
            zielwert = Console.readInt();
            if (startwert >= zielwert)
                System.out.println("Startwert muss kleiner als Zielwert");
        } while (startwert >= zielwert);

        System.out.println("MwSt-Tabelle in €");
        System.out.println("Netto\t19%\tBrutto\t7%\tBrutto");                
        for (int i = startwert; i <= zielwert; i++) {
            mwst_v = i * mwst_Voll / 100.0f;
            mwst_e = i * mwst_Emaessig / 100.0f;
            System.out.println(i + "\t" + mwst_v + "\t" +
                    (mwst_v + i) + "\t" + mwst_e + "\t" + (mwst_e + i));
            if (i%10 == 0) {
               System.out.println
                   ("--------------------------------------------------- ");
            }
        }
    }
}
       
