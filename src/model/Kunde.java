package model;


public class Kunde{
	
private String vorname;

private String nachname;

private Adresse adresse;

private Bestellung[] bestellungen = new Bestellung[20];

private int aktuelleBestellung;

public Kunde(String vorname, String nachname) {
	super();
	this.vorname = vorname;
	this.nachname = nachname;
}

public Kunde(String vorname, String nachname, Adresse adresse) {
	this(vorname, nachname);
	this.adresse = adresse;
}

public String getVorname() {
	return vorname;
}

public void setVorname(String vorname) {
	this.vorname = vorname;
}

public String getNachname() {
	return nachname;
}

public void setNachname(String nachname) {
	this.nachname = nachname;
}

public Bestellung[] getBestellungen() {
	return bestellungen;
}

public void addBestellungen(Bestellung bestellung) {
	bestellungen[aktuelleBestellung] = bestellung;
	aktuelleBestellung++;
}

public Adresse getAdresse() {
	return adresse;
}

public void setAdresse(Adresse adresse) {
	this.adresse = adresse;
}

@Override
public String toString() {
	return "Kunde [vorname=" + vorname + ", nachname=" + nachname + "]";
}

}

