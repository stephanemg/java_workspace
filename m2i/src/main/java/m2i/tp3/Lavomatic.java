package m2i.tp3;

public class Lavomatic {

	public static void main(String[] args) {
		// la fonction lambda a la meme signature que l'interface
		IMachineALaver e = (f) -> {
			return ("elle demarre " + f);
		};
		System.out.println(e.demarrer("voiture"));
	}

}
