package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_14_MatrisKesfetme {
	/*
(Matris olu�turma) Kullan�c�dan kare bir matrisin uzunlu�unu alan, matrise rastgele 0 ve 1 de�erleri ekleyip matrisi g�steren ve t�m sat�r, 
s�tun ya da diyagonali ayn� (0 ya da 1) elemanlardan olu�anlar�n indeksini g�steren bir program yaz�n�z. Program�n �rnek ak���n� inceleyiniz:

                   Matrisin boyutunu giriniz: 4

                   0111
                   0000
                   0100
                   1111

                   1. siradaki tum 0�lar
                   3. siradaki tum 1�ler
                   Hicbir sutunda ayni sayi yok
                   Buyuk capraz hatta ayni sayi yok
                   Kucuk capraz hatta ayni sayi yok
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("L�tfen yarat�lmas�n� istedi�iniz matrisin boyutunu giriniz :   ");
		
		int matrisBoyut=klavye.nextInt();
		klavye.close();
		int[][] matris=matrisYarat(matrisBoyut);
		
		matrisYazdir(matris);
		satirVeSutunDurumYazdir(matris);
		kosegenDurumYazdir(matris);
	}
	
	public static int[][] matrisYarat(int karelemeSayisi){       // Kullan�c�dan al�nan say� kadar  sat�r ve s�tundan olu�acak olan kare matris yaratan metod.
		int[][] matris=new int[karelemeSayisi][karelemeSayisi];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=(int)(Math.random()*2);
			}
		}
		return matris;
	}
	
	public static void matrisYazdir(int[][] matris) {     // Bir �stte yarat�lan matrisi ekrana basan metod.
		for (int[] is : matris) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
	
	public static void satirVeSutunDurumYazdir(int[][] matris) {  // Satir ve sutun durumlar�n� ekrana basan metod.
		boolean satirlarKontrol=false;
		boolean sutunlarKontrol=false;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < 2; j++) {
				if(satirAyniMi(matris, i, j)) {						
					System.out.println(i+". satir hepsi "+j);
					satirlarKontrol=true;
				}
				if(sutunAyniMi(matris, i, j)) {
					System.out.println(i+". sutun hepsi "+j );
					sutunlarKontrol=true;
				}
			}
		}
		if(!satirlarKontrol) {
			System.out.println("Hi� bir sat�rdaki say�lar�n hepsi ayn� de�il.");
		}
		if(!sutunlarKontrol) {
			System.out.println("Hi� bir s�tundaki sayilarin hepsi ayn� de�il.");
		}
	}
	
	public static boolean satirAyniMi(int[][] matris,int satir,int m) {     // Satirlar�n ayni mi oldu�unu satir numaras� alarak her bir numaras�n� ald��� sat�r i�in kontrol eden metod. 
			for (int j = 0; j < matris[satir].length; j++) {				// Bu d�ng� matrisi ve sat�r numaras�n�  al�r ve ald�g� sat�r numaras�n�n uzunlugu kadar sutunu dola��r.
				if(matris[satir][j] !=m) {									// Bu dola�ma esnas�nda matrisin sat�r�ndaki her bir eleman�n� m de�eri ile e�it mi de�il mi kontrol eder.
					return false;
				}
			}
	return true;
	}	
	
	public static boolean sutunAyniMi(int[][] matris,int sutun,int m) {    // Bir �stteki sat�r kontrol� gibi bu metodda ayn� mantik �er�evesinde s�t�n kontrol� yapmaktad�r.
		for (int j = 0; j < matris[sutun].length; j++) {
			if(matris[j][sutun] !=m) {
				return false;
			}
		}
	return true;
	}
	
	public static boolean  sagUstKosegenAyniMi(int[][] matris,int m) {    // Sa� �st k��egen elemanlar�n�n tamam� ayn� m� kontrol eden metod.
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				if(i+j == matris.length-1 && matris[i][j] != m) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean  solUstKosegenAyniMi(int[][] matris,int m) {   //Sol �st k��egen elemanlar�n�n tamam� ayn� m� kontrol eden metod.
		for (int i = 0; i < matris.length; i++) {
			if( m != matris[i][i] ) {
				return false;
			}
		}
		return true;
	}

	public static void kosegenDurumYazdir(int[][] matris) {  // K��egen kontrollerini yazd�ran metod.
		for (int i = 0; i < 2; i++) {
			if(solUstKosegenAyniMi(matris,i)){
				System.out.println("Sol �st k��egenin hepsi "+i);
			}
			if(sagUstKosegenAyniMi(matris, i)) {
				System.out.println("Sa� �st k��egenin hepsi "+i);
			}
		}
		if(!solUstKosegenAyniMi(matris, 0) && !solUstKosegenAyniMi(matris, 1)) {
			System.out.println("Sol �st k��egendeki say�lar ayn� de�il.");
		}
		if(!sagUstKosegenAyniMi(matris, 0) && !sagUstKosegenAyniMi(matris, 1)) {
			System.out.println("Sa� �st k��egendeki say�lar ayn� de�il.");
		}
	}
	
}
