package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_28_MatematikKombinasyonlar {
	
	//�rneklem 4 54 77 12 95 22 34 58 63 72

	public static void main(String[] args) {

		System.out.println("L�tfen 10 adet tam say� giriniz.");

		Scanner klavye = new Scanner(System.in);
		int[] tamSayilar = new int[10];
		
		for (int i = 0; i < tamSayilar.length; i++) {
			tamSayilar[i]=klavye.nextInt();
		}
		klavye.close();
		
		int kombinasyonSayisi=0;
		System.out.println("Kombinasyonlar �unlard�r : \n");   
		for (int i = 0; i < tamSayilar.length - 1; i++) {  //Kombinasyon bilindi�i �zere sadece ikili olarak se�mektir. S�ra �nemli de�ildir. yani ab k�mesi ile ba k�mesi ayn� say�lacakt�r.
															//Bundan dolay� selectionSort algoritmas�na benzer �ekilde algoritma yazmam�z gerekti. 
														//Yani dizinin her eleman�n� kendinden sonra gelen elemanlarla e�le�tirme bittikten sonra dizinin s�radaki eleman�n� kendinden �nceki eleman yada elemanlar ile e�le�tiremeyece�imizden kendinden sonrakilerle e�le�tirdik.
			
			for (int j = i + 1; j < tamSayilar.length; j++) {

				System.out.printf("[%3d,%3d ]",tamSayilar[i],tamSayilar[j]);  // printf komutunun kullan�m�na 7.25 de de�inilmi�tir.
				kombinasyonSayisi++;
			}
			System.out.println();
		}
		System.out.println(kombinasyonSayisi+" tane farkli 10'un 2'li kombinasyonu vard�r.");

		

	}
}
