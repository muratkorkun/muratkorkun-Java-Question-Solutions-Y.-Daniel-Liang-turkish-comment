package Bolum08_BenimYazdiklarim;

import java.util.Iterator;
import java.util.Scanner;

public class Sorular_8_9_OyunTicTacToe {
	/*
(Oyun: Tic-tac-toe) Tic-tac-toe oyununda iki oyuncu s�ras�yla 3*3 bir tabloda bo� olan bir kareye X ya da O ta��n� koyar. E�er bir oyuncu ayn� sat�ra, ayn� s�tuna ya da �apraz olarak �� ta� koyduysa oyun biter ve bu oyuncu kazan�r.

 Tablodaki t�m alanlar doldurulursa ve bir oyuncu kazanm�� durumda de�ilse oyun sonlan�r ve bu oyun berabere biter. Tic-tac-toe oynatan bir program yaz�n�z.

Program iki oyuncudan da X ta��n� ve O ta��n� tabloda bir yere koymas�n� istesin. Oyuncu oynad�ktan sonra program tablonun durumunu g�stersin ve oyunun durumuna karar versin (Kazand�n�z, berabere, devam edin). �rnek ak��� inceleyiniz:

                  X oyuncusu icin bir satir giriniz (0, 1 ya da 2):  1

                  X oyuncusu icin bir sutun giriniz (0, 1 ya da 2):  1

                  O oyuncusu icin bir satir giriniz (0, 1 ya da 2):  1

                  O oyuncusu icin bir sutun giriniz (0, 1 ya da 2):  2

                  X oyuncusu icin bir satir giriniz (0, 1 ya da 2):  

                  .  .  .
                X oyuncusu kazandi
	 */
	
	public static void main(String[] args) {
		
		char[][] tahta=new char[3][3];			// 3x3 iki boyutlu matris ile tahtay� olu�turduk. 
		
		for (int i = 0; i < tahta.length; i++) {		// Tahtaya ' ' bo�luk karakteri doldurduk.
			for (int j = 0; j < tahta[i].length; j++) {
				tahta[i][j]=' ';
			}
		}
		Scanner klavye=new Scanner(System.in);    
		tahtaYazdir(tahta);     // Tahtayi yazdirma metodu ile tahtayi yazdirdik.
		 
		while(!oyunBittiMi(tahta)) {			// Oyun bitmediyse d�ng�y� devam ettirdik.
			xAl(klavye, tahta);
			tahtaYazdir(tahta);
			if(xKazandiMi(tahta)) {
				System.out.println("X oyuncusu kazand�.");
				break;
			}else if(berabereMiKaldi(tahta)) {
				System.out.println("Berabere kald�n�z");
				break;
			}
			
			oAl(klavye, tahta);
			tahtaYazdir(tahta);
			if(oKazandiMi(tahta)) {
				System.out.println("O oyuncusu kazand�.");
			}else if(berabereMiKaldi(tahta)) {
				System.out.println("Berabere kald�n�z");
			}
		}
		klavye.close();
	}
	
	public static void xAl(Scanner klavye,char[][] tahta) {
		System.out.print("  X oyuncusu icin bir satir giriniz (1, 2 ya da 3):");
		int xSatiri=klavye.nextInt()-1;
		System.out.print("  X oyuncusu icin bir s�tun giriniz (1, 2 ya da 3):");
		int xSutunu=klavye.nextInt()-1;
		if(tahta[xSatiri][xSutunu] !=' ') {
			System.out.println("\t["+xSatiri+","+xSutunu+"]"+" dolu l�tfen ba�ka bir konum se�iniz");
			xAl(klavye,tahta);
		}else {
			tahta[xSatiri][xSutunu]='X';
		}
	}
	
	public static void oAl(Scanner klavye,char[][] tahta) {
		System.out.print("  O oyuncusu icin bir satir giriniz (1, 2 ya da 3):");
		int oSatiri=klavye.nextInt()-1;
		System.out.print("  O oyuncusu icin bir s�tun giriniz (1, 2 ya da 3):");
		int oSutunu=klavye.nextInt()-1;
		if(tahta[oSatiri][oSutunu] !=' ') {
			System.out.println("\t["+oSatiri+","+oSutunu+"]"+" dolu l�tfen ba�ka bir konum se�iniz");
			oAl(klavye,tahta);
		}else {
			tahta[oSatiri][oSutunu]='O';
		}
	}
	
