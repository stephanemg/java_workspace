package m2i;

public class Dummy {
	int val = 1;

	public static void main(String[] args) {
		Dummy d = new Dummy();
		d.maMethode();
	}

	void maMethode() {

		Imethodreference ref = new Imethodreference() {
			int val = 2;

			// le this reference la propriete de l'interface instanciee
			@Override
			public void affiche() {
				System.out.println(this.val);
			}
		};

		// le this reference la propriete de la classe qui contient la reference de
		// methode
		Imethodreference ref2 = () -> {
			System.out.println(this.val);
		};
		ref.affiche();
		ref2.affiche();

	}

}

interface Imethodreference {
	void affiche();
}
