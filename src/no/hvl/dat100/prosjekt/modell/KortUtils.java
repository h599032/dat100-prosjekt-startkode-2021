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
		Kort[] kort = samling.getSamling();
		int antall = samling.getAntalKort();
		for (int i = 0; i < antall - 1; i++) {
			if (kort[i].compareTo(kort[i + 1]) > 0) {
				Kort a = kort[i];
				kort[i] = kort[i + 1];
				kort[i + 1] = a;
			} 
		}
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

	/**
	 * Stokkar en kortsamling.
	 * 
	 * @param samling samling av kort som skal stokkes.
	 */
	public static void stokk(KortSamling samling) {

		// TODO - START
		int rad = 0;
		Kort[] sam = samling.getSamling();
		int ant = samling.getAntalKort();
		Random rand = new Random();
		for (int i = 0; i < ant; i++) {
			rad = rand.nextInt(ant - 1);
			sam[i] = sam[rad];
		}
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

}
