package Bolum07_DersteYazilanKodlar;

public class Sorular_7_16_CalismaSuresiHesaplama {

	public static int[] diziOlustur(int sayiEnBuyuk, int diziElemanSayisi) {
		int[] dizi = new int[diziElemanSayisi];
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = 1 + (int) (Math.random() * sayiEnBuyuk);
		}
		return dizi;
	}

	public static int rastgeleSayiOlustur(int sayiEnBuyuk) {
		int rastgeleSayi = 1 + (int) (Math.random() * sayiEnBuyuk);
		return rastgeleSayi;
	}

	public static int dogrusalArama(int[] dizi, int anahtar) {
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == anahtar) {
				return i;
			}
		}
		return -1;
	}

	public static int[] secimliSiralama(int[] dizi) { // kitaptan alýnmýþtýr.
		for (int i = 0; i < dizi.length; i++) {
			int enKucuk = dizi[i];
			int enKucukIndis = i;
			for (int j = i + 1; j < dizi.length; j++) {
				if (enKucuk > dizi[j]) {
					enKucuk = dizi[j];
					enKucukIndis = j;
				}
			}
			if (enKucukIndis != i) {
				dizi[enKucukIndis] = dizi[i];
				dizi[i] = enKucuk;
			}
		}
		return dizi;
	}

	public static int ikiliArama(int[] dizi, int anahtar) { // kitaptan alýnmýþtýr.
		int yuksekIndis = dizi.length - 1;
		int dusukIndis = 0;

		while (yuksekIndis > dusukIndis) {
			int ortaIndis = (yuksekIndis + dusukIndis) / 2;
			if (dizi[ortaIndis] < anahtar) {
				dusukIndis = ortaIndis + 1;

			} else if (dizi[ortaIndis] > anahtar) {
				yuksekIndis = ortaIndis - 1;
			} else
				return ortaIndis;
		}
		return -1;
	}

	public static void main(String[] args) {
		long baslangýcZamani = 0;
		long bitisZamani = 0;
		long calismaSuresi = bitisZamani - baslangýcZamani;
		baslangýcZamani = System.currentTimeMillis();
		int[] dizi = diziOlustur(50_000, 100_000);

		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslangýcZamani;

		System.out.println("Dizi oluþturma süreci :" + calismaSuresi + " milisaniye sürmüþtür.");

		baslangýcZamani = System.currentTimeMillis();
		int anahtar = rastgeleSayiOlustur(60_000);
		int sonuc = dogrusalArama(dizi, anahtar);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslangýcZamani;
		String res = sonuc != -1 ? "mevcuttur." : "mevcut deðildir.";

		System.out.println("Doðrusal arama metodunun çalýþma süresi : " + calismaSuresi
				+ " milisaniyedir. Anahtar sayý : " + anahtar + " dizi içerisinde " + res);

		baslangýcZamani = System.currentTimeMillis();
		anahtar = rastgeleSayiOlustur(60_000);
		sonuc = ikiliArama(dizi, anahtar);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslangýcZamani;
		res = (sonuc == -1) ? "mevcut deðildir. " : "mevcuttur.";

		System.out.println("Ýkili aramanýn sonucunda çalýþma süresi : " + calismaSuresi
				+ " milisaniyedir. Anahtar sayý : " + anahtar + " dizi içerisinde " + res);

		baslangýcZamani = System.currentTimeMillis(); // Soruda bu kýsým yoktu seçimli sýralamayý bonus olarak ilave
														// ettim.
		secimliSiralama(dizi);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslangýcZamani;

		System.out.println("Seçimli sýralama metodunun çalýþma süresi : " + calismaSuresi + " milisaniyedir.");

	}

}
