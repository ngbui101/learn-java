class Aufgabe243 {
	public static void main(String args[]) {
		
		System.out.println("Geben Sie die Fluessigkeitsmengen in Liter ein");
		double menge = new java.util.Scanner(System.in).nextDouble();
		
		if (menge <= 1 && menge >= 0.1) 
			System.out.printf("ca. %d cl", (int)(menge * 100));
		else if (menge >= 0.001 && menge <= 0.1)
			System.out.printf("ca. %d ml", (int)(menge * 1000));
		else if (menge <= 0.001)
			System.err.println("zu klein");
		else 
			System.out.printf("ca. %d l", (int)menge);
		
	}
}