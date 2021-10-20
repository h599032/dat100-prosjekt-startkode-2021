package no.hvl.dat100.prosjekt.modell;

import java.util.Random;

import no.hvl.dat100.prosjekt.TODO;

public class KortUtils {

	/**
	 * Sorterer en samling. Rekkefølgen er bestemt av compareTo() i Kort-klassen.
	 * 
	 * @see Kort
	 * 
	 * @param samling samling av kort som skal sorteres.
	 */

	public static void sorter(KortSamling samling) {

		// TODO - START
		Kort kort;
		Kort[] sorter = samling.getSamling();
		
		for (int i = 1; i < samling.getAntalKort(); i++) {
			
			for (int j = i; j > 0; j--) {
				
				// hvis verdien er mindre 0 kommer this først.
				
				if (sorter[i].compareTo(sorter[j - 1]) < 0) {
					kort = sorter[j];
					sorter[j] = sorter[j - 1];
					sorter[j - 1] = kort;
				}
			}
		}
	}

	
	// throw new UnsupportedOperationException(TODO.method());
	// TODO - END

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		// TODO - START

		Random stokk = new Random();
		
		KortSamling stokket = new KortSamling();
		
		for(int i = 0; i < samling.getAntalKort(); i++) {
			// legger kortene i samling inn i en ny samling
			stokket.leggTil(samling.getAllekort()[i]);
			
		}
		
		samling.fjernAlle();
		int antall = stokket.getAntalKort();
		for(int j = 0; j < antall; j++) {
			Kort stokkKort = stokket.getAllekort()[stokk.nextInt(stokket.getAllekort().length)];
			stokket.fjern(stokkKort);
			samling.leggTil(stokkKort);
		}

		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

}
