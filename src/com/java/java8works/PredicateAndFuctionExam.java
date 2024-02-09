package com.java.java8works;

import java.util.function.Function;

public class PredicateAndFuctionExam {
	public static void main(String[] args) {
		Function<String, Integer> f= name->name.length();
		System.out.println(f.apply("Priya"));
	}

}
