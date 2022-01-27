package Bolum07_DersteYazilanKodlar;

public class Sorular_7_20_SecimliSiralamaTersten {

	public static double[] tersSecimliSiralama(double[] dizi) {         // Bu method ile say�lar� b�y�kten k����e s�ralad�k.
		for (int i = 0; i < dizi.length - 1; i++) {                 // Bu d�ng� ile dizi i�indeki elemanlar� sondan birinci ye kadar tek tek elde tuttuk.
			double enBuyuk = dizi[i];
			int enBuyukIndis = i;

			for (int j = i + 1; j < dizi.length; j++) { // Bu i� d�ng�de d�� d�ng�de  sabitledi�imiz eleman� i'inci eleman� her ba�lang��ya  enBuyuk olarak kabul ediyoruz. 
				if (enBuyuk < dizi[j]) {         // e�er enBuyuk  dizinin j'inci eleman�ndan k���kse diye k�yaslama yap�yoruz. Bu k�yaslama i� d�ng� sonuna kadar gidecek ve ger�ekten en b�y�k de�er hangisi ise onu bulacakt�r.
					enBuyuk = dizi[j];		// k�yaslama sonucunda de�er true olur ve if blo�u �al���rsa gerekli atamalar bu blok i�inde yap�l�r.
					enBuyukIndis = j;
				}
			}
			if (enBuyukIndis != i) {   // E�er en ba�ta tan�mlad���m�z enBuyukIndis de�erinde bir de�i�im oldu ise dizi elemanlar�n� birbiri ile yer de�i�tiriyoruz. 
				dizi[enBuyukIndis] = dizi[i];
				dizi[i] = enBuyuk;
			}
		}
		return dizi;
	}

	public static void main(String[] args) {
		double[] list = { 3.4, 5.7, 1, 2.5, 8.6, 4.4 ,5.2 ,6.9 ,7.5 ,4.4 };

		tersSecimliSiralama(list);
		
		for(double d: list) {   
			System.out.print(d+"   ");
		}

	}
}
