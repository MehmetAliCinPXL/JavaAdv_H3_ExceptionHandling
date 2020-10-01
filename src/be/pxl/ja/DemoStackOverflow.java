package be.pxl.ja;

public class DemoStackOverflow {

	private static void printNumber(int x) {
		System.out.println(x);
		printNumber(x + 2);
	}
	// je roept de methode opnieuw op in zichzelf
	// dit maakt een loop
	// hierdoor ontstaat er een error
	// error oplossen door programma goed te schrijven
	public static void main(String[] args) {
		printNumber(15);
	}
}
