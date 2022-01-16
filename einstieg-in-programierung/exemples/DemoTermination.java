public class DemoTermination {
    public static void main(String[] args) {
        int g = 0;
        int maximum = 100, anzahl = 0;
        int summe = 0;
        do {
            g++;
            anzahl++;
            summe += anzahl;
        } while (g < maximum);
        System.out.println("Summe von 1 bis " + anzahl + " : " + summe);
    }
}
