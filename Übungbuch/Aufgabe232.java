public class Aufgabe232 {
	public static void main(String args[]) {
		int numFl, teilCaptain, teilCrew, crewGroesse;
		boolean isFair;
		
		System.out.println("Geben Sie die Anzahl der Flasche.");
		numFl = new java.util.Scanner(System.in).nextInt();
		
		teilCaptain = numFl/2;
		teilCrew = numFl - teilCaptain;
		System.out.println("Captain CiaoCiao bekommt " + teilCaptain + " Flasche.");
		System.out.println("Crew bekommt " + teilCrew + " Flasche.");
		
		System.out.println("Geben Sie die Anzahl des Crews");
		crewGroesse = new java.util.Scanner(System.in).nextInt();
		
		isFair = (teilCrew%crewGroesse==0);
		System.out.println("Fair geteil? " + isFair);
		
	}
}
		