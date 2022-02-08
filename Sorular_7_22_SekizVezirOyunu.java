package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_22_SekizVezirOyunu {

	public static void main(String[] args) {
		System.out.println("L�tfen vezir say�s�n� giriniz");

		Scanner klavye = new Scanner(System.in);
		int vezirSayisi = klavye.nextInt();
		klavye.close();
		int konum = (int) (Math.random() * vezirSayisi);  // ilk konumu bulmak ve konum de�i�kenini ilklendirmek i�in rastgele bir say� �rettik.
		boolean[] konumlar=new boolean[vezirSayisi];     //Dikey konumda say�n�n �nceden kullan�ld���n� tespit edebilmek i�in  bir boolean dizi olu�turduk.
		
		sekizVezirYazdir(vezirSayisi, konum, konumlar);
	}

	public static void sekizVezirYazdir(int vezirSayisi, int konum, boolean[] konumlar) {
		for (int i = 0; i < vezirSayisi; i++) {   // Burada d�� d�ng�de vezir say�s� kadar sat�r� ekrana yazd�rd�k.
			System.out.print("|");					//Sat�r�n ba��ndaki | simgesi 1 defa yazd�r�ld�.
			konum = rassalSayiBulIstenmeyenlerHaricinde(konum, vezirSayisi,konumlar);     // Burada istenmeyen say�lar haricinde  rassal say� bulan metodu kulland�k.
																				//Birinci parametre olarak istenmeyen say� ile ilgili de�eri ald�k.�kinci parametre olarak rastgele �retilecek olan say�n�n alabilece�i de�eri ald�k.Bu ikinci parametre s�tun say�s� olarak 3 den b�y�k olma �art� ile farkl� bir de�er al�nabilir.
			for (int j = 0; j < vezirSayisi; j++) {
				if (konum != j) {
					System.out.print("|");                 //Burada j de�eri konum de�erine e�it de�ilse | simgesini yazd�rd�k.
				} else {
					System.out.print("Q");			 		// Burada j de�eri konum de�erine e�it ise Q simgesini yazd�rd�k.
				}
			}
			System.out.println("|");  // satr�n sonundaki | simgesi bir defa yazd�r�ld�.
		}
	}

	public static int rassalSayiBulIstenmeyenlerHaricinde(int konum, int vezirSayisi,boolean[] konumlar) { // �stenmeyen say�lar haricinde ve maximum say�ya kadar rastgele bir say� �reten metod yazd�k.Bu metodun recursive metod oldu�una dikkat edilmelidir.
		int kucuk = konum - 1;
		int buyuk = konum + 1;
		
		int rassalSayi = (int) (Math.random() * vezirSayisi);
		if (rassalSayi == kucuk || rassalSayi == buyuk || rassalSayi == konum || konumlar[rassalSayi]) {   // Burada istedi�imiz rassalSayi'yi elde edene kadar ayn� metodu tekrar tekrar �a��rd�k.Ve rassalSayi de�erimiz uygun ise yani  bu if blo�una girmediyse say�m�z� metod sonunda return ettik.
			rassalSayi = rassalSayiBulIstenmeyenlerHaricinde(konum, vezirSayisi,konumlar);
		}
	
		konumlar[rassalSayi]=true;       // Dikey konumda say�n�n kullan�ld���n� onaylad���m�z bu son sat�rda  say�y� return etmeden �nce say�n�n konum bilgisi dizisine true de�erini atad�k.
		return rassalSayi;
	}

} // Vezir say�s� olarak istedi�iniz de�eri girebilirsiniz.
// �stedi�iniz say�da vezir say�s� girdi�iniz bir program olu�turduk . Yaln�z s�tun say�s�n� da vezir say�s�na e�itledik istersek bu say� ayr� bir de�i�ken olarak kullan�c�dan al�nabilir. 
//Ve ona g�re s�tun say�s�nda bir farkl�l�k olabilir fakat 4 s�tundan az olursa program �al��mayacakt�r.��nki oyunun ana kural� olan algoritma �al��mayacak ve hata verecektir.
//Mesela bu programda 3 veziri rastgele yerle�tirmek istersek 3 s�tun kullan�laca��ndan program hata verecektir.
// Yaln�z bu algoritmada �yle bir ihtimal olurki �z yineleme methodu uygulan�rken mesela son sat�rda hem dikey konum hemde yatay konumda bir s�k��ma olabilir. Bu s�k��mada  program hata verecektir. Algoritma program hata verirse ba�tan ba�layacak �ekilde tasarlanabilir.
// Fakat benim bilgim �u anda bu d�zeyde oldu�u i�in program� geli�tirmeyi burada b�rakt�m.