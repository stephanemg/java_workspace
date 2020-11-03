package m2i.tp7;

import java.util.Arrays;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		Integer a[] = new Integer[] { 1, 2, 3 };
		List<Integer> l = Arrays.asList(a);
		l.forEach(e -> {
			System.out.println(e);
		});
		l.forEach(System.out::println);

		// ex2 (appel de methode par reference
		imethodReference ref = Dummy::maMethode;
		ref.affiche();

		imethodReference ref2 = new Dummy()::maMethodeNonStatic;
		ref2.affiche();
	}

	public static void maMethode() {
		System.out.println("coucou");
	}

	public void maMethodeNonStatic() {
		System.out.println("coucou");
	}

}

@FunctionalInterface
interface imethodReference {
	void affiche();
}