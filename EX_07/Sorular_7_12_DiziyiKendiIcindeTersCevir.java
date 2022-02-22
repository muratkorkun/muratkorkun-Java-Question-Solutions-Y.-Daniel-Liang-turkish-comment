package Bolum07_DersteYazilanKodlar;

import java.util.Iterator;
import java.util.Scanner;

public class Sorular_7_12_DiziyiKendiIcindeTersCevir {

	public static void main(String[] args) {
		System.out.println("Lütfen ters çevrilmesi için 10 adet sayýdan oluþan birdizi giriniz.");
		Scanner klavye=new Scanner(System.in);
		
		final int DIZIUZUNLUGU=10;
		int[] dizi=new int[DIZIUZUNLUGU];
		for (int i = 0; i <dizi.length; i++) {
			dizi[i]=klavye.nextInt();
		}
		
		diziyiTersYap(dizi);
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]+" ");
		}
		

	}
	public static int[] diziyiTersYap(int[] sayiDizisi) {
		
		for (int i = 0; i < sayiDizisi.length/2; i++) {  // burada dizinin tam yarýsý yada yarýsýndan 1 eksigine kadar  iþlem yapýlmasýný saðladýk.Eðer tam iþlem yapýlmasýna izin verseydik yer deðiþmiþ olanlarý tekrar yer deðiþtireceðinden en baþtaki haline gelmiþ olurduk bu nedenle dizi.lenght()/2 yaptýk.
		int gecici=sayiDizisi[i];                        // dizinin yarýsýna kadar her bir indis için swap (yer deðiþtirme=takas) algoritmasýný kullandýk.
		sayiDizisi[i]=sayiDizisi[sayiDizisi.length-i-1];
		sayiDizisi[sayiDizisi.length-i-1]=gecici;
		}
		return sayiDizisi; 
	}

}
// sayý örneklemi : 03 45 12 43 55 72 89 34 11 82

