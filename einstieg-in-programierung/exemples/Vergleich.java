import inout.Console;
public class Vergleich {
    public static void main(String args[]) {
        int wert1, wert2, wert3;
        int min = 0, mittel = 0, max = 0;
        System.out.println("Wert 1 eingeben: ");
        wert1 = Console.readInt();
        System.out.println("Wert 2 eingeben: ");
        wert2 = Console.readInt();
        System.out.println("Wert 3 eingeben: "); 
        wert3 = Console.readInt();
        if (wert1 >= wert2) {
            if (wert1 >= wert3) {
                max = wert1;
                if (wert3 >= wert2) {
                    mittel = wert3;
                    min = wert2;
                } else {
                    mittel = wert2;
                    min = wert3;
                }
            } else {
                mittel = wert1;
                max = wert3;
                min = wert2;
            }
        } else {
            if (wert2 >= wert3) {
                max = wert2;
                if (wert1 >= wert3) {
                    mittel = wert1;
                    min = wert3;
                } else {
                    min = wert1;
                    mittel = wert3;
                }
            } else {
                min = wert1;
                mittel = wert2;
                max = wert3;
            }
        }
    System.out.println("Min: " + min);
    System.out.println("Mittel: " + mittel);
    System.out.println("Max: " + max);
    }
}
        
