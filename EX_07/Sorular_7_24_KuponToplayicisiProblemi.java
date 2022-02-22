package Bolum07_DersteYazilanKodlar;

public class Sorular_7_24_KuponToplayicisiProblemi {

	public static void main(String[] args) {

		String[] kartTipleri = { "Kupa", "Maça", "Karo", "Sinek" };						//Kart tiplerini ve numaralarýný birer dizi oluþturup içinde tuttuk.
		String[] kartNumaralari = { "As", "ikilisi", "üçlüsü", "dörtlüsü", "beþlisi", "altýlýsý", "yedilisi","sekizlisi", "dokuzlusu", "onlusu", "valesi", "kýzý", "papazý" };

		int[] iskambilDestesi = iskambilDestesiOlustur(52);
		desteyiKaristir(iskambilDestesi);

		int sayac = 0;
		int[] dortKart = new int[4];
		
		boolean kartTipleriEsitMi=false;  // Enbaþta kart tiplerinin eþit olmadýðýný yani istediðmiz sonucun var olduðunu varsaydýk.

		do {
			kartTipleriEsitMi=false;   // Döngü içinde aþaðýda kartTipleriEsitMi deðiþkenine istediðimiz sonuç olmaz ve true deðeri atanmýþ olursa bu döngü tekrar çalýþacaðýndan dolayý deðiþkenimize döngü baþýnda tekrar false atamasý yaptýk.			  							
												// False deðeri bozulmaz ve true ye dönmez ise kartTipleri eþit deðildir ve istediðmiz sonuç döngüye girmeden kod akýþýna devam edecektir.
			dortKart = dortKartCek(iskambilDestesi);					//Bu while döngüsüne her giriþte yeniden 4 kart çektik.
			
			int[] dortKartinTipleri=new int[4];				
			
			for (int i = 0; i < dortKart.length; i++) {					//Çekilen dört kartýn tipini farklý bir dizide  tuttuk.
				dortKartinTipleri[i]=dortKart[i]/13;
			}
			
			for (int i = 0; i < dortKartinTipleri.length; i++) {          // selectedSort methodundaki gibi i'inci elemanlarý kendinden sonra gelen (j'inci) elemanlarla tiplerini kýyasladýk.
				for (int j = i+1; j < dortKartinTipleri.length; j++) {
					if(dortKartinTipleri[i] == dortKartinTipleri[j]) {     //Buradaki kartlarýn tiplerinin kendilerinden sonrakilerle tek tek kýyaslanmasý sonucu eðer i'inci elemanýn tipi j'inci elemanýn tipi ile ayný ise kartTiplerine eþit dedik.
						kartTipleriEsitMi=true;							// Yani bir kere bile bu eþitlik saðlandýysa döngünün tekrar çalýþmasýný ve bu eþitlik saðlanmayýncaya kadar bu döngünün devam etmesini saðladýk.
					}
				}
			}
			sayac++;
		}while (kartTipleriEsitMi);

		for (int i = 0; i < dortKart.length; i++) {

			System.out.println(kartTipleri[dortKart[i] / 13] + " " + kartNumaralari[dortKart[i] % 13]);
		}
		System.out.println("Toplam kart çekme sayýsý : "+sayac);
	}

	public static int[] iskambilDestesiOlustur(int sayi) {     // deste oluþturma methodu
		int[] iskambilDestesi = new int[sayi];
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = (int) (Math.random() * sayi);
		}
		return iskambilDestesi;
	}

	public static int[] dortKartCek(int[] dizi) { // desteden kart çekme methodu
		int rassalSayi = 0;
		int rastgeleCekilenKart = 0;
		int[] dortKart = new int[4];
		for (int i = 0; i < 4; i++) {
			rassalSayi = rassalSayiOlustur(dizi.length);
			rastgeleCekilenKart = dizi[rassalSayi];
			dortKart[i] = rastgeleCekilenKart;

			int gecici = dizi[rassalSayi];								//Bu kýsýmda desteden çekilen her kartý en sona geri koyuyoruz ve çektigimiz indise dogru saðdan sola bütün deðerleri kaydýrýyoruz.
			for (int j = 0; j < dizi.length - rassalSayi-1; j++) {
				dizi[rassalSayi + j] = dizi[rassalSayi + (j + 1)];
			}
			dizi[dizi.length-1] = gecici;
		}

		return dortKart;
	}

	public static int rassalSayiOlustur(int max) { // Bu method diðer methodlara yardýmcý olmasý için yazýlmýþtýr.
		int rassalSayi = (int) (Math.random() * max);
		return rassalSayi;
	}

	public static void desteyiKaristir(int dizi[]) { // desteyi kartýþtýrma methodu
		for (int i = 0; i < dizi.length; i++) {
			int rassalSayi = rassalSayiOlustur(dizi.length);
			int temp = dizi[rassalSayi];
			dizi[rassalSayi] = dizi[i];
			dizi[i] = temp;

		}

	}

}
