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
	double standartSapma=0;
	double sayilarToplami=0;
	double kareleriToplami=0;
	for (int i = 0; i < dizi.length; i++) {
		sayilarToplami += dizi[i];
		kareleriToplami += Math.pow(dizi[i], 2);
	}
	// standart sapma formulünü anlayana kadar caným çýktý ama en sonunda aþaðýdaki þekilde net bir çözüme ulaþabildim.
	standartSapma=Math.pow((kareleriToplami-Math.pow(sayilarToplami, 2)/dizi.length)/(dizi.length-1),0.5); // kare alýrken kullandýðým metodla 1/2 yani 0.5 in karesini aldýðýmda karekökünü almýþ oluyorum. Yani Math.sqrt() metoduyla ayný iþi yapmýþ oluyoruz.
	return  standartSapma;
}
} 
//  1,9  2,5  3,7  2  1  6  3  4  5  2   Bunlar test sayýlarýdýr sonuçlar þöyle çýkmalý : Ortalama 3.11 Standart sapma 1.55738
//  1  2  3  4,5  5,6  6  7  8  9  10   Bunlar test sayýlarýdýr sonuçlar þöyle çýkmalý :  Aritmetik ortalama 5.61 Standart sapma 2.99794
