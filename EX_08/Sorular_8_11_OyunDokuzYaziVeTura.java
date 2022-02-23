package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_11_OyunDokuzYaziVeTura {
	/*
	 * **8.11 (Oyun: dokuz yaz� ve tura) 3*3 matrise dokuz tane madeni para yerle�tiriniz. Baz�lar� yaz� baz�lar� tura olsun. Bu 3*3 boyutlu matriste yaz� 1 ve tura 0 ile temsil edilsin. A�a��da �rnekleri inceleyiniz.

									0 0 0 			1 0 1 		1 1 0 		1 0 1		 1 0 0
									0 1 0 			0 0 1 		1 0 0		1 1 0		 1 1 1
									0 0 0 			1 0 0		0 0 1 		1 0 0		 1 1 0

Her bir matrisin durumu ikilik bir say� ile de temsil edilebilir. Yukar�daki matrisler a�a��daki ikilik say�lara kar��l�k gelir.

									000010000 101001100 110100001 101110100 100111110

Toplam 512 tane olas�l�k bulunmaktad�r. 0, 1, 2, 3, . . . ve 511 say�lar�n� kullanarak matrisin her bir durumunu g�sterebilirsiniz. 
Kullan�c�dan 0 ile 511 aral���nda bir say� alan ve buna kar��lk gelen matrisi Y (yaz�) ve T (tura) karakterleri ile g�steren bir program yaz�n�z. �rnek ak��� inceleyiniz:

					                 0 - 511 arasi bir sayi giriniz: 7
					
					                 T T T
					                 T T T
					                 Y Y Y

Kullan�c� 7 girdi�inde bu 000000111�i temsil eder. 0 T ve 1 Y anlam�na geldi�i i�in, sonu� do�rudur.
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("L�tfen 0-511 dahil aral���nda bir say� giriniz.    ");   // Kullan�c�dan 0-511 aral���nda decimal bir say� girmesini istedik.
		
		String binarySayi=decToBinary(klavye.nextInt());						//Al�nan say�y� String olarak ikilik say�ya �eviren metodu kulland�k.
		binarySayi = eksikSifirlariTamamla(binarySayi);						//�kilik say�n�n �n�nde eksik kalan s�f�rlar� 9 haneye tamamlanacak �ekilde Stringe ilave ettik.
		
		char[][] matris=charMatrisAl(binarySayi);							// 3x3 iki boyutlu char dizisi olu�turduk. String say�m�z�n t�m karakterlerini i�ine gereken �ekilde yaz� yada tura olacak �ekilde doldurduk.
		matrisYazdir(matris);														// �ki boyutlu char dizimizi ekrana bast�rd�k.
		klavye.close();											
		
	}

	public static String decToBinary(int decSayi) {			// decimal say�y� binary say�ya String olarak �eviren metod.
		String binarySayi="";
		int kalan=0;
		while(decSayi != 0) {
			kalan=decSayi % 2;
			decSayi=decSayi/2;
			binarySayi=kalan+binarySayi;
		}
		return binarySayi;
	}

	public static String eksikSifirlariTamamla(String binarySayi) {   // Eksik s�f�rlar� tamamlayan metod.
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