	public static boolean oyunBittiMi(char[][] tahta) {   // Oyun bittiyse true d�nd�ren metodu yazdik.
		
		if(xKazandiMi(tahta) || oKazandiMi(tahta) || berabereMiKaldi(tahta)) {
			return true;
		}
		return false;
	}
	public static boolean xKazandiMi(char[][] tahta) {       // X kazandi ise true d�nen metod.
		if(sutunlarAyniMi(tahta, 'X') || satirlarAyniMi(tahta, 'X') || solCaprazlarAyniMi(tahta, 'X') || sagCaprazlarAyniMi(tahta, 'X')) {
			return true;
		}
		return false;
	}

	public static boolean oKazandiMi(char[][] tahta) {      // O kazandi ise true d�nen metod.
		if(sutunlarAyniMi(tahta, 'O') || satirlarAyniMi(tahta, 'O') || solCaprazlarAyniMi(tahta, 'O') || sagCaprazlarAyniMi(tahta, 'O')) {
			return true;
		}
		return false;
	}

	public static boolean berabereMiKaldi(char[][] tahta) {  // Kutular bitti ise ve kazanan olmad�ysa oyun berabere kalm�� demektir.
		boolean kutularBittiMi=true;
		for (int i = 0; i < tahta.length; i++) {
			for (int j = 0; j < tahta.length; j++) {
				if(tahta[i][j] == ' ') {
					kutularBittiMi=false;
				}
			}
		}
		return kutularBittiMi;
	}

	public static boolean satirlarAyniMi(char[][] dizi, char ch) {  // Satirlar ayni ise true d�nen metod.
		boolean satirlarAyni = true;
		for (int i = 0; i < dizi.length; i++) {
			satirlarAyni=true;
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[i][j]!=ch) {
					satirlarAyni=false;
				}
			}
			if(satirlarAyni) {
				return true;
			}
		}
		return false;
	}
	public static boolean sutunlarAyniMi(char[][] dizi,char ch) { // sutunlar ayni ise true d�nen metod.
		
		boolean sutunlarlarAyni = true;
		for (int i = 0; i < dizi.length; i++) {
			sutunlarlarAyni=true;
			for (int j = 0; j < dizi[i].length; j++) {
				if(dizi[j][i]!=ch) {
					sutunlarlarAyni=false;
				}
			}
			if(sutunlarlarAyni) {
				return true;
			}
		}
		return false;
	}
	public static boolean solCaprazlarAyniMi(char[][] tahta, char ch) {  // solcapraz ayni ise true d�nen metod.
		
		int solCaprazlarAyni = 0;
		for (int i = 0; i < tahta.length; i++) {
			for (int j = 0; j < tahta[i].length; j++) {
				if(tahta[i][j]==ch && i==j) {
					solCaprazlarAyni++;
				}
			}
		}
		if(solCaprazlarAyni==3) {
			return true;
		}
		return false;
	}
	
	public static boolean sagCaprazlarAyniMi(char[][] tahta, char ch) { // sagcapraz ayni ise true d�nen metod.
		int sagCaprazlarAyni=0;
		for (int i = 0; i < tahta.length; i++) {
			
			for (int j = 0; j < tahta.length; j++) {
				if(tahta[i][j]==ch && i+j==2) {
					sagCaprazlarAyni++;
			}
		}
	}
		if(sagCaprazlarAyni==3) {
			return true;
		}
		return false;
	}
	public static void tahtaYazdir(char[][] tahta) {  ;// Tahtayi yazdiran metod.
		
		for (int i = 0; i < tahta.length; i++) {
			System.out.println("-------------");
			System.out.print("|");
			for (int j = 0; j < tahta.length; j++) {
				System.out.print(" "+tahta[i][j]+" |"+(j == 2 ?"\n":""));
			}
			if(i==2) {
				System.out.println("-------------");
			}
		}
	}
	
}
