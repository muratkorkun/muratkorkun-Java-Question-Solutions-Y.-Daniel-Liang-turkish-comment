package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_15_TekrarlananSayilariCikartma_2 {

	private static int[] tekrarlananSayilariCikart(int[] dizi) { // Bu method ile tekrar eden sayýlarý çýkarttýk.
		int[] yeniDizi = new int[dizi.length];
		int sayac = 0; // Bu sayacý kopya olmayan sayýlarý bulduðumuzda indis olarak kullanmak için
						// oluþturduk.
		for (int i = 0; i < dizi.length; i++) { // Dolu olan dizinin elemanlarýný tek tek alýp dolduracaðýmýz dizide var
												// mý diye kontrol ettik.
			boolean kopyaMi = false; // Döngü her döndüðünde kontrol deðerimize false atamamý yaptýk.

			for (int j = 0; j < yeniDizi.length; j++) { // Burada dolu dizideki eleman yeni yeni doldurulmuþ olan dizide
														// var mý diye kontrol ettik.
				if (dizi[i] == yeniDizi[j]) { // dolu dizideki eleman dolacak dizideki elemanla eþit ise kopyadýr dedik.
					kopyaMi = true;
				}

			}
			if (!kopyaMi) { // iç döngüden gelen true deðeri olmadý ise yani kopya deðil ise kontrol edilen
							// dolu dizinin i'incisi dolacak dizinin sayac'ýncýsýna atadýk.Bunu dýþ döngü
							// içinde yaptýk.
				{
					yeniDizi[sayac++] = dizi[i];
				}
			}
		}

		int[] dizidenSifirCikarilmis = new int[sayac]; // burada isminden anlaþýlacaðý üzere yeni doldurulan dizideki
														// sýfýrlarý attýk.
		for (int j = 0; j < sayac; j++) {

			dizidenSifirCikarilmis[j] = yeniDizi[j];
		}

		return dizidenSifirCikarilmis;

	}

	public static void main(String[] args) {
		System.out.println("Lütfen tekrarlanan sayýlarýn çýkartýlacaðý 10 adet sayý giriniz.");

		Scanner klavye = new Scanner(System.in); // Kullanýcýdan 10 sayý istedik.

		int[] dizi = new int[10];
		for (int i = 0; i < dizi.length; i++) { // Aldýðýmýz sayýlarý bir diziye doldurduk.
			dizi[i] = klavye.nextInt();
		}
		klavye.close();

		int[] yeniDizi = tekrarlananSayilariCikart(dizi); // Dizi verileri ile iþlem yaptýk. Bu iþlem sonucunda yeni bir
															// dizi dönderdik.Bu sebeple iþlem sonucunu görebilmek için
															// yeni bir dizi deðiþkenine atama yapmamýz gerekti.

		for (int i = 0; i < yeniDizi.length; i++) { // Dönderilen diziyi yazdýrdýk.
			System.out.printf("%5d", yeniDizi[i]);
		}
	}
	// sayý örneklemi 1 2 3 2 1 6 3 4 5 2
} // Not bu sorunun çözümü linearSearh metodu kullanýlarak da yapýlabilebilinir.
