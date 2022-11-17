class Aufgabe246 {
	public static void main (String args[]) {
		String eingabe = new java.util.Scanner(System.in).next();
		String ausgabe = "";
		
		switch (eingabe) {
			case "Ay","Ay, ay", "Ein Ei", "yes", "ja" : ausgabe = "Keep it up"; 
				break;
			default : ausgabe = "Dont you dare!";
		}
		System.out.println(ausgabe);
	}
}