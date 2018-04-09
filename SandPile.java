package com.aar.test;

import java.util.*;
import java.io.*;
import java.math.*;

public class SandPile {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] sandPile = new int[n][n];
		
		if (in.hasNextLine()) {
			in.nextLine();
		}
		for (int i = 0; i < n; i++) {
			String row = in.nextLine();
			for (int j = 0; j < n; j++) {
				sandPile[j][i] = Character.getNumericValue(row.charAt(j));
			}
		}

		for (int i = 0; i < n; i++) {
			String row = in.nextLine();
			for (int j = 0; j < n; j++) {
				sandPile[j][i] += Character.getNumericValue(row.charAt(j));
			}
		}
		for (int i = 0; i < n; i++) {
			String line = "";
			for (int j = 0; j < n; j++) {
				line += " " + sandPile[j][i];
			}
			System.out.println(line);
		}
		boolean finished = false;
		while (!finished) {
			finished = true;
			for (int i=0; i <n; i++) {
				for (int j = 0; j < n; j++) {
					if (sandPile[i][j] > 3) {
						finished = false;
						sandPile[i][j] = 0;
						if (i > 0) {
							sandPile[i - 1][j]++;
						}
						if (j > 0) {
							sandPile[i][j - 1]++;
						}
						if (i < n - 1) {
							sandPile[i + 1][j]++;
						}
						if (j < n - 1) {
							sandPile[i][j + 1]++;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			String line = "";
			for (int j = 0; j < n; j++) {
				line += " " + sandPile[j][i];
			}
			System.out.println(line);
		}
	}

}
