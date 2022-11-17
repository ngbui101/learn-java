class Aufgabe244 {
	public static void main(String args[]) {
		double zahl = Math.random();
		String farbe = "";
		if (zahl < 1./3)
			farbe = "red";
			else if (zahl < 2./3)
				farbe = "green";
				else 
					farbe = "blue";
		System.out.printf("<circle cx=\"20\" cy=\"20\" r=\"5\" fill=\"%s\">",farbe);
	}
}
				
		
		