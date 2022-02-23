package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_11_OyunDokuzYaziVeTura {
	/*
	 * **8.11 (Oyun: dokuz yazý ve tura) 3*3 matrise dokuz tane madeni para yerleþtiriniz. Bazýlarý yazý bazýlarý tura olsun. Bu 3*3 boyutlu matriste yazý 1 ve tura 0 ile temsil edilsin. Aþaðýda örnekleri inceleyiniz.

									0 0 0 			1 0 1 		1 1 0 		1 0 1		 1 0 0
									0 1 0 			0 0 1 		1 0 0		1 1 0		 1 1 1
									0 0 0 			1 0 0		0 0 1 		1 0 0		 1 1 0

Her bir matrisin durumu ikilik bir sayý ile de temsil edilebilir. Yukarýdaki matrisler aþaðýdaki ikilik sayýlara karþýlýk gelir.

									000010000 101001100 110100001 101110100 100111110

Toplam 512 tane olasýlýk bulunmaktadýr. 0, 1, 2, 3, . . . ve 511 sayýlarýný kullanarak matrisin her bir durumunu gösterebilirsiniz. 
Kullanýcýdan 0 ile 511 aralýðýnda bir sayý alan ve buna karþýlk gelen matrisi Y (yazý) ve T (tura) karakterleri ile gösteren bir program yazýnýz. Örnek akýþý inceleyiniz:

					                 0 - 511 arasi bir sayi giriniz: 7
					
					                 T T T
					                 T T T
					                 Y Y Y

Kullanýcý 7 girdiðinde bu 000000111’i temsil eder. 0 T ve 1 Y anlamýna geldiði için, sonuç doðrudur.
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Lütfen 0-511 dahil aralýðýnda bir sayý giriniz.    ");   // Kullanýcýdan 0-511 aralýðýnda decimal bir sayý girmesini istedik.
		
		String binarySayi=decToBinary(klavye.nextInt());						//Alýnan sayýyý String olarak ikilik sayýya çeviren metodu kullandýk.
		binarySayi = eksikSifirlariTamamla(binarySayi);						//Ýkilik sayýnýn önünde eksik kalan sýfýrlarý 9 haneye tamamlanacak þekilde Stringe ilave ettik.
		
		char[][] matris=charMatrisAl(binarySayi);							// 3x3 iki boyutlu char dizisi oluþturduk. String sayýmýzýn tüm karakterlerini içine gereken þekilde yazý yada tura olacak þekilde doldurduk.
		matrisYazdir(matris);														// Ýki boyutlu char dizimizi ekrana bastýrdýk.
		klavye.close();											
		
	}

	public static String decToBinary(int decSayi) {			// decimal sayýyý binary sayýya String olarak çeviren metod.
		String binarySayi="";
		int kalan=0;
		while(decSayi != 0) {
			kalan=decSayi % 2;
			decSayi=decSayi/2;
			binarySayi=kalan+binarySayi;
		}
		return binarySayi;
	}

	public static String eksikSifirlariTamamla(String binarySayi) {   // Eksik sýfýrlarý tamamlayan metod.
		if(binarySayi.length() < 9) {
			for (int i = binarySayi.length(); i < 9; i++) {
				binarySayi='0'+binarySayi;
			}
		}
		return binarySayi;
	}

	public static char[][] charMatrisAl(String binarySayi) {  // String'i char matrise dolduran metod.
		char[][] yaziTura=new char[3][3];
		for (int i = 0; i < yaziTura.length; i++) {
			for (int j = 0; j < yaziTura[i].length; j++) {
				if(binarySayi.charAt(i*3+j)=='0') {
					yaziTura[i][j]='T';
				}else {
					yaziTura[i][j]='Y';
				}
			}
		}
		return yaziTura;
	}
	
	public static void matrisYazdir(char[][] yaziTura) {    // Matrisi yazdiran metod.
		for (char[] cs : yaziTura) {
			for (char cs2 : cs) {
				System.out.print(cs2+" ");
			}
			System.out.println();
		}
	}

}
