package Bolum08_BenimYazdiklarim;

public class Sorular_8_4_HaftalikCalismaSaatiHesaplama {
	/*
	 * 				

			(Haftal�k �al��ma saati hesaplama) Her bir �al��an�n haftal�k �al��ma saatlerinin iki boyutlu bir dizide tutuldu�unu varsayal�m. 
			�al��an�n yedi g�nl�k �al��ma saatleri bir sat�r�n yedi ayr� s�tununda saklans�n. �rne�in a�a��daki dizi sekiz �al��an�n haftal�k �al��ma saatlerini saklar.
			 �al��an� ve toplam �al��ma saatini azalan �ekilde s�ralanm�� olarak g�steren bir program yaz�n�z.
	 */
	
	
	public static void main(String[] args) {
		
		
		int[][] haftalikCalismaSaatleri = { 
				{2, 4, 3, 4, 5, 8, 8},
				{7, 3, 4, 3, 3, 4, 4},
				{3, 3, 4, 3, 3, 2, 2},
				{9, 3, 4, 7, 3, 4, 1},
				{3, 5, 4, 3, 6, 3, 8},
				{3, 4, 4, 6, 3, 4, 4},
				{3, 7, 4, 8, 3, 8, 4},
				{6, 3, 5, 9, 2, 7, 9},};
		
		int[][] calisanNoVeSaati= calisanNumarasiVeCalismaSaatiAl(haftalikCalismaSaatleri);
		
		sirala(calisanNoVeSaati);
		
		yazdir(calisanNoVeSaati);
		
	}

	public static int[][] calisanNumarasiVeCalismaSaatiAl(int[][] haftalikCalismaSaatleri) {
		int[][] calisanNoVeSaati=new int[8][2];
		for (int i = 0; i < haftalikCalismaSaatleri.length; i++) {
			int calisaninSaatToplami=0;
			int calisanNo=i;
			for (int j = 0; j < haftalikCalismaSaatleri[i].length; j++) {
				calisaninSaatToplami+=haftalikCalismaSaatleri[i][j];
			}
			calisanNoVeSaati[i][0]=calisanNo;										//  8 elemanl� dizinin i inci  dizisinin 0 �nc� adresine �al��an noyu atad�k.				
			calisanNoVeSaati[i][1]=calisaninSaatToplami;							//  8 elemanl� dizinin i inci  dizisinin 1 inci adresine �al��an saatini atad�k. 
		}
		return  calisanNoVeSaati;
	}
	
	public static void sirala(int[][] calisanNoVeSaati) {
		//dizideki her bir �al��an�n saatini di�eriyle k�yaslamak i�in d�� d�ng�de �al��anlar� tek tek sabitledik ve i� d�ng�de k�yasland�. 
		for (int i = 0; i < calisanNoVeSaati.length; i++) {   
			int enFazlaCalisaninSaati=calisanNoVeSaati[i][1];
			int enFazlaCalisaninNosu=calisanNoVeSaati[i][0];
			int enfazlaCalisaninIndeksi=i;
			for (int j = i+1; j < calisanNoVeSaati.length; j++) { // �� d�ng�de k�yaslama yapt�k  ve Enfazla �al��anlar� her buldu�umuzda gereken atamalar yap�ld�.
				
				if(enFazlaCalisaninSaati < calisanNoVeSaati[j][1]) {
					
					enFazlaCalisaninSaati=calisanNoVeSaati[j][1];
					enFazlaCalisaninNosu=calisanNoVeSaati[j][0];
					enfazlaCalisaninIndeksi=j;
				}
			}
			// Burada d�� d�ng�n�n i�inde gereken swaplar yap�ld�.
			
			if(enFazlaCalisaninSaati != calisanNoVeSaati[i][1]) {
				
				calisanNoVeSaati[enfazlaCalisaninIndeksi][1]=calisanNoVeSaati[i][1];  // calisanNoVeSaati nin  referanslar�n�n  g�sterdi�i adreslere gereken atamalar yap�ld�. 
				calisanNoVeSaati[i][1]=enFazlaCalisaninSaati;
				
				calisanNoVeSaati[enfazlaCalisaninIndeksi][0]=calisanNoVeSaati[i][0];
				calisanNoVeSaati[i][0]=enFazlaCalisaninNosu;                         // Enfazla �al��an i��inin numara atamas� yap�ld�.
			}
		}
	}
	
	public static void yazdir(int[][] calisanNoVeSaati) {
		
		for (int i = 0; i < calisanNoVeSaati.length; i++) {
			System.out.println(calisanNoVeSaati[i][0]+" . �al��an�n �al��ma saati "+calisanNoVeSaati[i][1]);
		}
	}

}
