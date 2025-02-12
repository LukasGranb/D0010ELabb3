package Labb3.modell;

public class Gång {

	// TODO: Lägg till tillståndsvariabler för att hålla parametrarna till
	// konstruktorn.

	Rum frånRum;
	Väderstreck riktningFrån;
	Väderstreck riktningTill;
	Rum tillRum;



	public Gång(Rum från, Väderstreck riktningUtUrFrån, Rum till,
			Väderstreck riktningInITill) {
		// TODO: Tilldela tillståndsvariablerna parametervärdena.
		this.frånRum = från;
		this.riktningFrån = riktningUtUrFrån;
		this.riktningTill = riktningInITill;
		this.tillRum = till;

	}

	// TODO: Lägg till instansmetoder som returnerar tillståndsvariablernas
	// värden.

	public Rum getFrånRum() {
		return frånRum;
	}

	public Rum getTillRum() {
		return tillRum;
	}

	public Väderstreck getRiktningFrån() {
		return riktningFrån;
	}

	public Väderstreck getRiktningTill() {
		return riktningTill;
	}
}
