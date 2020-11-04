package m2i.tp12Futures;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;

import m2i.tp11Streams.Gagnants;

public class Main {

	public static Future<String> calculateAsync() throws InterruptedException {
		CompletableFuture<String> completableFuture = new CompletableFuture<>();

		Executors.newCachedThreadPool().submit(() -> {
			Thread.sleep(1000);
			completableFuture.complete("Hello");
			return null;
		});
		System.out.println("calculate async");
		return completableFuture;
	}

	public static void main(String[] args) {
		Future<String> completableFuture = null;
		try {
			completableFuture = calculateAsync();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ...

		try {
			System.out.println("before get");
			String result = completableFuture.get();
			System.out.println("resultat de la future :" + result);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// exo
		List<CompletableFuture<Void>> completableFutures = null;
		completableFutures = Gagnants.gagnantsTDF.stream().map(o -> {
			return CompletableFuture.runAsync(() -> {
				System.out.println("nom de mon gagnant : " + o.getNom());
			});
		}).collect(Collectors.toList());

	}
}
