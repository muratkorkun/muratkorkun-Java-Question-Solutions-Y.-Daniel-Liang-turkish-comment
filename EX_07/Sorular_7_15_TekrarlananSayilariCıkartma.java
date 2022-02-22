package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_15_TekrarlananSayilariCýkartma {
	
	public static int dizidekiFarkliSayiSayisi(int[] sayiDizisi) {  //Dizideki farklý sayýlarýn sayýsýný bulduk.
		int farkliSayiSayisi = sayiDizisi.length - dizidekiAyniSayiSayisi(sayiDizisi);
		return farkliSayiSayisi;
	}

	public static int[] tekrarlananSayilariCikar (int[] dizi) {          //Bu method ile tekrar etmeyen sayýlarý yeni dizimize doldurduk.
		int[] farkliSayilarDizisi=new int[dizidekiFarkliSayiSayisi(dizi)];
		int sayac=0;
		for (int i = 0; i < dizi.length; i++) {
			if(linearSearch(farkliSayilarDizisi, dizi[i]) < 0) { // Burada içi boþ olan dizinin içinde, içi dolu olan dizinin elemanlarý var mý diye kontrol ettik.linearSearch metodu ile eðer -1 yani 0'dan düþük bir deðer bize döndüyse bu sayý yeni doldurduðumuz dizinin içinde yoktur dedik Ve bu deðeri yeni doldurduðumuz diziye ekledik.
				farkliSayilarDizisi[sayac++]=dizi[i];
			}
		}
		
		
		return farkliSayilarDizisi;
	}

	public static int linearSearch(int[] dizi, int sayi) { // Burada bildiðimiz linearSearch metodunu yazdk.

		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i] == sayi) {
				return i;
			}
		}

		return -1;
	}

	public static int dizidekiAyniSayiSayisi(int[] sayiDizisi) {  // Dizideki ayný sayýlarýn sayýsýný bulduk.
		int ayniSayiSayaci = 0;
		for (int i = 0; i < sayiDizisi.length; i++) {
			for (int j = i + 1; j < sayiDizisi.length; j++) {
				if (sayiDizisi[i] == sayiDizisi[j]) {
					ayniSayiSayaci++;
					break;
				}
			}
		}
		return ayniSayiSayaci;
	}
	public static void main(String[] args) {

		System.out.println("Lütfen içinden tekrar edenlerin çýkartýlacaðý 10 adet tam sayý giriniz.");
		Scanner klavye = new Scanner(System.in);
		final int DIZI_UZUNLUGU = 10;
		int[] sayiDizisi = new int[DIZI_UZUNLUGU];

		for (int i = 0; i < DIZI_UZUNLUGU; i++) {
			sayiDizisi[i] = klavye.nextInt();
		}

		klavye.close();
		
		int[] yeniDizi=tekrarlananSayilariCikar(sayiDizisi); // Tekrarlanan sayýlarýn çýkartýldýðý diziyi yeni bir dizi deðiþkenine atadýk. 
		
		
		for (int i = 0; i < yeniDizi.length; i++) { // Sorunun cecabýný yazdýrdýk.
			System.out.print(yeniDizi[i]+" ");
		}
	

	}

} // sayý örneklemi 1 2 3 2 1 6 3 4 5 2  linearSearch metodu yerine  esas methoda bir döngü daha ilave ederek de çözüme ulaþýlabilir.
