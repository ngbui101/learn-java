public class Stimmenzaelen {
	public static void main(String args[]) {
		int[] zaelerliste = new int[41];
		
		do {
			System.out.println("Geben Sie Kandidaten Nummer ein\n"+
								"Ende: Nummer >= 100");
			int nummer = new java.util.Scanner(System.in).nextInt();
			if ( nummer >= 100) 
				break;
			if (nummer < 0 || nummer > 40)
			//System.out.println("Geben Sie eine gültige Nummer ein");
				zaelerliste[0] = zaelerliste[0] + 1;
			else 
				zaelerliste[nummer] = zaelerliste[nummer] + 1;
		}while (true);
		for ( int i = 1; i <= 40; i++) 
			System.out.printf("Kandidaten mit der Nummer %d erhielt %d Stimme(n)%n", i, zaelerliste[i]);
			System.out.println("Ungueltige Stimme: " + zaelerliste[0]);
	}
}
	
		