class Aufgabe233 {
	public static void main(String args[]) {
		
		System.out.println("Geben Sie zwei Zahlen (ab) ein");
		int zahl1 = new java.util.Scanner(System.in).nextInt()%100;
		int zahl2 = new java.util.Scanner(System.in).nextInt()%100;
		
		int zahl1a = zahl1/10;
		int zahl1b = zahl1%10;
		int zahl2a = zahl2/10;
		int zahl2b = zahl2%10;
		
		/*if (zahl1a == zahl2a || zahl1a == zahl2b) 
			System.out.println("Die Zahl " + zahl1 + " und " + zahl2 + " haben " + zahl1a + 
								" als gemeinsame Ziffer");
		if (zahl1b == zahl2a || zahl1b == zahl2b) 
			System.out.println("Die Zahl " + zahl1 + " und " + zahl2 + " haben " + zahl1b + 
								" als gemeinsame Ziffer");
		*/
		//System.out.println(zahl1a + "\t" + zahl1b + "\t" + zahl2a + "\t" + zahl2b); //test
		boolean istGleich =    zahl1a == zahl2a 
							|| zahl1a == zahl2b
							|| zahl1b == zahl2a 
							|| zahl1b == zahl2b;
		System.out.println(istGleich);
							
	}
}
			