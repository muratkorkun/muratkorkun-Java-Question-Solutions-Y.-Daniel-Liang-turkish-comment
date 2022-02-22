package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_8_dizininOrtalamasi {
public static void main(String[] args) { 
	// Burada double alýp double  dönderen method kullanýldý.
	System.out.println("Lütfen ortalamasý hesaplanmasý için 10 adet sayý giriniz");
	
	double[] sayiDizisi=new double[10];
	
	Scanner klavye=new Scanner(System.in);
			
	for (int i = 0; i < sayiDizisi.length; i++) {
		sayiDizisi[i]=klavye.nextDouble();
	}
	
	System.out.println("Girdiðiniz sayýlarýn ortalamasý : "+diziOrtalamaHesapla(sayiDizisi));
	
	//Burada int alýp int dönderen method kullanýldý.
	System.out.println("Lütfen ortalamasý hesaplanmasý için 10 adet sayý giriniz");
	
	int[] sayiDizisi2=new int[10];
	
	for (int i = 0; i < sayiDizisi2.length; i++) {
		sayiDizisi2[i]=klavye.nextInt();
	}
	System.out.println("Girdiðiniz sayýlarýn ortalamasý : "+diziOrtalamaHesapla(sayiDizisi2));
}


public static int diziOrtalamaHesapla(int[] dizi) {
	int diziToplami=0;
	for (int i = 0; i < dizi.length; i++) {
		diziToplami += dizi[i];
	}
	int diziOrtalamasi=diziToplami/dizi.length;
	return diziOrtalamasi;
}
public static double diziOrtalamaHesapla(double[] dizi) {
	double diziToplami=0;
	for (int i = 0; i < dizi.length; i++) {
		diziToplami+=dizi[i];
	}
	double diziOrtalamasi=diziToplami/dizi.length;
	return diziOrtalamasi;
}


}
