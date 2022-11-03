public class Aufgabe224 {
	public static void main(String args[]) {
		double rnd = Math.random()*10 + 10;
		System.out.println("<svg height=\"6100\" width=\"1000\">" +
							"\n\t<circle cx=\"100\" cy=\"110\" r=\"" + rnd + "\"/>"
							+ "\n</svg>");
	}
}