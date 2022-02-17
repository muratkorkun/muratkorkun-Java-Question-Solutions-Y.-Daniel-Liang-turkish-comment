package Bolum08_BenimYazdiklarim;

public class Sorular_8_4_HaftalikCalismaSaatiHesaplama {
	/*
	 * 				

			(Haftalýk çalýþma saati hesaplama) Her bir çalýþanýn haftalýk çalýþma saatlerinin iki boyutlu bir dizide tutulduðunu varsayalým. 
			Çalýþanýn yedi günlük çalýþma saatleri bir satýrýn yedi ayrý sütununda saklansýn. Örneðin aþaðýdaki dizi sekiz çalýþanýn haftalýk çalýþma saatlerini saklar.
			 Çalýþaný ve toplam çalýþma saatini azalan þekilde sýralanmýþ olarak gösteren bir program yazýnýz.
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
			calisanNoVeSaati[i][0]=calisanNo;										//  8 elemanlý dizinin i inci  dizisinin 0 ýncý adresine çalýþan noyu atadýk.				
			calisanNoVeSaati[i][1]=calisaninSaatToplami;							//  8 elemanlý dizinin i inci  dizisinin 1 inci adresine çalýþan saatini atadýk. 
		}
		return  calisanNoVeSaati;
	}
	
	public static void sirala(int[][] calisanNoVeSaati) {
		//dizideki her bir çalýþanýn saatini diðeriyle kýyaslamak için dýþ döngüde çalýþanlarý tek tek sabitledik ve iç döngüde kýyaslandý. 
		for (int i = 0; i < calisanNoVeSaati.length; i++) {   
			int enFazlaCalisaninSaati=calisanNoVeSaati[i][1];
			int enFazlaCalisaninNosu=calisanNoVeSaati[i][0];
			int enfazlaCalisaninIndeksi=i;
			for (int j = i+1; j < calisanNoVeSaati.length; j++) { // Ýç döngüde kýyaslama yaptýk  ve Enfazla çalýþanlarý her bulduðumuzda gereken atamalar yapýldý.
				
				if(enFazlaCalisaninSaati < calisanNoVeSaati[j][1]) {
					
					enFazlaCalisaninSaati=calisanNoVeSaati[j][1];
					enFazlaCalisaninNosu=calisanNoVeSaati[j][0];
					enfazlaCalisaninIndeksi=j;
				}
			}
			// Burada dýþ döngünün içinde gereken swaplar yapýldý.
			
			if(enFazlaCalisaninSaati != calisanNoVeSaati[i][1]) {
				
				calisanNoVeSaati[enfazlaCalisaninIndeksi][1]=calisanNoVeSaati[i][1];  // calisanNoVeSaati nin  referanslarýnýn  gösterdiði adreslere gereken atamalar yapýldý. 
				calisanNoVeSaati[i][1]=enFazlaCalisaninSaati;
				
				calisanNoVeSaati[enfazlaCalisaninIndeksi][0]=calisanNoVeSaati[i][0];
				calisanNoVeSaati[i][0]=enFazlaCalisaninNosu;                         // Enfazla çalýþan iþçinin numara atamasý yapýldý.
			}
		}
	}
	
	public static void yazdir(int[][] calisanNoVeSaati) {
		
		for (int i = 0; i < calisanNoVeSaati.length; i++) {
			System.out.println(calisanNoVeSaati[i][0]+" . çalýþanýn çalýþma saati "+calisanNoVeSaati[i][1]);
		}
	}

}
