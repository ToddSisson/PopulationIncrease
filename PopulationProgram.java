package num6;

import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Population p1 = new Population();

		do {
			System.out.print("Enter the number of organisms: ");
			p1.setOrganisms(input.nextInt());
		}
		while (p1.getOrganisms() < 2);

		do {
			System.out.print("Enter the population growth %: ");
			p1.setPopulationIncrease(input.nextDouble() / 100);
		}
		while (p1.getPopulationIncrease() < 0);

		do {
			System.out.print("Enter the number of days: ");
			p1.setDays(input.nextInt());
		}
		while (p1.getDays() < 1);

		p1.growPopulation();
		
		input.close();
	}

}
