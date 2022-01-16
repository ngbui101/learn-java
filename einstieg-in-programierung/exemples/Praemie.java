import inout.Console;
public class Praemie {

    public static void main(String[] args) {

        final int grundpraemie1 = 200, grundpraemie2 = 100, 
            zulage1 = 20, zulage2 = 100;
        int dienjahre, alter;
        int praemie = 0;
        System.out.println("Dienjahre?");
        dienjahre = Console.readInt();
        System.out.println("Alter?");
        alter = Console.readInt();
        if (dienjahre > 5) {
        
            praemie = grundpraemie2 + zulage1 * dienjahre;
            if (alter > 50)
                praemie = praemie + zulage2;
        } else {
            if (dienjahre > 2)
                praemie = grundpraemie1;
        }
        System.out.println("Dienjahre: " + dienjahre);
        System.out.println("Alter: " + alter);
        System.out.println("Prämie: " + praemie);
    }
}
