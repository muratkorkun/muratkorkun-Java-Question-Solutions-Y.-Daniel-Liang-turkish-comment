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

	public static int[] secimliSiralama(int[] dizi) { // kitaptan al�nm��t�r.
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

	public static int ikiliArama(int[] dizi, int anahtar) { // kitaptan al�nm��t�r.
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
		long baslang�cZamani = 0;
		long bitisZamani = 0;
		long calismaSuresi = bitisZamani - baslang�cZamani;
		baslang�cZamani = System.currentTimeMillis();
		int[] dizi = diziOlustur(50_000, 100_000);

		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslang�cZamani;

		System.out.println("Dizi olu�turma s�reci :" + calismaSuresi + " milisaniye s�rm��t�r.");

		baslang�cZamani = System.currentTimeMillis();
		int anahtar = rastgeleSayiOlustur(60_000);
		int sonuc = dogrusalArama(dizi, anahtar);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslang�cZamani;
		String res = sonuc != -1 ? "mevcuttur." : "mevcut de�ildir.";

		System.out.println("Do�rusal arama metodunun �al��ma s�resi : " + calismaSuresi
				+ " milisaniyedir. Anahtar say� : " + anahtar + " dizi i�erisinde " + res);

		baslang�cZamani = System.currentTimeMillis();
		anahtar = rastgeleSayiOlustur(60_000);
		sonuc = ikiliArama(dizi, anahtar);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslang�cZamani;
		res = (sonuc == -1) ? "mevcut de�ildir. " : "mevcuttur.";

		System.out.println("�kili araman�n sonucunda �al��ma s�resi : " + calismaSuresi
				+ " milisaniyedir. Anahtar say� : " + anahtar + " dizi i�erisinde " + res);

		baslang�cZamani = System.currentTimeMillis(); // Soruda bu k�s�m yoktu se�imli s�ralamay� bonus olarak ilave
														// ettim.
		secimliSiralama(dizi);
		bitisZamani = System.currentTimeMillis();
		calismaSuresi = bitisZamani - baslang�cZamani;

		System.out.println("Se�imli s�ralama metodunun �al��ma s�resi : " + calismaSuresi + " milisaniyedir.");

	}

}
