package test;

import beans.Current;
import beans.Savings;

public class Testclass {
	public static void displayResults(Savings s, Current c) {
		System.out.println(c.toString());
	}

	public static void main(String args[]) {
		Current c1 = new Current(1000897, 10000, "HSBC001", "Supraja");
		Savings s1 = new Savings(1, 50000, "HSBC0012", 10000);
		displayResults(s1, c1);
	}
}
