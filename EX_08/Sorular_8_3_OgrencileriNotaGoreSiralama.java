package Bolum08_BenimYazdiklarim;


public class Sorular_8_3_OgrencileriNotaGoreSiralama {
	/*
	 * 
	
										(Öðrencileri nota göre sýralama) Madde 8.2 GradeExam.java’yý öðrencilerin doðru cevap sayýsýna göre artan sýrada gösterecek þekilde yeniden yazýnýz..
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
		
		// Cevaplarýn ve ögrenci sýrasýnýn yeni  bir diziye atanmasý. cevapSayilari dizisinin referansý ögrenci sayýsý kadar dizi (8) sayýsýdýr. Bu 8 dizinin her 
		//  birinin içindeki referans edilen  2 elemanlý dizinin ilk elemaný ögrencinin dogru cevap sayýsýný tutar.Ýkinci elemaný ögrencinin numarasýný tutar. 
		int[][] cevapSayilari=new int[8][2];
		
		for (int i = 0; i < cevaplar.length; i++) {
			int dogruCevapSayisi=0;
			int ogrenciNumarasi=i;
			
			for (int j = 0; j < cevaplar[i].length; j++) {
				if(cevaplar[i][j] == cevapAnahtari[j]) {
					dogruCevapSayisi++;
				}
			
			}
			cevapSayilari[i][0]=dogruCevapSayisi; // Dogrucevap sayýsýný dizinin içindeki  i inci dizinin ilk elemaný olarak atadýk.
			cevapSayilari[i][1]=ogrenciNumarasi;   // Ogrenci numarasýný dizinin içindeki i inci dizinin ikinci elemaný olarak atadýk.
			
			System.out.println(ogrenciNumarasi+". öðrencinin "+ dogruCevapSayisi+" tane doðru cevabý vardýr.");
		}
	
		for (int i = 0; i < cevapSayilari.length; i++) {  // Ogrencinin dogru cevaplarýnýn 1 pauana eþit oldugunu farzettik.
			int enKucukOgrenciPuani=cevapSayilari[i][0];
			int enKucukOgrenciNumarasi=cevapSayilari[i][1];  
			int enKucukOgrenciPuaniIndeksi=i;
			
			for (int j = i+1; j < cevapSayilari.length; j++) {
				
				//enkucuk  ögrenci puaný ve en küçük ogrenci numarasý bulunmasý
				if(enKucukOgrenciPuani > cevapSayilari[j][0]) {
					enKucukOgrenciPuani=cevapSayilari[j][0];
					enKucukOgrenciNumarasi=cevapSayilari[j][1];
					enKucukOgrenciPuaniIndeksi=j;
				}
			}
			// bulunan deðerlerin swap edilmesi.
			if(enKucukOgrenciPuani != cevapSayilari[i][0]) {
				
				cevapSayilari[enKucukOgrenciPuaniIndeksi][0]=cevapSayilari[i][0];
				cevapSayilari[i][0]=enKucukOgrenciPuani;
				
				cevapSayilari[enKucukOgrenciPuaniIndeksi][1]=cevapSayilari[i][1];
				cevapSayilari[i][1]=enKucukOgrenciNumarasi;
				
			}
			
			System.out.println(enKucukOgrenciNumarasi+". ögrenci nin dogru cevap sayýsý "+enKucukOgrenciPuani);
			
		}
	}


}
