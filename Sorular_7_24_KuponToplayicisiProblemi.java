package Bolum07_DersteYazilanKodlar;

public class Sorular_7_24_KuponToplayicisiProblemi {

	public static void main(String[] args) {

		String[] kartTipleri = { "Kupa", "Ma�a", "Karo", "Sinek" };						//Kart tiplerini ve numaralar�n� birer dizi olu�turup i�inde tuttuk.
		String[] kartNumaralari = { "As", "ikilisi", "��l�s�", "d�rtl�s�", "be�lisi", "alt�l�s�", "yedilisi","sekizlisi", "dokuzlusu", "onlusu", "valesi", "k�z�", "papaz�" };

		int[] iskambilDestesi = iskambilDestesiOlustur(52);
		desteyiKaristir(iskambilDestesi);

		int sayac = 0;
		int[] dortKart = new int[4];
		
		boolean kartTipleriEsitMi=false;  // Enba�ta kart tiplerinin e�it olmad���n� yani istedi�miz sonucun var oldu�unu varsayd�k.

		do {
			kartTipleriEsitMi=false;   // D�ng� i�inde a�a��da kartTipleriEsitMi de�i�kenine istedi�imiz sonu� olmaz ve true de�eri atanm�� olursa bu d�ng� tekrar �al��aca��ndan dolay� de�i�kenimize d�ng� ba��nda tekrar false atamas� yapt�k.			  							
												// False de�eri bozulmaz ve true ye d�nmez ise kartTipleri e�it de�ildir ve istedi�miz sonu� d�ng�ye girmeden kod ak���na devam edecektir.
			dortKart = dortKartCek(iskambilDestesi);					//Bu while d�ng�s�ne her giri�te yeniden 4 kart �ektik.
			
			int[] dortKartinTipleri=new int[4];				
			
			for (int i = 0; i < dortKart.length; i++) {					//�ekilen d�rt kart�n tipini farkl� bir dizide  tuttuk.
				dortKartinTipleri[i]=dortKart[i]/13;
			}
			
			for (int i = 0; i < dortKartinTipleri.length; i++) {          // selectedSort methodundaki gibi i'inci elemanlar� kendinden sonra gelen (j'inci) elemanlarla tiplerini k�yaslad�k.
				for (int j = i+1; j < dortKartinTipleri.length; j++) {
					if(dortKartinTipleri[i] == dortKartinTipleri[j]) {     //Buradaki kartlar�n tiplerinin kendilerinden sonrakilerle tek tek k�yaslanmas� sonucu e�er i'inci eleman�n tipi j'inci eleman�n tipi ile ayn� ise kartTiplerine e�it dedik.
						kartTipleriEsitMi=true;							// Yani bir kere bile bu e�itlik sa�land�ysa d�ng�n�n tekrar �al��mas�n� ve bu e�itlik sa�lanmay�ncaya kadar bu d�ng�n�n devam etmesini sa�lad�k.
					}
				}
			}
			sayac++;
		}while (kartTipleriEsitMi);

		for (int i = 0; i < dortKart.length; i++) {

			System.out.println(kartTipleri[dortKart[i] / 13] + " " + kartNumaralari[dortKart[i] % 13]);
		}
		System.out.println("Toplam kart �ekme say�s� : "+sayac);
	}

	public static int[] iskambilDestesiOlustur(int sayi) {     // deste olu�turma methodu
		int[] iskambilDestesi = new int[sayi];
		for (int i = 0; i < iskambilDestesi.length; i++) {
			iskambilDestesi[i] = (int) (Math.random() * sayi);
		}
		return iskambilDestesi;
	}

	public static int[] dortKartCek(int[] dizi) { // desteden kart �ekme methodu
		int rassalSayi = 0;
		int rastgeleCekilenKart = 0;
		int[] dortKart = new int[4];
		for (int i = 0; i < 4; i++) {
			rassalSayi = rassalSayiOlustur(dizi.length);
			rastgeleCekilenKart = dizi[rassalSayi];
			dortKart[i] = rastgeleCekilenKart;

			int gecici = dizi[rassalSayi];								//Bu k�s�mda desteden �ekilen her kart� en sona geri koyuyoruz ve �ektigimiz indise dogru sa�dan sola b�t�n de�erleri kayd�r�yoruz.
			for (int j = 0; j < dizi.length - rassalSayi-1; j++) {
				dizi[rassalSayi + j] = dizi[rassalSayi + (j + 1)];
			}
			dizi[dizi.length-1] = gecici;
		}

		return dortKart;
	}

	public static int rassalSayiOlustur(int max) { // Bu method di�er methodlara yard�mc� olmas� i�in yaz�lm��t�r.
		int rassalSayi = (int) (Math.random() * max);
		return rassalSayi;
	}

	public static void desteyiKaristir(int dizi[]) { // desteyi kart��t�rma methodu
		for (int i = 0; i < dizi.length; i++) {
			int rassalSayi = rassalSayiOlustur(dizi.length);
			int temp = dizi[rassalSayi];
			dizi[rassalSayi] = dizi[i];
			dizi[i] = temp;

		}

	}

}
