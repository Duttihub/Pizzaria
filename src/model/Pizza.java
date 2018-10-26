package model;
import model.Klassifikation;

	public class Pizza {
		
		/**
		 * Die Bezeichnung der Pizza.
		 */
		private String bezeichner;
		
	    /**
	     * Die Grösse der Pizza in Zentimeter.
	     */
		private int groesseInCm;
		
	    /**
	     * Der Preis in Euro der Pizza. 
	     */
		private double preisInEuro;
		
		/**
		 * Die Zutaten der Pizza. 
		 */
		private String zutaten;
		
		/**
		 * Gibt an ob die Pizza vegan ist.
		 */
		private boolean vegan;
		
		private Klassifikation klassifikation;

		/**
		 * Erzeugt eine neue Pizza.
		 * 
		 * @param bezeichner Der Bezeichner der Pizza.
		 * @param groesseInCm Die Grösse der Pizza in Zentimeter.
		 * @param preisInEuro Der Preis der Pizza in Euro.
		 * @param zutaten Die Zutaten der Pizza.
		 * @param vegan Gibt an ob die Pizza vegan ist.
		 * @throws PizzaZuGrossException 
		 */
		public Pizza(String bezeichner, int groesseInCm, double preisInEuro,
				     String zutaten, boolean vegan) throws PizzaZuGrossException {
			super();
			this.bezeichner = bezeichner;
			this.setGroesseInCm(groesseInCm);
			this.preisInEuro = preisInEuro;
			this.zutaten = zutaten;
			this.vegan = vegan;
		}

		/**
		 * Liefert den Bezeichner der Pizza.
		 * 
		 * @return Der Bezeichner der Pizza.
		 */
		public String getBezeichner() {
			return bezeichner;
		}

		/**
		 * Setzt den Bezeichner der Pizza.
		 * 
		 * @param bezeichner Der Bezeichner der Pizza.
		 */
		public void setBezeichner(String bezeichner) {
			this.bezeichner = bezeichner;
		}

		public int getGroesseInCm() {
			return groesseInCm;
		}

		public void setGroesseInCm(int groesseInCm) throws PizzaZuGrossException {
			if (groesseInCm >= 100) {
				throw new PizzaZuGrossException();
			}
			
			this.groesseInCm = groesseInCm;
		}

		public double getPreisInEuro() {
			return preisInEuro;
		}

		public void setPreisInEuro(double preisInEuro) {
			this.preisInEuro = preisInEuro;
		}

		public String getZutaten() {
			return zutaten;
		}

		public void setZutaten(String zutaten) {
			this.zutaten = zutaten;
		}

		public boolean isVegan() {
			return vegan;
		}

		public void setVegan(boolean vegan) {
			this.vegan = vegan;
		}
		
		public Klassifikation getKlassifikation() {
			return klassifikation;
		}

		public void setKlassifikation(Klassifikation klassifikation) {
			this.klassifikation = klassifikation;
		}

		@Override
		public String toString() {
			System.out.println("Falsche Zeile Hierist der Bug");
			
			return "Pizza [bezeichner=" + bezeichner + ", groesseInCm=" + groesseInCm + ", preisInEuro=" + preisInEuro
					+ ", zutaten=" + zutaten + ", vegan=" + vegan + "]";
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
