package Bolum07_DersteYazilanKodlar;

import java.util.Iterator;
import java.util.Scanner;

public class Sorular_7_12_DiziyiKendiIcindeTersCevir {

	public static void main(String[] args) {
		System.out.println("L�tfen ters �evrilmesi i�in 10 adet say�dan olu�an birdizi giriniz.");
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
		
		for (int i = 0; i < sayiDizisi.length/2; i++) {  // burada dizinin tam yar�s� yada yar�s�ndan 1 eksigine kadar  i�lem yap�lmas�n� sa�lad�k.E�er tam i�lem yap�lmas�na izin verseydik yer de�i�mi� olanlar� tekrar yer de�i�tirece�inden en ba�taki haline gelmi� olurduk bu nedenle dizi.lenght()/2 yapt�k.
		int gecici=sayiDizisi[i];                        // dizinin yar�s�na kadar her bir indis i�in swap (yer de�i�tirme=takas) algoritmas�n� kulland�k.
		sayiDizisi[i]=sayiDizisi[sayiDizisi.length-i-1];
		sayiDizisi[sayiDizisi.length-i-1]=gecici;
		}
		return sayiDizisi; 
	}

}
// say� �rneklemi : 03 45 12 43 55 72 89 34 11 82

