package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_22_SekizVezirOyunu {

	public static void main(String[] args) {
		System.out.println("Lütfen vezir sayısını giriniz");

		Scanner klavye = new Scanner(System.in);
		int vezirSayisi = klavye.nextInt();
		klavye.close();
		int konum = (int) (Math.random() * vezirSayisi);  // ilk konumu bulmak ve konum değişkenini ilklendirmek için rastgele bir sayı ürettik.
		boolean[] konumlar=new boolean[vezirSayisi];     //Dikey konumda sayının önceden kullanıldığını tespit edebilmek için  bir boolean dizi oluşturduk.
		
		sekizVezirYazdir(vezirSayisi, konum, konumlar);
	}

	public static void sekizVezirYazdir(int vezirSayisi, int konum, boolean[] konumlar) {
		for (int i = 0; i < vezirSayisi; i++) {   // Burada dış döngüde vezir sayısı kadar satırı ekrana yazdırdık.
			System.out.print("|");					//Satırın başındaki | simgesi 1 defa yazdırıldı.
			konum = rassalSayiBulIstenmeyenlerHaricinde(konum, vezirSayisi,konumlar);     // Burada istenmeyen sayılar haricinde  rassal sayı bulan metodu kullandık.
																				//Birinci parametre olarak istenmeyen sayı ile ilgili değeri aldık.İkinci parametre olarak rastgele üretilecek olan sayının alabileceği değeri aldık.Bu ikinci parametre sütun sayısı olarak 3 den büyük olma şartı ile farklı bir değer alınabilir.
			for (int j = 0; j < vezirSayisi; j++) {
				if (konum != j) {
					System.out.print("|");                 //Burada j değeri konum değerine eşit değilse | simgesini yazdırdık.
				} else {
					System.out.print("Q");			 		// Burada j değeri konum değerine eşit ise Q simgesini yazdırdık.
				}
			}
			System.out.println("|");  // satırın sonundaki | simgesi bir defa yazdırıldı.
		}
	}

	public static int rassalSayiBulIstenmeyenlerHaricinde(int konum, int vezirSayisi,boolean[] konumlar) { // İstenmeyen sayılar haricinde ve maximum sayıya kadar rastgele bir sayı üreten metod yazdık.Bu metodun recursive metod olduğuna dikkat edilmelidir.
		int kucuk = konum - 1;
		int buyuk = konum + 1;
		
		int rassalSayi = (int) (Math.random() * vezirSayisi);
		if (rassalSayi == kucuk || rassalSayi == buyuk || rassalSayi == konum || konumlar[rassalSayi]) {   // Burada istediğimiz rassalSayi'yi elde edene kadar aynı metodu tekrar tekrar çağırdık.Ve rassalSayi değerimiz uygun ise yani  bu if bloğuna girmediyse sayımızı metod sonunda return ettik.
			rassalSayi = rassalSayiBulIstenmeyenlerHaricinde(konum, vezirSayisi,konumlar);
		}
	
		konumlar[rassalSayi]=true;       // Dikey konumda sayının kullanıldığını onayladığımız bu son satırda  sayıyı return etmeden önce sayının konum bilgisi dizisine true değerini atadık.
		return rassalSayi;
	}

} // Vezir sayısı olarak istediğiniz değeri girebilirsiniz.
// İstediğiniz sayıda vezir sayısı girdiğiniz bir program oluşturduk . Yalnız sütun sayısını da vezir sayısına eşitledik istersek bu sayı ayrı bir değişken olarak kullanıcıdan alınabilir. 
//Ve ona göre sütun sayısında bir farklılık olabilir fakat 4 sütundan az olursa program çalışmayacaktır.Çünki oyunun ana kuralı olan algoritma çalışmayacak ve hata verecektir.
//Mesela bu programda 3 veziri rastgele yerleştirmek istersek 3 sütun kullanılacağından program hata verecektir.
// Yalnız bu algoritmada öyle bir ihtimal olurki öz yineleme methodu uygulanırken mesela son satırda hem dikey konum hemde yatay konumda bir sıkışma olabilir. Bu sıkışmada  program hata verecektir. Algoritma program hata verirse baştan başlayacak şekilde tasarlanabilir.
// Fakat benim bilgim şu anda bu düzeyde olduğu için programı geliştirmeyi burada bıraktım.


