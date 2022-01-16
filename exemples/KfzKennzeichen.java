//Mehr Auswahr mit String
import inout.Console;
public class KfzKennzeichen {
    public static void main(String[] args) {
        String kfzkennzeichen = "", verwaltungsbezirk ="";
        System.out.println("Kfz-Kennzeichen bitte eingeben:");
        kfzkennzeichen = Console.readString();
        switch (kfzkennzeichen) {
            case "A": verwaltungsbezirk = "Ausburg (Bay)"; break;
            case "AA": verwaltungsbezirk = "Aalen (Bawü)"; break;
            case "AB": verwaltungsbezirk = "Aschaffenburg (Bay)"; break;
            //usw
            default: verwaltungsbezirk = "Dieses Kennzeichen gibt es nicht";
        }
        System.out.println(kfzkennzeichen + ":\t" + verwaltungsbezirk);
    }
}
