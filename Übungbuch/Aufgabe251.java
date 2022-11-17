class Aufgabe251 {
	public static void main(String args[]) {
		System.out.println("<svg height=\"200\" width=\"200\">");
		for ( int i = 0; i <= 360; i=i+10) 
			System.out.printf(" <rect x=\"50\" y=\"50\" width=\"100\" height=\"100\" stroke=\"black\" fill=\"none\"\n\t"+
									"transform=\"rotate(%d 100 100)\" />%n", i );
		System.out.println("</svg>");
	}
}