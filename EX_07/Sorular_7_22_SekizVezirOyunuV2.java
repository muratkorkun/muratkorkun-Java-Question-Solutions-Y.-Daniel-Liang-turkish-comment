package Bolum07_DersteYazilanKodlar;

import java.util.Arrays;

public class Sorular_7_22_SekizVezirOyunuV2 {

	public static void main(String[] args) {  // Program vezir konumland�rmalar�n� e�er konumland�rma,   yerle�tirme kurallar�m�za uymuyorsa kurallara uyana kadar defalarca kez yeniden olu�turacak �ekilde yaz�lm��t�r.

		long baslangicZamani = System.currentTimeMillis();
		
		int[] vezirKonumlar = vezirlerDogruDizilir();
		
		Arrays.sort(vezirKonumlar);
		
		for (int i : vezirKonumlar) {
			System.out.print(i+",");
		}
		System.out.println();
		yazdir(vezirKonumlar);

		long bitisZamani = System.currentTimeMillis();
		long calismaSuresi = bitisZamani - baslangicZamani;

		System.out.println((double) calismaSuresi / 1000 + " saniye sonunda program sonu�lanm��t�r");

	}
	public static int[] vezirlerDogruDizilir() { // Vezirler do�ru dizilene kadar vezirlerin konumunu tekrar tekrar yenileyen method

		int[] vezirKonumlar = vezirKonumlariBul();

		while (ayniSatirdaMi(vezirKonumlar) || ayniSutundaMi(vezirKonumlar) || ayniCaprazdaMi(vezirKonumlar)) {
			vezirKonumlar = vezirKonumlariBul();

		}
		return vezirKonumlar;
	}


	public static int[] vezirKonumlariBul() {   // 1 den 64 e kadar olan say�lar�n bir matris olu�turdugunu varsayd�k ve 8 tane herbiri di�erinden farkl� olmak �zere say�y� rastgele olu�turduk.
		int[] vezirKonumlar = new int[8];

		int rassalSayi = (int) (Math.random() * 64);

		for (int i = 0; i < vezirKonumlar.length; i++) {
			vezirKonumlar[i] = rassalSayi;

			rassalSayi = (int) (Math.random() * 64);

			while (vezirKonumlar[i] == rassalSayi) {
				rassalSayi = (int) (Math.random() * 64);
			}
		}

		return vezirKonumlar;
	}

	public static int sutunNumarasiniAl(int i) {  // vezirlerin sutun numaras�n� almak i�in bu method.

		return i % 8;
	}

	public static int satirNumarasiniAl(int i) {	// vezirlerin sat�r numaras�n� almak i�in bu metod.

		return i / 8;
	}

	public static boolean ayniSatirdaMi(int[] vezirKonumlar) {   // vezirlerin ayn� sat�rda olup olmad���n� kontrol eden method.

		for (int i = 0; i < vezirKonumlar.length - 1; i++) {
			int birincininSatirNumarasi = satirNumarasiniAl(vezirKonumlar[i]);

			for (int j = i + 1; j < vezirKonumlar.length; j++) {
				int ikincininSatirNumarasini = satirNumarasiniAl(vezirKonumlar[j]);
				if (birincininSatirNumarasi == ikincininSatirNumarasini) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean ayniSutundaMi(int[] vezirKonumlar) {  // vezirlerin ayn� s�tunda olup olmad���n� kontrol eden method.
		for (int i = 0; i < vezirKonumlar.length - 1; i++) {
			int birincininSutunNumarasi = sutunNumarasiniAl(vezirKonumlar[i]);

			for (int j = i + 1; j < vezirKonumlar.length; j++) {
				int ikincininsutunNumarasini = sutunNumarasiniAl(vezirKonumlar[j]);
				if (birincininSutunNumarasi == ikincininsutunNumarasini) {
					return true;
				}
			}
		}

		return false;
	}

	public static boolean ayniCaprazdaMi(int[] vezirKonumlar) {  //vezirlerin  sol �apraz ve sa� �apraz olmak �zere iki �aprazda da olup olmad���n� kontrol eden method..

		for (int i = 0; i < vezirKonumlar.length - 1; i++) {
			int birincininSatirNumarasi = satirNumarasiniAl(vezirKonumlar[i]);
			int birincininSutunNumarasi = sutunNumarasiniAl(vezirKonumlar[i]);

			for (int j = i + 1; j < vezirKonumlar.length; j++) {
				int ikincininSatirNumarasi = satirNumarasiniAl(vezirKonumlar[j]);
				int ikincininSutunNumarasi = sutunNumarasiniAl(vezirKonumlar[j]);

				if (birincininSatirNumarasi - birincininSutunNumarasi == ikincininSatirNumarasi - ikincininSutunNumarasi  
						|| birincininSatirNumarasi + birincininSutunNumarasi == ikincininSatirNumarasi
								+ ikincininSutunNumarasi) {
					return true;
				}
			}
		}

		return false;
	}


	public static void yazdir(int[] vezirKonumlar) {  // Vezir konumlar�na g�re bo�luk veya  Vezir karakteri yazan method.

		for (int i = 0; i < vezirKonumlar.length; i++) {

			System.out.print("|");
			for (int j = 0; j < vezirKonumlar.length; j++) {

				if (vezirKonumlar[i] % 8 == j) {
					System.out.print("Q|");
				} else {
					System.out.print(" |");
				}
			}
			System.out.println();
		}
	}

}
