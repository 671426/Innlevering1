package no.hvl.dat100;

import java.util.Scanner;

public class Oppgave2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			
			int grense = 10;
			for (int i = 1; i <= grense; i++) {
			
		System.out.print("Poeng: ");
		double poeng = Double.parseDouble
			(input.nextLine());
		
		if(poeng > 0) {
			if(poeng < 40) {
				System.out.println("Karakter: F");
			} else if (poeng < 50) {
				System.out.println("Karakter: E");
			} else if (poeng < 60) {
				System.out.println("Karakter: D");
			} else if (poeng < 80) {
				System.out.println("Karakter: C");
			} else if (poeng < 90) {
				System.out.println("Karakter: B");
			} else if (poeng <= 100) {
				System.out.println("Karakter: A");
			} else {
				System.out.println("Ikke gyldig poengsum");
			}
		} else {
			System.out.println("Ikke gyldig poengsum");
		}
			}
	}

}

