package Labb3.modell;

import Labb3.verktyg.Punkt;

import java.awt.*;

public class Rum {

	// TODO: Lägg till tillståndsvariabler.

	private Color färg;
	private int bredd;
	private int höjd;
	private Punkt övPunkt;

	public Rum(Color golvfärg, int bredd, int höjd, int övX, int övY) {
		// TODO: Kopiera parametrarna in i tillståndsvariablerna. (övX,övY) är
		// koordinaten för rummets övre vänstra hörn och lagras lämpligen som en
		// instans av klassen Punkt i paketet verktyg.

		// Tillståndsvariabler
		this.färg = golvfärg;
		this.bredd = bredd;
		this.höjd = höjd;
		this.övPunkt = new Punkt(övX, övY);


	}

	//--------------GETTERS-----------------\\

	public Color getFärg() {
		//returnerar färgen
		return this.färg;
	}

	public int getBredd() {
		//returnerar Bredden
		return this.bredd;
	}

	public int getHöjd() {
		//returnernar Höjden
		return this.höjd;
	}

	public Punkt getÖvPunkt() {
		//returnerar Punkten högst upp till vänseter
		return this.övPunkt;
	}

	// TODO: Skriv instansmetoden
	//
	// finnsUtgångÅt(Väderstreck väderstreck)
	//
	// som ska kontrollera om det från ett rum finns en utgång åt visst
	// väderstreck.

	// TODO: Skriv instansmetoden
	//
	// Gång gångenÅt(Väderstreck väderstreck) som
	// returnerar den gång som leder från ett rum i riktning väderstreck. Om
	// sådan gång saknas ska ett undantag kastas med lämpligt felmeddelande.

	// TODO: Skrivklar metoden nedan som kopplar ihop två rum med en gång.

	public static void kopplaIhop(Rum från, Väderstreck riktningUtUrFrån,
			Rum till, Väderstreck riktningInITill) {

	}
	}

