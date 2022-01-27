package Bolum07_DersteYazilanKodlar;

public class Sorular_7_20_SecimliSiralamaTersten {

	public static double[] tersSecimliSiralama(double[] dizi) {         // Bu method ile sayýlarý büyükten küçüðe sýraladýk.
		for (int i = 0; i < dizi.length - 1; i++) {                 // Bu döngü ile dizi içindeki elemanlarý sondan birinci ye kadar tek tek elde tuttuk.
			double enBuyuk = dizi[i];
			int enBuyukIndis = i;

			for (int j = i + 1; j < dizi.length; j++) { // Bu iç döngüde dýþ döngüde  sabitlediðimiz elemaný i'inci elemaný her baþlangýçya  enBuyuk olarak kabul ediyoruz. 
				if (enBuyuk < dizi[j]) {         // eðer enBuyuk  dizinin j'inci elemanýndan küçükse diye kýyaslama yapýyoruz. Bu kýyaslama iç döngü sonuna kadar gidecek ve gerçekten en büyük deðer hangisi ise onu bulacaktýr.
					enBuyuk = dizi[j];		// kýyaslama sonucunda deðer true olur ve if bloðu çalýþýrsa gerekli atamalar bu blok içinde yapýlýr.
					enBuyukIndis = j;
				}
			}
			if (enBuyukIndis != i) {   // Eðer en baþta tanýmladýðýmýz enBuyukIndis deðerinde bir deðiþim oldu ise dizi elemanlarýný birbiri ile yer deðiþtiriyoruz. 
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
