package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class O1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Inntekt = Integer.parseInt(showInputDialog("Bruttoinntekt: ") );
		double trinn1 = Inntekt*0.17;
		double trinn2 = Inntekt*0.04;
		double trinn3 = Inntekt*0.136;
		double trinn4 = Inntekt*0.166;
		double trinn5 = Inntekt*0.176;
	
		
		if (Inntekt <= 208050) {
			System.out.println("Du har ingen trinnskatt!");
		};
		if (Inntekt >= 208051 && Inntekt <= 292850) {
			System.out.println("Trinnskatten din er 1.7%, du må betale: " + Math.round(trinn1) + "kr i trinnskatt");
			System.out.println("Du har til gode:" + "kr");
		};
		if (Inntekt >= 292851 && Inntekt <= 670000) {
			System.out.println("Trinnskatten din er 4%, du må betale: " + Math.round(trinn2) + "kr i trinnskatt");
		}
		if (Inntekt >= 670001 && Inntekt <= 937900) {
			System.out.println("Trinnskatten din er 13.6%, du må betale: " + Math.round(trinn3) + "kr i trinnskatt");
		}
		if (Inntekt >= 937901 && Inntekt <= 1350000) {
			System.out.println("Trinnskatten din er 16.6%, du må betale: " + Math.round(trinn4) + "kr i trinnskatt");
		}
		if (Inntekt >= 1350001) {
			System.out.println("Trinnskatten din er 17.6%, du må betale: " + Math.round(trinn5) + "kr i trinnskatt");
			System.out.println("Du har til gode ");
		
		}
	
	}
	
}


