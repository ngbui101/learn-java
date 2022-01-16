public class DemoAufruf {
    public static void druckeLinie() {
        System.out.println("---------------------------------");
        druckGleich();
    }
    public static void druckGleich() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        druckeLinie();
        System.out.println("Top 5 Bücher");
        druckeLinie();
        System.out.println("Codeknacker");
        System.out.println("XHTML & CSS");
        System.out.println("Webdesign & Web-Ergonomie");
        System.out.println("Praktishe Projektplannung");
        System.out.println("Tabellenkalkulation");
        druckeLinie();
    }
}
