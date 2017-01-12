package IMC;

public class Personne {

	public String nom;
	public String prenom;
	public double poids;
	public double taille;
	public boolean sexe;

	public double IMC() {

		return (this.poids / (this.taille * this.taille));
	}

	public String diagnostic() {

		double IMC = IMC();

		if (IMC < 17) {
			return "annorexic";
		} else if (IMC < 19) {
			return "maigre";
		} else if (IMC < 25) {
			return "super forme";
		} else if (IMC < 30) {
			return "kilos en trop";
		} else if (IMC < 40) {
			return "obese";
		} else {
			return "obese morbide";
		}
	}

	public double poidsMax() {

		return (25 * this.taille * this.taille);

	}

	public double poidsMin() {

		return (19 * this.taille * this.taille);

	}

	public double poidsIdeal() {

		if (sexe == true) {
			return (22 * this.taille * this.taille);
		} else {
			return (21 * this.taille * this.taille);
		}
	}

}
