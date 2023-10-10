package edu.daniel.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Function<Integer, Integer> dobrar = numero -> numero * 2;

		List<Integer> numerosdobrados = numeros.stream()
				.map(n -> n * 2)
				.toList();

		numerosdobrados.forEach(System.out::println);

	}

}
