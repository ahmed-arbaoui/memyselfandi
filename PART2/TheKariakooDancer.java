
package com.aar.test;

import java.util.Scanner;

public class Kariakoo {
	/*
	 * Learning the dance of Kariakoo is not as easy as it sounds, but if you apply
	 * some basic rules from the beginning, you can quickly become a Kariakoo
	 * master. The first thing you need to know is that you can only move forward,
	 * or backward. When moving backward, your number of steps will be negative.
	 * 
	 * This dance asks every performer to follow a precise sequence of steps: Stage
	 * 0 : First, get away from obstacles by setting up your starting point at
	 * position 0 Stage 1 : Take one step forward (+1 step) Stage 2 : Take two steps
	 * backward (-2 steps) To follow, the steps as well as the direction you will
	 * have to take in your next move will each time be obtained thanks to a
	 * specific calculation: the number of steps you took on the previous stage
	 * minus the number of steps you took on the penultimate stage (the second-last
	 * stage).
	 * 
	 * That is, on stage 3, a dancer will have to take 3 steps backwards (-2 - 1).
	 */
	public static int getPositionAt(int n) {
		switch (n % 6) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return -1;
		case 3:
			return -4;
		case 4:
			return -5;
		case 5:
			return -3;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("How many steps ?");
		Scanner in = new Scanner(System.in);
		int stepCount = in.nextInt();

		System.out.println("The kariakoo dancer is at position : " + Kariakoo.getPositionAt(stepCount));
	}
}
