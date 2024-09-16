package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i < 10; i++) {

			int Poeng = parseInt(showInputDialog("Poengsum: "));
			if (Poeng <= 0 || Poeng >= 100) {
				System.out.println(Poeng + " - Feilmelding");
				Poeng = parseInt(showInputDialog("Poengsum: "));
			}
			if (Poeng <= 100 && Poeng >= 91) {
				System.out.println(Poeng + " - A");
			}
			if (Poeng <= 90 && Poeng >= 80) {
				System.out.println(Poeng + " - B");
			}
			if (Poeng <= 79 && Poeng >= 60) {
				System.out.println(Poeng + " - C");
			}
			if (Poeng <= 59 && Poeng >= 50) {
				System.out.println(Poeng + " - D");
			}
			if (Poeng <= 49 && Poeng >= 40) {
				System.out.println(Poeng + " - E");
			}
			if (Poeng <= 39 && Poeng >= 0) {
				System.out.println(Poeng + " - F");
			}

		}
	}
}
