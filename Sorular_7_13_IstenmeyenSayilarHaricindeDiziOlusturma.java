package Bolum07_DersteYazilanKodlar;

import javax.print.attribute.IntegerSyntax;

public class Sorular_7_13_IstenmeyenSayilarHaricindeDiziOlusturma {

	public static void main(String[] args) {

		int sayi = rasgeleSayiAl(1, 2, 4, 5, 7, 8, 9); // Bunlar rastgele üretilecek olan sayýlardan istenmeyen sayýlar olarak kabul edildi.
		System.out.println(sayi);

	}

	public static int rasgeleSayiAl(int... sayilar) {// Recursive (özyinelemeli) bir metod yazdýk. 
		int rastgeleTamSayi = 1 + (int) (Math.random() * 54);
		for (int sayi : sayilar) {
			if (sayi == rastgeleTamSayi) {  //Metod içinde koyduðumuz þart saðlanmayana kadar yeniden sayý üretmesini ve yeniden kontrol edilmesini hedefledik.Yani metodun kendisini tekrar tekrar çaðýrma gereði duyduk.
				rastgeleTamSayi = rasgeleSayiAl(sayilar);
			}
		}
		return rastgeleTamSayi; // Yazdýðýmýz kodun bu kýsmýnýn çalýþabilmesi için kesinlikle bir üstteki kontrol mekanizmasýndan kodumuzun  geçebilmiþ olmasý gereklidir.
	}

}
