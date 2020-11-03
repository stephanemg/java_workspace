package m2i.tp11Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	// le filter accepte un predicat, on prends un lambda pour tester < 3500 km
	public static void main(String[] args) {
		List<Gagnants> lst = Gagnants.gagnantsTDF.stream().filter(obj -> obj.getKilometres() < 3500)
				.collect(Collectors.toList());
		// utilisation des streams pour afficher le contenu de la liste finale
		lst.stream().forEach(obj -> {
			System.out.println(obj);
		});
		// exo 8
		List<String> l = Gagnants.gagnantsTDF.stream().filter(obj -> obj.getKilometres() < 3500)
				.map(o -> o.getNom().substring(0, 2)).collect(Collectors.toList());
		l.stream().forEach(obj -> {
			System.out.println(obj);
		});
//gagnants wiggins optional s'il existe pas
		Optional<Gagnants> l2 = Gagnants.gagnantsTDF.stream().filter(obj -> obj.getKilometres() < 3500)
				.filter(o -> o.getNom().contains("Wiggins")).findAny();
		if (l2.isPresent()) {
			System.out.println(l2.get());
		}
		// exo 11 on utilise un combiner Integer::sum pour la discordance entre int et
		// Gagnant pour calculer l'accumulation
		int res = Gagnants.gagnantsTDF.stream().reduce(0, (sub, el) -> sub + el.getKilometres(), Integer::sum);
		System.out.println("nombre kilometres " + res);

		// exo 14
		Optional<Gagnants> g = Gagnants.gagnantsTDF.stream()
				.max(Comparator.comparingDouble(Gagnants::getVitesseMoyenne));
		if (g.isPresent()) {
			System.out.println(g.get());
		}
		// exo A avec mapstruct
		System.out.println("exA");
		final GagnantsMapper gm = GagnantsMapper.INSTANCE;
		Gagnants.gagnantsTDF.stream().map(gm::asDTO).forEach(System.out::println);

		// exob
		List<Gagnants> gagnantsTdfXfois = new ArrayList<Gagnants>();

//		Gagnants.gagnantsTDF.parallelStream().map(o -> {
//			
//		});
		
		for (int i = 0; i < 400000; i++) {
			gagnantsTdfXfois
					.add(Gagnants.builder().annnee(2020).nationalite("FR").nom("John" + i).kilometres(3800).build());
		}
		System.out.println("nouvelle taille : " + gagnantsTdfXfois.size());

	}

}
