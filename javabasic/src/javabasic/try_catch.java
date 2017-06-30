package javabasic;

public class try_catch {
	public static void main(String[] args) {

		try {
			int a = 4 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println(5 / 0);

	}
}
