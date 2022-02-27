package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_20_Dortleme {
/*	***8.20 (Oyun: d�rtleme)D�rtleme iki ki�i ile oynan�r. Oyuncular birbirinden farkl� renklerde diskleri 
 * 7 s�tun ve 6 s�radan olu�an bir bo�luklu tahta �zerinde, a�a��da g�sterildi�i gibi yukar�dan b�rak�rlar.

Oyunun amac� ayn� renkte olan 4 diski sat�r, s�tun ya da �apraz olarak rakibinden �nce yan yana getirmektir. 
Program s�ras�yla iki oyuncudan; biri sar�(Y), di�eri k�rm�z�(R) olmak �zere bir disk koymalar�n� isteyecek.
 A�a��daki g�rselde k�rm�z� disk daha koyu, sar� disk daha a��k renkte g�sterilmi�tir. 
 Oyuncu oynad�ktan sonra program tablonun durumunu g�sterecek ve oyunun durumuna karar verecek.  (Kazand�n�z, berabere kald�n�z, devam edin) �rnek ak��� inceleyiniz:
                    0 - 6 sutunlarindan birine kirmizi bir disk koyun: 0
                    0 - 6 sutunlarindan birine sari bir disk koyun: 3
                   0 - 6 sutunlarindan birine sari bir disk koyun: 6
                  Sari diskli oyuncu kazandi.
 */
	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		char tahta[][]=tahtaAl(6,7);
		tahtaYazdir(tahta);
		int sutunNo;
		
		while(true) {						//Oyunu ba�latan ve bitene kadar devam ettiren metod.
			while(true) {
				System.out.print(" 0 - 6 sutunlarindan birine k�rm�z� bir disk koyun : ");
				sutunNo=sutunNoAl(klavye);
				if(tahtaGuncelle(tahta, 'K', sutunNo)) {
					tahtaYazdir(tahta);
					break;
				}
			}
			if(oyunBittiMi(tahta, 'K')){
				break;
			}
			while(true) {
				System.out.print(" 0 - 6 sutunlarindan birine sar� bir disk koyun : ");
				sutunNo=sutunNoAl(klavye);
				if(tahtaGuncelle(tahta, 'S', sutunNo)) {
					tahtaYazdir(tahta);
					break;
				}
			}
			if(oyunBittiMi(tahta, 'S')){
				break;
			}
		}
		klavye.close();
	}
	
	public static char[][] tahtaAl(int satir, int sutun){    // Bo�luk karakteri ile d�m tahty� dolduran metod.
		char[][] matris=new char[satir][sutun];
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=' ';
			}
		}
		return matris;
	}
	
	public static void tahtaYazdir(char[][] tahta) {		// Tahtay� ekrana yazd�ran metod.
		for (int i = 0; i < tahta.length; i++) {
			System.out.println("\t\t\t\t");
			System.out.print("|");
			for (int j = 0; j < tahta[i].length; j++) {
				System.out.print(" "+tahta[i][j]+" |");
			}
			System.out.println();
		}
		System.out.println("-----------------------------");
	}
	
	public static int sutunNoAl(Scanner klavye) {			//Uygun sutun numaras� alan metod.
		int sutun=klavye.nextInt();
		while(sutun >6 || sutun <0 ) {
			System.out.print("Hatal� giri� : slot numaras� 0-6 aras�nda olmal�d�r. ");
			sutun=klavye.nextInt();
		}
		return sutun;
	}
	
	public static boolean tahtaGuncelle(char[][] tahta,char ch,int sutunNo) {  // Tahtay� g�ncelleyen metod.
		if(tahta[0][sutunNo] !=' ') {
			System.out.print("Se�ti�iniz slot dolu ba�ka slot se�iniz. ");
			return false;
		}else {
			for (int i = tahta.length-1; i > -1; i--) {
				if(tahta[i][sutunNo]==' ') {
					tahta[i][sutunNo]=ch;
					break;
				}
			}
		}
		return true;
	}
	
	public static boolean oyunBittiMi(char[][] tahta,char oyuncuSembol) {   // Kontrol ettigi�i oyuncu sembol�ne g�re oyun bitme durumlar�n� ekrana yazd�ran metod.
		if(dortlemeVarMi(tahta, oyuncuSembol)) {
			System.out.print((oyuncuSembol=='K'?"K�rm�z�":"Sar�")+" oyuncu kazand�.");
			return true;
		}else if(tumKutularDoluMu(tahta)) {
			System.out.print("Berabere kald�n�z. ");
			return true;
		}
		return false;
	}
	
	public static boolean dortlemeVarMi(char[][] tahta,char ch)  {			// D�rtleme var m� kontrol eden metod.
		for(int i = 0; i < tahta.length; i++)						//Dikey kontrol
			for(int j = 0; j < tahta[i].length - 3; j++)
				if(ch == tahta[i][j] && tahta[i][j] == tahta[i][j + 1] &&
					 tahta[i][j + 1] == tahta[i][j + 2] &&
					 tahta[i][j + 2] == tahta[i][j + 3])
					return true;
		
		for(int i = 0; i < tahta.length - 3; i++)					//Yatay kontrol
			for(int j = 0; j < tahta[i].length; j++)
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i + 1][j] &&
				    tahta[i + 1][j] == tahta[i + 2][j] &&
				    tahta[i + 2][j] == tahta[i + 3][j])
				 	return true;
		
		for(int i = 0; i < tahta.length - 3; i++)					// A�a�� ak�� kontrol�
			for(int j = 0; j < tahta[i].length - 3; j++)
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i + 1][j + 1] &&
				    tahta[i + 1][j + 1] == tahta[i + 2][j + 2] &&
				    tahta[i + 2][j + 2] == tahta[i + 3][j + 3])
					return true;
		
		for(int i = tahta.length - 1; i >= 3; i--)					// Yukar� ak�� kontrol�
			for(int j = 0; j < tahta[i].length - 3; j++)	
				if (ch == tahta[i][j] && tahta[i][j] == tahta[i - 1][j + 1] &&
						tahta[i - 1][j + 1] == tahta[i - 2][j + 2] &&
						tahta[i - 2][j + 2] == tahta[i - 3][j + 3])
					return true;
		return false;				
	}

	public static boolean tumKutularDoluMu(char[][] tahta) {	// Beraberlik durumu i�in t�m kutular�n dolu olup olmad���n� kontrol eden metod.
		for (int i = 0; i < tahta.length; i++) {
			for (int j = 0; j < tahta[i].length; j++) {
				if (tahta[i][j] ==' '){
						return false;
				}
			}
		}
		return true;
	}
}
