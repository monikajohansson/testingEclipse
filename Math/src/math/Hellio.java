package math;

import java.util.Scanner;

public class Hellio {

	public static void main(String[] args) {

		boolean active = true;

		while (active) {

			Scanner scan = new Scanner(System.in);

			System.out.println("Skriv in två tal!");
			int a = scan.nextInt();
			int b = scan.nextInt();

			Calculations number = new Calculations(a, b);

			System.out.println("Vad vill du göra?");
			System.out.println("1. Addera");
			System.out.println("2. Subtrahera?");
			System.out.println("3. Multiplicera?");
			System.out.println("4. Dividera?");
			System.out.println("5. Avsluta?");

			int choice = scan.nextInt();

			if (choice <= 4) {
				System.out.println(number.calculate(choice));
			} else if (choice == 5) {
				active = false;
			}scan.close();
		}

		}
}
