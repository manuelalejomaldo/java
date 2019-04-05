package ca.csf.dfc.console;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	
	
	public static Integer identite(Integer p_Valeur) {
		return p_Valeur;
	}
	
	public static Double carre(Double i) {
		
		return i * i;
	}
	
	public static long multiplication(int i, int b) {
		
		return i * b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> id1 = Main::identite;
		/*
		 * en esta linea se explica como funciona Function
		 * que es public interface Function <T,R>
		 * 
		 * 
		*/
		System.out.println(id1.apply(123));
		
		Function<Integer, Integer> id2 = (Integer v) -> v;
		System.out.println(id2.apply(123));
		
		/*
		 * 4.exercice2 
		 * */
		//Double nb = 2.0; 
		System.out.println(carre(2.0));
		Function<Double,Double> fctCarre_V01 = Main::carre; 
		System.out.println(fctCarre_V01.apply(2.0));
		
		Function<Double,Double> fctCarre_V02 = (Double v2) -> v2;
		System.out.println(fctCarre_V02.apply(2.0));
		
		/*
		 * 5. Exemple 2
		 * */
		BiFunction<Integer, Integer, Integer> fct = (Integer a, Integer b) -> a + b;
		System.out.println(fct.apply(123, 456));
		
		/*
		 * 6 example 2.
		 * */
		BiFunction<Integer,Integer,Integer> fctMultiplication_V01 = (Integer a, Integer b) -> a*b;
		System.out.println(fctMultiplication_V01.apply(5, 2));
		System.out.println(multiplication(5,2));
		
		/*
		 * 8. Exercice 3 :
		 * */
		Function<Integer, Integer> id3 = ( v) -> v;
		System.out.println(id3.apply(123));
		Function<Double,Double> fctCarre_V03 = ( v2) -> v2;
		System.out.println(fctCarre_V03.apply(2.0));
		BiFunction<Integer, Integer, Integer> fct2 = ( a,  b) -> a + b;
		System.out.println(fct2.apply(123, 456));
		BiFunction<Integer,Integer,Integer> fctMultiplication_V02 = ( a,  b) -> a*b;
		System.out.println(fctMultiplication_V02.apply(5, 2));
		/*
		 * exemple stream
		 * */
		
		List<Integer> lst0 = new ArrayList<>();
		lst0.add(1);
		lst0.add(2);
		lst0.add(3);
		lst0.add(4);
		List<Integer> lst1 = Arrays.asList(1, 2, 3, 4);
		List<Integer> lst2 = Stream.of(1, 2, 3, 4).collect(Collectors.toList());
		
		Stream<Integer> stream = lst2.stream();
		
		IntStream stream2 = IntStream.range(0, 501);
		
		
		stream2.filter(n -> n % 2 == 0)
		.forEach(System.out::println);
		
		System.out.println(stream);
		//System.out.println(stream);
		
		Stream.of(new Personne("P11"),
				new Personne("P12"),
				new Personne("P21"),
				new Personne("P22"))
				.filter(p -> p.getNom().startsWith("P1"))
				.forEach(System.out::println);
				Stream.of(new Personne("P11"),
				new Personne("P12"),
				new Personne("P21"),
				new Personne("P22"))
				.filter(p -> p.getNom().startsWith("P2"))
				.map(p -> "Map - " + p.getNom())
				.forEach(System.out::println);
	}

}
