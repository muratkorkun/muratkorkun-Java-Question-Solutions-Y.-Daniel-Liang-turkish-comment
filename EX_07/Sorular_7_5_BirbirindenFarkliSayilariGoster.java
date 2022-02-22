package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_5_BirbirindenFarkliSayilariGoster {

	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in); //Scanner sýnýfýndan klavye nesnemizi oluþturuyoruz
		

		System.out.println("On sayi giriniz"); // Kullanýcýdan 10 adet sayý girmesini istediðimiz String'i ekrana bastýrýyoruz
		

		int girilenSayi = 0; //Girilen sayý deðiþkenimize ilklendirme yapýyoruz.
		

		int sayac = 1; //Sayacýmýzý 1 den baþlatmak için 1 e eþitledik
		

		int[] sayiDizisi = new int[10]; //Kullanýcýdan alacaðýmýz sayýlarý tutmak için bir dizi oluþturduk.(içinde varsayýlan olarak 0 dolu þekilde dizi oluþtu)
		

		for (int i = 0; i < sayiDizisi.length; i++) { //Oluþturduðumuz dizi uzunluðunda for döngüsünü baþlattýk.
			

			girilenSayi = klavye.nextInt(); //Kullanýcýdan döngü boyunca 1 adet kullanýcý giriþi yapmasýný istedik.Kullanýcý girdisini girilenSayi deðiþkenine atadýk.
			

			if (i == 0) { //Döngünün ilk turunda girilenSayi yi sayýDizisi ndeki ilk indise atadýk.
				
				sayiDizisi[i] = girilenSayi;
			}else {
				

				for (int j = 0; j < i+1 ; j++) { //Döngünün ilk turunda deðilsek döngü içinde bir döngü daha baþlattýk.Tüm i döngülerinde j yi kontrol etmemiz gerektiðini unutmayalým.
					

					if (sayiDizisi[j] == girilenSayi) { //GirilenSayi nýn deðerinin sayiDizisi içinde eþi olup olmadýðýný kontrol edip eþi varsa j döngüsünü kýralým.
						break;
					} else if(sayiDizisi[j] !=girilenSayi && j==i){ //Burada girilenSayi sayiDizisi nin j'inci elemanýna eþit deðilse ve j döngü sayýsý i döngü sayýsýna eþitse(yani dýþ döngü ve iç döngünün sonunda dizi'mize sayýmýzý ekledik) girilenSayi yi sayiDizisine atadýk.
						sayiDizisi[j] = girilenSayi;
						sayac++;   // Farklý sayý sayaciný artýrdýk.
					}
				}
			}		

		}
		
		System.out.println("Birbirinden farklý olan sayi adedi : " + sayac); // yazdýrma  iþlemleri
		System.out.print("Farkli sayilar : ");
		for (int i = 0; i < sayiDizisi.length; i++) { // içinde 0 olmayan sayýDizisi indislerinin deðerlerini ekrana bastýrdýk.
			if (sayiDizisi[i] != 0) {
				System.out.print(sayiDizisi[i] + " ");
			}
		}

	}
}