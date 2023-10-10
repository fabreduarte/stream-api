package edu.daniel.examples;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SuplierExample {

	public static void main(String[] args) {

		Supplier<String> saudacao = () -> "Olá salve mlk";

		// List<String> listaSaudacoes = Stream.generate(saudacao)
		// .limit(5)
		// .collect(Collectors.toList());

		// listaSaudacoes.forEach(s -> System.out.println(s));

		// List<String> listaSaudacoes = Stream.generate(saudacao)
		// .limit(5)
		// .toList();

		List<String> listaSaudacoes = Stream.generate(() -> "Salve Salve galerinha")
				.limit(5)
				.toList();

		listaSaudacoes.forEach(System.out::println);

	}
}
