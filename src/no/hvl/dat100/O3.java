package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = Integer.parseInt(showInputDialog("Heltall: "));
		int fakultet = 1;

		for (int i = 1; i <= n; i++) {
			fakultet *= i;
		}
		if (n > 0) {
			System.out.println("Verdien av " + n + "! er: " + fakultet);

		} else {
			System.out.println("Feilmelding, skriv en verdi over 0");
		}
	}

}
