package no.hvl.dat100.prosjekt.kontroll;

import no.hvl.dat100.prosjekt.modell.KortSamling;
import no.hvl.dat100.prosjekt.modell.KortUtils;
import no.hvl.dat100.prosjekt.TODO;
import no.hvl.dat100.prosjekt.kontroll.dommer.Regler;
import no.hvl.dat100.prosjekt.modell.Kort;

/**
 * Klasse som implementerer bordet som spilles pÃ¥.
 * 
 * Klassen har objektvariablene bunkeTil og bunkeFra som skal brukes til Ã¥
 * representere kortene som er i de to bunker pÃ¥ border.
 */
public class Bord {

	private KortSamling bunkeFra;
	private KortSamling bunkeTil;

	/**
	 * Metoden oppretter to bunker, til- og fra-bunken Alle kortene legges til
	 * fra-bunken.
	 */
	public Bord() {

		// TODO - START

		bunkeFra = new KortSamling();
		bunkeFra.leggTilAlle();
		bunkeTil = new KortSamling();
		// throw new UnsupportedOperationException(TODO.constructor("Bord"));
		// TODO - END
	}

	/**
	 * Gir peker/referanse til til-bunken.
	 * 
	 * @return referanse/peker til til-bunken.
	 */
	public KortSamling getBunkeTil() {

		return bunkeTil;

	}

	/**
	 * Gir peker/referanse til fra-bunken.
	 * 
	 * @return referanse/peker til fra-bunken.
	 */
	public KortSamling getBunkeFra() {

		return bunkeFra;

	}

	/**
	 * Sjekker om til-bunken er tom.
	 * 
	 * @return true om til-bunken er tom, false ellers.
	 */
	public boolean bunketilTom() {

		// TODO - START
		return bunkeTil.getAntalKort() == 0;
		// TODO - END
	}

	/**
	 * Sjekker om fra-bunken er tom.
	 * 
	 * @return true om fra-bunken er tom, false ellers.
	 */
	public boolean bunkefraTom() {

		// TODO - START
		return bunkeFra.getAntalKort() == 0;
		// TODO - END

	}

	/**
	 * Gir antall kort i fra-bunken.
	 * 
	 * @return antall kort i fra-bunken.
	 */
	public int antallBunkeFra() {

		// TODO - START
		return bunkeFra.getAntalKort();
		// TODO - END
	}

	/**
	 * Gir antall kort i til-bunken.
	 * 
	 * @return antall kort i til-bunken.
	 */
	public int antallBunkeTil() {

		// TODO - START
		return bunkeTil.getAntalKort();
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Tar øverste kortet fra fra-bunken og legger dettte til til-bunken (med
	 * billedsiden opp, men det trenger ikke gruppen tenke på).
	 */
	public void vendOversteFraBunke() {

		// TODO - START
//		Kort[] samling = bunkeFra.getSamling();
//		Kort k = samling[antallBunkeFra()-1];
//		bunkeTil.leggTil(k);
//		bunkeFra.fjern(k);

		bunkeTil.leggTil(bunkeFra.taSiste());

		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END

	}

	/**
	 * Tar øverste kortet fra fra-bunken.
	 * 
	 * @return peker/referanse til det kort som blev tatt fra fra-bunken
	 */

	public Kort taOversteFraBunke() {

		// TODO - START
		return bunkeFra.taSiste();
		 

		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Metode som leser øverste kortet i til-bunken. Kortet vil fremdeles være
	 * øverst i til-bunken etter at metoden er utfÃ¸rt.
	 * 
	 * @return peker/referanse til øverste kortet i til-bunken.
	 */
	public Kort seOversteBunkeTil() {

		// TODO - START
		return bunkeTil.seSiste();
		// throw new UnsupportedOperationException(TODO.method());

		// TODO - END
	}

	/**
	 * Når fra-bunken blir tom, tar man vare på kortet, på toppen av til-bunken.
	 * Deretter legges alle de andre kortene i til-bunken over i fra-bunken. Denne
	 * stokkes og kortet som man har tatt vare på‚ legges tilbake i til-bunken. Det
	 * vil nå være det eneste kortet i til-bunken.
	 */
	public void snuTilBunken() {

		// TODO - START
		// frabunke: der kort trekkes fra
		// tilbunke: der kort spilles til (alle kan se disse)

		// alle kortene bortsett fra det siste skal flyttes til frabunken
		Kort siste = bunkeTil.taSiste(); // sparer på det siste
		Kort[] resten = bunkeTil.getAllekort(); // henter ut resten som skal flyttes til frabunke

		// nå kan vi fjerne alle kortene i
		bunkeTil.fjernAlle();
		bunkeTil.leggTil(siste);

		// Deretter legges alle de andre kortene i til-bunken over i fra-bunken
		for (Kort kort : resten) {
			bunkeFra.leggTil(kort);
		}

		// TODO - END
	}

	/**
	 * Metode som legger et kort i til-bunken.
	 * 
	 * @param k kort som skal legges ned.
	 * 
	 */
	public void leggNedBunkeTil(Kort k) {

		// TODO - START
		bunkeTil.leggTil(k);
		// throw new UnsupportedOperationException(TODO.method());
		// TODO - END

	}
}
