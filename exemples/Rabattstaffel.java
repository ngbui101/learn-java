public class Rabattstaffel {
    public static void main(String[] args) {
        System.out.println("Rabattstaffel");
        System.out.println("€\t5%\t10%\t15%\t20%\t25%");
        for (int betrag = 100; betrag <= 1000; betrag += 100) {
            System.out.print(betrag);
            for (int rabattsatz = 5; rabattsatz <= 25; rabattsatz += 5) {
                System.out.print("\t" + betrag * rabattsatz / 100);
            }    
        System.out.println();
        }
    }
}
