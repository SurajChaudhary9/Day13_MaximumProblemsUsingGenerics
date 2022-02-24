package com.bridgelabz.generics;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to check max of three variables");
		String x = "jack", y = "king", z = "queen", m = "rama";
		Integer a = 26, b = 24, c = 18;
		Float p = 1.24f, q = 2.25f, r = 0.1f;
		TestMaximum.<String>testMaximum(x, y, z, m);
		TestMaximum.<Integer>testMaximum(a, b, c);
		TestMaximum.<Float>testMaximum(p, q, r);
	}
}