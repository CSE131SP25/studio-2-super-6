package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("How much are you starting with?");
		double startAmount = in.nextDouble();
		System.out.println("What are your chances of winning?");
		double winChance = in.nextDouble();
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println("How many days will you gamble?");
		int totalSimulations = in.nextInt();
		double j = 0.0;
		for (int i = totalSimulations; i > 0; i--) {
			while (startAmount != winLimit && startAmount != 0) {
				if (winChance >= Math.random()) {
					startAmount++;
				} else {
					startAmount--;
				}
			}
			if (startAmount == 0) {
				j++;
			}
		}
		double ruinRate = j / totalSimulations;
		System.out.println(ruinRate);
	}

}
