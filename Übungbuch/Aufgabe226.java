public class Aufgabe226 {
	public static void main(String args[]) {
		double rnd = Math.random()*10 + 10;
		double cx = new java.util.Scanner(System.in).nextDouble();
		double cy = new java.util.Scanner(System.in).nextDouble();
		
		System.out.println("<svg height=\"6100\" width=\"1000\">" +
							"\n\t<circle cx=\"" + cx + "\" cy=\"" + cy + "\" r=\"" + rnd + "\"/>"
							+ "\n</svg>");
	
	}
}