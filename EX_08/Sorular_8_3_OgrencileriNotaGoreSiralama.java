package Bolum08_BenimYazdiklarim;


public class Sorular_8_3_OgrencileriNotaGoreSiralama {
	/*
	 * 
	
										(��rencileri nota g�re s�ralama) Madde 8.2 GradeExam.java�y� ��rencilerin do�ru cevap say�s�na g�re artan s�rada g�sterecek �ekilde yeniden yaz�n�z..
	 */
	
	public static void main(String[] args) {
	
		char[][] cevaplar = { 
				{ 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
				{ 'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D' },
				{ 'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D' },
				{ 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
				{ 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' } };
		

		char[] cevapAnahtari = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };
		
		// Cevaplar�n ve �grenci s�ras�n�n yeni  bir diziye atanmas�. cevapSayilari dizisinin referans� �grenci say�s� kadar dizi (8) say�s�d�r. Bu 8 dizinin her 
		//  birinin i�indeki referans edilen  2 elemanl� dizinin ilk eleman� �grencinin dogru cevap say�s�n� tutar.�kinci eleman� �grencinin numaras�n� tutar. 
		int[][] cevapSayilari=new int[8][2];
		
		for (int i = 0; i < cevaplar.length; i++) {
			int dogruCevapSayisi=0;
			int ogrenciNumarasi=i;
			
			for (int j = 0; j < cevaplar[i].length; j++) {
				if(cevaplar[i][j] == cevapAnahtari[j]) {
					dogruCevapSayisi++;
				}
			
			}
			cevapSayilari[i][0]=dogruCevapSayisi; // Dogrucevap say�s�n� dizinin i�indeki  i inci dizinin ilk eleman� olarak atad�k.
			cevapSayilari[i][1]=ogrenciNumarasi;   // Ogrenci numaras�n� dizinin i�indeki i inci dizinin ikinci eleman� olarak atad�k.
			
			System.out.println(ogrenciNumarasi+". ��rencinin "+ dogruCevapSayisi+" tane do�ru cevab� vard�r.");
		}
	
		for (int i = 0; i < cevapSayilari.length; i++) {  // Ogrencinin dogru cevaplar�n�n 1 pauana e�it oldugunu farzettik.
			int enKucukOgrenciPuani=cevapSayilari[i][0];
			int enKucukOgrenciNumarasi=cevapSayilari[i][1];  
			int enKucukOgrenciPuaniIndeksi=i;
			
			for (int j = i+1; j < cevapSayilari.length; j++) {
				
				//enkucuk  �grenci puan� ve en k���k ogrenci numaras� bulunmas�
				if(enKucukOgrenciPuani > cevapSayilari[j][0]) {
					enKucukOgrenciPuani=cevapSayilari[j][0];
					enKucukOgrenciNumarasi=cevapSayilari[j][1];
					enKucukOgrenciPuaniIndeksi=j;
				}
			}
			// bulunan de�erlerin swap edilmesi.
			if(enKucukOgrenciPuani != cevapSayilari[i][0]) {
				
				cevapSayilari[enKucukOgrenciPuaniIndeksi][0]=cevapSayilari[i][0];
				cevapSayilari[i][0]=enKucukOgrenciPuani;
				
				cevapSayilari[enKucukOgrenciPuaniIndeksi][1]=cevapSayilari[i][1];
				cevapSayilari[i][1]=enKucukOgrenciNumarasi;
				
			}
			
			System.out.println(enKucukOgrenciNumarasi+". �grenci nin dogru cevap say�s� "+enKucukOgrenciPuani);
			
		}
	}


}
