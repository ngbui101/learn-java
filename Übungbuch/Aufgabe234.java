class Aufgabe234 {
	public static void main(String args[]) {
		
		System.out.println("Geben Sie einen Betrag ein");
		int anzahl1E, anzahl2E, anzahl50C, anzahl20C, anzahl10C, anzahl5C, anzahl2C, anzahl1C, betraginCent;
		double betrag = new java.util.Scanner(System.in).nextDouble();
		betraginCent = (int)(betrag*100);
		
		anzahl2E = betraginCent/200;
		anzahl1E = (betraginCent%200) / 100;
		anzahl50C = (betraginCent%200%100) / 50;
		anzahl20C = (betraginCent%200%100%50) / 20;
		anzahl10C = (betraginCent%200%100%50%20) / 10;
		anzahl5C = (betraginCent%200%100%50%20%10) / 5;
		anzahl2C = (betraginCent%200%100%50%20%10%5) / 2;
		anzahl1C = (betraginCent%200%100%50%20%10%5%2) / 1;
		
		System.out.println(anzahl2E + " x 2 Euro\n"
						+  anzahl1E + " x 1 Euro\n"
						+  anzahl50C + " x 50 Cent\n"
						+  anzahl20C + " x 20 Cent\n"
						+  anzahl10C + " x 10 Cent\n"
						+  anzahl5C + " x 5 Cent\n"
						+  anzahl2C + " x 2 Cent\n"
						+  anzahl1C + " x 1 Cent\n");
	
	}
}