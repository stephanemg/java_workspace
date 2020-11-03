package m2i.tp1Lambdas;

public class Lavomatic {

	public static void main(String[] args) {
		//la fonction lambda a la meme signature que l'interface
		IMachineALaver e = () -> System.out.println("elle demarre");
		e.demarrer();
	}

}
