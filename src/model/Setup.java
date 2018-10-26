package model;

public class Setup {
private static int bestellnummer = 1;
	
	public Pizzeria generatePizzeria()
	{
		Pizzeria pizzeria = new Pizzeria("Giovanni");
		erzeugeKunden(pizzeria);
		return pizzeria;
	}

	private void erzeugeKunden(Pizzeria pizzeria) {
		erzeugeKunde(pizzeria, "Max", "Mueller", "Treskowallee 8", "10318", "Berlin");
		erzeugeKunde(pizzeria, "Rene", "Meuer", "Treskowallee 8", "10318", "Berlin");
		erzeugeKunde(pizzeria, "Roy", "Robsen", "Treskowallee 8", "10318", "Berlin");
	}
	
	private void erzeugeKunde(Pizzeria pizzeria, String vorname, String nachname, String strasse, String plz, String ort) {
		Adresse adresse = new Adresse(strasse, plz, ort);
		Kunde kunde = new Kunde(vorname, nachname, adresse);
		erzeugeBestellungen(kunde);
		pizzeria.addKunde(kunde);
	}

	private void erzeugeBestellungen(Kunde kunde) {
		erzeugeBestellung(kunde, liefereNaechsteBestellnummer());
		erzeugeBestellung(kunde, liefereNaechsteBestellnummer());
		erzeugeBestellung(kunde, liefereNaechsteBestellnummer());
	}
	
	private void erzeugeBestellung(Kunde kunde, int bestellnummer) {
		kunde.addBestellungen(new Bestellung(bestellnummer));
	}

	private int liefereNaechsteBestellnummer() {
		return bestellnummer++;
	}
	
}


