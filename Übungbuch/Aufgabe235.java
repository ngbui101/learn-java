class Aufgabe235 {
	public static void main(String args[]) {
		System.out.println("Geben Sie die Anzahl der Flaschen Rum ein");
		int anzanlFl = new java.util.Scanner(System.in).nextInt();
		String ausgabe = (anzanlFl == 1)? "Flasche":"Flaschen";
		System.out.println(anzanlFl + " " + ausgabe + " Rum");
	}
}
		