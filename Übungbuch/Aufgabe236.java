class Aufgabe236 {
	public static void main(String args[]) {
	
		System.out.println("Geben Sie di erreichente Punktzahl ein");
		int dealer = new java.util.Scanner(System.in).nextInt();
		int player = new java.util.Scanner(System.in).nextInt();
		int ausgabe;
		//fall 1 ein von beider kleiner als 2 oder beide 
		if (dealer < 2 || player < 2)
			return;
		//fall eine von beide oder beide größer als 21
		if (dealer > 21 || player > 21) {
			if (dealer > player) ausgabe = (player>21)? 0 : player;
			else ausgabe = (dealer>21)? 0: dealer;
		}
		//beide kleiner oder gleich 21
		else ausgabe = (dealer > player)? dealer : player;
		
		System.out.println(ausgabe);
	}
}