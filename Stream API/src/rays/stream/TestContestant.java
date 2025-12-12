package rays.stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestContestant {
	public static void main(String[]args) {
		ArrayList<Contestant> list=new ArrayList<Contestant>();
		list.add(new Contestant("8985625477", "Mihir"));
		list.add(new Contestant("8989076432", "Ruby"));
		list.add(new Contestant("7656565434", "Gold"));
		list.add(new Contestant("963021766521", "Pearl"));
		list.add(new Contestant("8844567382", "Aarav"));
		list.add(new Contestant("7687985432", "Vivaan"));
		list.add(new Contestant("8985625475", "Reema"));
		
		System.out.println("---get phone numbers---");
		
		list.stream().map(e -> e.phone).forEach(System.out::println);	
		
		System.out.println("---valid phone numbers---");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).forEach(System.out::println);
		
		System.out.println("---Remove the duplicate---");
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct().forEach(System.out::println);
		
		System.out.println("---shuffle---");

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(),e ->{
			Collections.shuffle(e);
			return e.stream();	
		})).forEach(System.out::println);
		
		
		System.out.println("---3 winners are---");
		
		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
		.collect(Collectors.collectingAndThen(Collectors.toList(),e ->{
			Collections.shuffle(e);
			return e.stream();	
		})).limit(3).forEach(System.out::println);
		
		
	}
}
