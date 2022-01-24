package Bolum07_DersteYazilanKodlar;

public class Sorular_7_18_BaloncukSiralamasi {

	public static void baloncukSiralama(int[] dizi) {

		for (int i = 0; i < dizi.length; i++) { // Dýþ döngüyü tam dönderiyoruz.
			int temp = 0;
			for (int j = 0; j < dizi.length - 1 - i; j++) { // iç döngüyü dizinin 1 eksiði ve i eksiðine kadar  dönderiyoruz. Çünki -i yaptýðýmýzda ayný sonucu alýyoruz ve bilgisayara yarý yük bindirmemiþ oluyoruz. Debug yaparsanýz farklý anlayabilirsiniz.
				if (dizi[j] > dizi[j + 1]) {
					temp = dizi[j];
					dizi[j] = dizi[j + 1];
					dizi[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] dizi = { 10, 1, 9, 6, 8, 5, 7, 9, 11, 21 };
		baloncukSiralama(dizi);

		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
		}

	}
}
