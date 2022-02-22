package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_8_dizininOrtalamasi {
public static void main(String[] args) { 
	// Burada double al�p double  d�nderen method kullan�ld�.
	System.out.println("L�tfen ortalamas� hesaplanmas� i�in 10 adet say� giriniz");
	
	double[] sayiDizisi=new double[10];
	
	Scanner klavye=new Scanner(System.in);
			
	for (int i = 0; i < sayiDizisi.length; i++) {
		sayiDizisi[i]=klavye.nextDouble();
	}
	
	System.out.println("Girdi�iniz say�lar�n ortalamas� : "+diziOrtalamaHesapla(sayiDizisi));
	
	//Burada int al�p int d�nderen method kullan�ld�.
	System.out.println("L�tfen ortalamas� hesaplanmas� i�in 10 adet say� giriniz");
	
	int[] sayiDizisi2=new int[10];
	
	for (int i = 0; i < sayiDizisi2.length; i++) {
		sayiDizisi2[i]=klavye.nextInt();
	}
	System.out.println("Girdi�iniz say�lar�n ortalamas� : "+diziOrtalamaHesapla(sayiDizisi2));
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
