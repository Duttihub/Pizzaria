package model;

public class Fahrer {
private String vorname;
	
	private String nachname;

	private Bestellung[] bestellungen = new Bestellung[1000];
	
	private int aktuelleBestellung;
	
	public Fahrer(String vorname, String nachname) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
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
	
	@Override
	public String toString() {
		return "Fahrer [vorname=" + vorname + ", nachname=" + nachname + "]";
	}

}



