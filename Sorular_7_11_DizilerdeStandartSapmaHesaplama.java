package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

import bolum02.Ortalamahesaplama;

public class Sorular_7_11_DizilerdeStandartSapmaHesaplama {

	public static void main(String[] args) {
		System.out.println("Lütfen ortalamasýnýn  ve standart sapmasýnýn  hesaplanmasý için 10 adet sayý giriniz");
		Scanner klavye=new Scanner(System.in);
		
		double[] sayiDizisi=new double[10]; //sayýlarý kullanýcýdan almak için döngü kullandýk.
		for (int i = 0; i < sayiDizisi.length; i++) {
			sayiDizisi[i]=klavye.nextDouble();
		}
		
		klavye.close();
		
		System.out.printf("Girdiðiniz sayýlarýn  aritmetik ortalamasý : %.2f \nGirmiþ olduðunuz sayýlarýn standartsapmasý : %.5f",ortalamaHesapla(sayiDizisi),standartSapmaHesaplama(sayiDizisi));
		
		
	}
	
public static double ortalamaHesapla(double[] dizi) { //burada döngü ile ortalama hesaplama metodu yazdýk.
	double toplam = 0;
	for (int i = 0; i < dizi.length; i++) {
		toplam+=dizi[i];
	}
	double ortalama=toplam/dizi.length;
	return ortalama;
}
public static double standartSapmaHesaplama (double[] dizi) { ///Burada dizideki sayýlar toplamý ve sayilarin kareleri toplami bize formulde lazým olduðundan döngü içinde gerek iþlemleri yaptýk.
	double ortalama=ortalamaHesapla(dizi); // Burada bir önceki yazdýðýmýz metdou kullandýk ayný dizi üzerinde.
	double standartSapma=0;
	double kareleriToplami=0;
	for (int i = 0; i < dizi.length; i++) {
		kareleriToplami+=Math.pow((dizi[i]-ortalama),2);// Herbir döngüde tekrar tekrar iþlemi yaparak kareleri toplamina ekledik.
	}
	// standart sapma formulünü anlayana kadar caným çýktý ama en sonunda aþaðýdaki þekilde net bir çözüme ulaþabildim.
	standartSapma=Math.sqrt(kareleriToplami/(dizi.length-1)); // kare alýrken isterseniz Math.pow(sayi, 0.5) yaparak da karekök iþlemini yapabilirsiniz. Yani Math.sqrt() metodu þart deðildir. 
	return  standartSapma;
}
} 
//  1,9  2,5  3,7  2  1  6  3  4  5  2   Bunlar test sayýlarýdýr sonuçlar þöyle çýkmalý : Ortalama 3.11 Standart sapma 1.55738
//  1  2  3  4,5  5,6  6  7  8  9  10   Bunlar test sayýlarýdýr sonuçlar þöyle çýkmalý :  Aritmetik ortalama 5.61 Standart sapma 2.99794
