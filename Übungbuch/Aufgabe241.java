class Aufgabe241 {
	public static void main(String args[]) {
		System.out.println("Geben Sie den Betrag ein");
		int betrag = new java.util.Scanner(System.in).nextInt();
		final int preis = 1000;
		
		if ( betrag <= preis * 1.2 && betrag >= preis * 0.9) 
			System.out.println("Good Boy!");
		else 
			System.out.println("You son of a b****");
	}
}
		
		