package math;

public class Calculations {
	private int c;
	private int d;

	public Calculations(int a, int b) {
		c = a;
		d = b;

	}

	public int add() {
		return c + d;
	}

	public int sub() {
		return c - d;
	}

	public int mult() {
		return c * d;

	}

	public int div() {
		return c / d;

	}

	public int calculate(int choice) {

		int result = 0;
		if (choice == 1) {
			result = add();
		} else if (choice == 2) {
			result = sub();
		} else if (choice == 3) {
			result = mult();
		}else if (choice == 4) {
			result = div();
		}
		return result;
	}

}
