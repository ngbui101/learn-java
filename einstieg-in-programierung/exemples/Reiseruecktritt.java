class Reiseruecktritt {
	public static void main(String args[]) {
		int startwert = 1000, endwert = 15000,
			schrittweite = 200;
		int summe1 = 0, summe2 = 0, summe3 = 0;
		
		System.out.println("Preis\tVer1\tVer2\tVer3\tMinimum\t\tDelta Min.");
		for ( int reisepreis = startwert; reisepreis <= endwert; reisepreis += schrittweite) {
				double praemie1 = 50 + 0.04 * reisepreis,
					   praemie2 = 0.05 * reisepreis,
					   praemie3 = 100 + 0.035 * reisepreis;
				double minumum = praemie1;
				double deltaMin = 0.;
				String versicherung = "Versich. 1";
						
				if (praemie2 < minumum) {
						minumum = praemie2;
						versicherung = "Versich. 2";
				}
				if (praemie3 < minumum) {
						minumum = praemie3;
						versicherung = "Versich. 3";
				}
				switch (versicherung) {
					case "Versich. 1" : summe1++;
						deltaMin = (praemie2<praemie3) ? praemie2 - praemie1 : praemie3 - praemie1;
						break;
					case "Versich. 2" : summe2++;
						deltaMin = (praemie1<praemie3) ? praemie1 - praemie2 : praemie3 - praemie2;
						break;
					case "Versich. 3" : summe3++;
						deltaMin = (praemie1<praemie2) ? praemie1 - praemie3 : praemie2 - praemie3;
						break;
				}
				System.out.printf("%d\t%d\t%d\t%d\t%s\t%d%n",
								  reisepreis, (int)praemie1,(int)praemie2,(int)praemie3,versicherung,(int)deltaMin);
				
		}
		System.out.printf("Am guenstiegsten:%n"+
							"Versicherung 1: %d mal%n" +
							"Versicherung 2: %d mal%n" +
							"Versicherung 3: %d mal%n",
							summe1,summe2,summe3);
	}
}
		