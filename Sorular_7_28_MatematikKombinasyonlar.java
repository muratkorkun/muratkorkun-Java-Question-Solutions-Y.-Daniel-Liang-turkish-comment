package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_28_MatematikKombinasyonlar {
	
	//Örneklem 4 54 77 12 95 22 34 58 63 72

	public static void main(String[] args) {

		System.out.println("Lütfen 10 adet tam sayý giriniz.");

		Scanner klavye = new Scanner(System.in);
		int[] tamSayilar = new int[10];
		
		for (int i = 0; i < tamSayilar.length; i++) {
			tamSayilar[i]=klavye.nextInt();
		}
		klavye.close();
		
		int kombinasyonSayisi=0;
		System.out.println("Kombinasyonlar þunlardýr : \n");   
		for (int i = 0; i < tamSayilar.length - 1; i++) {  //Kombinasyon bilindiði üzere sadece ikili olarak seçmektir. Sýra önemli deðildir. yani ab kümesi ile ba kümesi ayný sayýlacaktýr.
															//Bundan dolayý selectionSort algoritmasýna benzer þekilde algoritma yazmamýz gerekti. 
														//Yani dizinin her elemanýný kendinden sonra gelen elemanlarla eþleþtirme bittikten sonra dizinin sýradaki elemanýný kendinden önceki eleman yada elemanlar ile eþleþtiremeyeceðimizden kendinden sonrakilerle eþleþtirdik.
			
			for (int j = i + 1; j < tamSayilar.length; j++) {

				System.out.printf("[%3d,%3d ]",tamSayilar[i],tamSayilar[j]);  // printf komutunun kullanýmýna 7.25 de deðinilmiþtir.
				kombinasyonSayisi++;
			}
			System.out.println();
		}
		System.out.println(kombinasyonSayisi+" tane farkli 10'un 2'li kombinasyonu vardýr.");

		

	}
}
