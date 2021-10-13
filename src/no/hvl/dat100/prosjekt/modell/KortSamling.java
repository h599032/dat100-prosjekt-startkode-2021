package no.hvl.dat100.prosjekt.modell;

import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;

/**
 * Struktur for å lagre ei samling kort. Kan lagre hele kortstokken. Det finnes
 * en konstant i klassen Regler som angir antall kort i hver av de 4 fargene.
 * Når programmet er ferdig settes denne til 13, men under utvikling / testing
 * kan det være praktisk å ha denne mindre.
 * 
 */
public class KortSamling {

	private final int MAKS_KORT = 4 * Regler.MAKS_KORT_FARGE;

	private Kort[] samling;
	private int antall;

	/**
	 * Oppretter en tom Kortsamling med plass til MAKS_KORT (hele kortstokken).
	 */
	public KortSamling() {
		samling = new Kort[MAKS_KORT];
		antall = 0;
	}

	/**
	 * Returnerer en tabell med kortene i samlinga. Tabellen trenger ikke være
	 * full. Kortene ligger sammenhengende fra starten av tabellen. Kan få tilgang
	 * til antallet ved å bruke metoden getAntallKort(). Metoden er først og
	 * fremst ment å brukes i testklasser. Om man trenger kortene utenfor,
	 * anbefales metoden getAlleKort().
	 * 
	 * @return tabell av kort.
	 */
	public Kort[] getSamling() {

		return samling;

	}

	/**
	 * Antall kort i samlingen.
	 * 
	 * @return antall kort i samlinga.
	 */
	public int getAntalKort() {

		// TODO - START
		return antall;
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Sjekker om samlinga er tom.
	 * 
	 * @return true om samlinga er tom, false ellers.
	 */
	public boolean erTom() {

		// TODO - START

		boolean tom = false;
		if (antall == 0) {
			tom = true;
		}

		return tom;

		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Legg et kort til samlinga.
	 * 
	 * @param kort er kortet som skal leggast til.
	 */
	public void leggTil(Kort kort) {

		// TODO - START
		if (antall < samling.length) {
			samling[antall] = kort;
			antall++;
		}
	}

	// TODO - END

	/**
	 * Legger alle korta (hele kortstokken) til samlinga. Korta vil v�re sortert
	 * slik at de normalt m� stokkes f�r bruk.
	 */
	public void leggTilAlle() {

		// TODO - START
		Kort kort;
		for (Kortfarge f : Kortfarge.values()) {
			for (int i = 0; i <= Regler.MAKS_KORT_FARGE; i++) {
				kort = new Kort(f, i);
				leggTil(kort);
			}
		}

		// Husk: bruk Regler.MAKS_KORT_FARGE for � f� antall kort per farge

		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	}

	/**
	 * Fjerner alle korta fra samlinga slik at den blir tom.
	 */
	public void fjernAlle() {

		// TODO - START
		antall = 0;
		samling = new Kort[antall];
		}
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END
	

	/**
	 * Ser på siste kortet i samlinga.
	 * 
	 * @return siste kortet i samlinga, men det blir ikke fjernet. Dersom samalinga
	 *         er tom, returneres null.
	 */
	public Kort seSiste() {

		// TODO - START
		Kort k = null;
		if (antall == 0) {
			k = null;
		} if( antall != 0) {
			k = new Kort(samling[antall-1].getFarge(), samling[antall-1].getVerdi());
		}
		 return k;
			
			
			
		// TODO - END

	}

	/**
	 * Tar ut siste kort fra samlinga.
	 * 
	 * @return siste kortet i samlinga. Dersom samalinga er tom, returneres null.
	 */
	public Kort taSiste() {

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Unders�ker om et kort finst i samlinga.
	 * 
	 * @param kort.
	 * 
	 * @return true om kortet finst i samlinga, false ellers.
	 */
	public boolean har(Kort kort) {

		// TODO - START
		boolean har = false;
		int i = 0;
		
		if (kort == null) {
			har = false;
		}
		while (i < samling.length && !har) {
			 if (samling[i] != null) {
				har = samling[i].lik(kort);
				i++;
				}
			}
			return har;
		}
		

	// TODO - END

	/**
	 * Fjernar et kort frå samlinga. Dersom kortet ikke finnest i samlinga, skjer
	 * ingenting med samilingen
	 * 
	 * @param kort kortet som skal fjernast. Dersom kortet ikke finnes, skjer
	 *             ingenting.
	 * @return true om kortet blev fjernet fra samlinga, false ellers.
	 */

	public boolean fjern(Kort kort) {

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Gir kortene som en tabell av samme lengde som antall kort i samlingen
	 * 
	 * @return tabell av kort som er i samlingen, der kort skal ha samme rekkefølge
	 *         som i kortsamlinga.
	 */
	public Kort[] getAllekort() {

		// TODO - START

		throw new UnsupportedOperationException(TODO.method());

		// TODO - END

	}

}
