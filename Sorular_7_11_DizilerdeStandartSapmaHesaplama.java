package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

import bolum02.Ortalamahesaplama;

public class Sorular_7_11_DizilerdeStandartSapmaHesaplama {

	public static void main(String[] args) {
		System.out.println("L�tfen ortalamas�n�n  ve standart sapmas�n�n  hesaplanmas� i�in 10 adet say� giriniz");
		Scanner klavye=new Scanner(System.in);
		
		double[] sayiDizisi=new double[10]; //say�lar� kullan�c�dan almak i�in d�ng� kulland�k.
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i]=klavye.nextDouble();
		}
		
		klavye.close();
		
		System.out.printf("Girdi�iniz say�lar�n  aritmetik ortalamas� : %.2f \nGirmi� oldu�unuz say�lar�n standartsapmas� : %.5f",ortalamaHesapla(sayiDizisi),standartSapmaHesaplama(sayiDizisi));
		
		
	}
	
public static double ortalamaHesapla(double[] dizi) { //burada d�ng� ile ortalama hesaplama metodu yazd�k.
	double toplam = 0;
	for (int i = 0; i < dizi.length; i++) {
		toplam+=dizi[i];
	}
	double ortalama=toplam/dizi.length;
	return ortalama;
}
public static double standartSapmaHesaplama (double[] dizi) { ///Burada dizideki say�lar toplam� ve sayilarin kareleri toplami bize formulde laz�m oldu�undan d�ng� i�inde gerek i�lemleri yapt�k.
	double standartSapma=0;
	double sayilarToplami=0;
	double kareleriToplami=0;
	for (int i = 0; i < dizi.length; i++) {
		sayilarToplami += dizi[i];
		kareleriToplami += Math.pow(dizi[i], 2);
	}
	// standart sapma formul�n� anlayana kadar can�m ��kt� ama en sonunda a�a��daki �ekilde net bir ��z�me ula�abildim.
	standartSapma=Math.pow((kareleriToplami-Math.pow(sayilarToplami, 2)/dizi.length)/(dizi.length-1),0.5); // kare al�rken kulland���m metodla 1/2 yani 0.5 in karesini ald���mda karek�k�n� alm�� oluyorum. Yani Math.sqrt() metoduyla ayn� i�i yapm�� oluyoruz.
	return  standartSapma;
}
} 
//  1,9  2,5  3,7  2  1  6  3  4  5  2   Bunlar test say�lar�d�r sonu�lar ��yle ��kmal� : Ortalama 3.11 Standart sapma 1.55738
//  1  2  3  4,5  5,6  6  7  8  9  10   Bunlar test say�lar�d�r sonu�lar ��yle ��kmal� :  Aritmetik ortalama 5.61 Standart sapma 2.99794
