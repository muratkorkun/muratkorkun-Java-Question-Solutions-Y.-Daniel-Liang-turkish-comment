package Bolum07_DersteYazilanKodlar;

public class Sorular_7_18_BaloncukSiralamasi {

	public static void baloncukSiralama(int[] dizi) {

		for (int i = 0; i < dizi.length; i++) { // D�� d�ng�y� tam d�nderiyoruz.
			int temp = 0;
			for (int j = 0; j < dizi.length - 1 - i; j++) { // i� d�ng�y� dizinin 1 eksi�i ve i eksi�ine kadar  d�nderiyoruz. ��nki -i yapt���m�zda ayn� sonucu al�yoruz ve bilgisayara yar� y�k bindirmemi� oluyoruz. Debug yaparsan�z farkl� anlayabilirsiniz.
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
