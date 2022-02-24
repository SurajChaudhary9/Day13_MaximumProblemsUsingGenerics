/**UC4 : PROBLEM STATEMENT
 * Refactor all the 3 to One Generic Method and find the maximum
 *
 */
package com.bridgelabz.generics;

public class TestMaximum<T extends Comparable<T>> {
	private T x, y, z;

//constructor
	public TestMaximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static <T extends Comparable<T>> T testMaximum(T x, T y, T z) {
		T max = x;// Initializing x as greater
		if (y.compareTo(max) > 0)
			max = y;// as of now y is greater

		if (z.compareTo(max) > 0)
			max = z;// now z is greater
		printMax(x, y, z, max);
		return max;

	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("the Max of the following %s , %s and %s is %s\n", x, y, z, max);
	}
}