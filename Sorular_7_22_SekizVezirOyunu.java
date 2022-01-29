package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_22_SekizVezirOyunu {

	public static void main(String[] args) {
		System.out.println("Lütfen vezir sayýsýný giriniz");

		Scanner klavye = new Scanner(System.in);
		int vezirSayisi = klavye.nextInt();
		klavye.close();
		int konum = (int) (Math.random() * vezirSayisi);  // ilk konumu bulmak ve konum deðiþkenini ilklendirmek için rastgele bir sayý ürettik.

		for (int i = 0; i < vezirSayisi; i++) {   // Burada dýþ döngüde vezir sayýsý kadar satýrý ekrana yazdýrdýk.
			System.out.print("|");					//Satýrýn baþýndaki | simgesi 1 defa yazdýrýldý.
			konum = rassalSayiBulIstenmeyenlerHaricinde(konum, vezirSayisi);     // Burada istenmeyen sayýlar haricinde  rassal sayý bulan metodu kullandýk.
																				//Birinci parametre olarak istenmeyen sayý ile ilgili deðeri aldýk.Ýkinci parametre olarak rastgele üretilecek olan sayýnýn alabileceði deðeri aldýk.Bu ikinci parametre sütun sayýsý olarak 3 den büyük olma þartý ile farklý bir deðer alýnabilir.
			for (int j = 0; j < vezirSayisi; j++) {
				if (konum != j) {
					System.out.print("|");                 //Burada j deðeri konum deðerine eþit deðilse | simgesini yazdýrdýk.
				} else {
					System.out.print("Q");			 		// Burada j deðeri konum deðerine eþit ise Q simgesini yazdýrdýk.
				}
			}
			System.out.println("|");  // satrýn sonundaki | simgesi bir defa yazdýrýldý.
		}
	}

	public static int rassalSayiBulIstenmeyenlerHaricinde(int konum, int max) { // Ýstenmeyen sayýlar haricinde ve maximum sayýya kadar rastgele bir sayý üreten metod yazdýk.Bu metodun recursive metod olduðuna dikkat edilmelidir.
		int kucuk = konum - 1;
		int buyuk = konum + 1;
		int rassalSayi = (int) (Math.random() * max);
		if (rassalSayi == kucuk || rassalSayi == buyuk || rassalSayi == konum) {   // Burada istediðimiz rassalSayi'yi elde edene kadar ayný metodu tekrar tekrar çaðýrdýk.Ve rassalSayi deðerimiz uygun ise yani  bu if bloðuna girmediyse sayýmýzý metod sonunda return ettik.
			rassalSayi = rassalSayiBulIstenmeyenlerHaricinde(konum, max);
		}
		return rassalSayi;
	}

} // Vezir sayýsý olarak istediðiniz deðeri girebilirsiniz.
// Ýstediðiniz sayýda vezir sayýsý girdiðiniz bir program oluþturduk . Yalnýz sütun sayýsýný da vezir sayýsýna eþitledik istersek bu sayý ayrý bir deðiþken olarak kullanýcýdan alýnabilir. 
//Ve ona göre sütun sayýsýnda bir farklýlýk olabilir fakat 4 sütundan az olursa program çalýþmayacaktýr.Çünki oyunun ana kuralý olan algoritma çalýþmayacak ve hata verecektir.
//Mesela bu programda 3 veziri rastgele yerleþtirmek istersek 3 sütun kullanýlacaðýndan program hata verecektir.
