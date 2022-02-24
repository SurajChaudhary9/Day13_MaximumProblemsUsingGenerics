package com.bridgelabz.generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to Check maximum of three variables");
		String x = "jack", y = "king", z = "queen";
		Integer a = 25, b = 24, c = 19;
		Float p = 1.23f, q = 2.2f, r = 0.2f;
		TestMaximum.<String>testMaximum(x, y, z);
		TestMaximum.<Integer>testMaximum(a, b, c);
		TestMaximum.<Float>testMaximum(p, q, r);
	}
}