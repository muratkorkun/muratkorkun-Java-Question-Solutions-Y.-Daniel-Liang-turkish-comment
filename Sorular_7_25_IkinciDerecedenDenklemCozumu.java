package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_25_IkinciDerecedenDenklemCozumu {

	public static void main(String[] args) {

		System.out.println("Köklerin  hesabýnýn yapýlmasý için a,b ,c  deðerleri giriniz.");
		Scanner klavye = new Scanner(System.in);
		double[] sabitler = new double[3];
		double[] kokler = new double[2];

		for (int i = 0; i < sabitler.length; i++) {
			sabitler[i] = klavye.nextDouble();
		}

		klavye.close();

		int kokSayisi = cozIkinciDereceden(sabitler, kokler);

		if (kokSayisi == 0)
			System.out.println("Hiçbir kök yoktur");
		else
			for (int i = 0; i < kokSayisi; i++) {
				System.out.print("Kök " + (i + 1) + ": " + kokler[i] + "\n");
			}
	}

	public static int cozIkinciDereceden(double[] sabitler, double[] kokler) {

		double a = sabitler[0];
		double b = sabitler[1];
		double c = sabitler[2];

		int koklerinSayisi = 0;

		double diskriminant = Math.pow(b, 2) - 4 * a * c;

		if (diskriminant > 0) {
			kokler[0] = (-b + Math.pow(diskriminant, 0.5)) / (2 * a);
			kokler[1] = (-b - Math.pow(diskriminant, 0.5)) / (2 * a);
			koklerinSayisi = 2;
		} else if (diskriminant == 0) {
			kokler[0] = -b / (2 * a);
			koklerinSayisi = 1;
		}
		return koklerinSayisi;
	}
} // Örneklemler => 1,0 3 1 (Denklemin iki koku vardir: -0.381966 ve -2.61803) =>	// 1 2,0 1 (Denklemin bir koku vardýr: -1) => 1 2 3 (Denklemin hicbir gercek	// koku yoktur.)
