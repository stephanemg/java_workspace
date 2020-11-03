package m2i.tp8;

public class Dummy {

	public static void main(String[] args) {
		String c = "toto";
		String res;
		ImonInterface ref = (chars1) -> {
			return new String(chars1);
		};

		ref.maFonction(c);
		
		
		
	}

}

@FunctionalInterface
interface ImonInterface {
	String maFonction(String args);
}
