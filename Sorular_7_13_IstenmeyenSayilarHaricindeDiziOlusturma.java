package Bolum07_DersteYazilanKodlar;

import javax.print.attribute.IntegerSyntax;

public class Sorular_7_13_IstenmeyenSayilarHaricindeDiziOlusturma {

	public static void main(String[] args) {

		int sayi = rasgeleSayiAl(1, 2, 4, 5, 7, 8, 9); // Bunlar rastgele �retilecek olan say�lardan istenmeyen say�lar olarak kabul edildi.
		System.out.println(sayi);

	}

	public static int rasgeleSayiAl(int... sayilar) {// Recursive (�zyinelemeli) bir metod yazd�k. 
		int rastgeleTamSayi = 1 + (int) (Math.random() * 54);
		for (int sayi : sayilar) {
			if (sayi == rastgeleTamSayi) {  //Metod i�inde koydu�umuz �art sa�lanmayana kadar yeniden say� �retmesini ve yeniden kontrol edilmesini hedefledik.Yani metodun kendisini tekrar tekrar �a��rma gere�i duyduk.
				rastgeleTamSayi = rasgeleSayiAl(sayilar);
			}
		}
		return rastgeleTamSayi; // Yazd���m�z kodun bu k�sm�n�n �al��abilmesi i�in kesinlikle bir �stteki kontrol mekanizmas�ndan kodumuzun  ge�ebilmi� olmas� gereklidir.
	}

}
