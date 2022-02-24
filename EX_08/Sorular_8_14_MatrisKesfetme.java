package Bolum08_BenimYazdiklarim;

import java.util.Scanner;

public class Sorular_8_14_MatrisKesfetme {
	/*
(Matris oluþturma) Kullanýcýdan kare bir matrisin uzunluðunu alan, matrise rastgele 0 ve 1 deðerleri ekleyip matrisi gösteren ve tüm satýr, 
sütun ya da diyagonali ayný (0 ya da 1) elemanlardan oluþanlarýn indeksini gösteren bir program yazýnýz. Programýn örnek akýþýný inceleyiniz:

                   Matrisin boyutunu giriniz: 4

                   0111
                   0000
                   0100
                   1111

                   1. siradaki tum 0’lar
                   3. siradaki tum 1’ler
                   Hicbir sutunda ayni sayi yok
                   Buyuk capraz hatta ayni sayi yok
                   Kucuk capraz hatta ayni sayi yok
	 */

	public static void main(String[] args) {
		Scanner klavye=new Scanner(System.in);
		System.out.print("Lütfen yaratýlmasýný istediðiniz matrisin boyutunu giriniz :   ");
		
		int matrisBoyut=klavye.nextInt();
		klavye.close();
		int[][] matris=matrisYarat(matrisBoyut);
		
		matrisYazdir(matris);
		satirVeSutunDurumYazdir(matris);
		kosegenDurumYazdir(matris);
	}
	
	public static int[][] matrisYarat(int karelemeSayisi){       // Kullanýcýdan alýnan sayý kadar  satýr ve sütundan oluþacak olan kare matris yaratan metod.
		int[][] matris=new int[karelemeSayisi][karelemeSayisi];
		
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				matris[i][j]=(int)(Math.random()*2);
			}
		}
		return matris;
	}
	
	public static void matrisYazdir(int[][] matris) {     // Bir üstte yaratýlan matrisi ekrana basan metod.
		for (int[] is : matris) {
			for (int is2 : is) {
				System.out.print(is2+" ");
			}
			System.out.println();
		}
	}
	
	public static void satirVeSutunDurumYazdir(int[][] matris) {  // Satir ve sutun durumlarýný ekrana basan metod.
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
			System.out.println("Hiç bir satýrdaki sayýlarýn hepsi ayný deðil.");
		}
		if(!sutunlarKontrol) {
			System.out.println("Hiç bir sütundaki sayilarin hepsi ayný deðil.");
		}
	}
	
	public static boolean satirAyniMi(int[][] matris,int satir,int m) {     // Satirlarýn ayni mi olduðunu satir numarasý alarak her bir numarasýný aldýðý satýr için kontrol eden metod. 
			for (int j = 0; j < matris[satir].length; j++) {				// Bu döngü matrisi ve satýr numarasýný  alýr ve aldýgý satýr numarasýnýn uzunlugu kadar sutunu dolaþýr.
				if(matris[satir][j] !=m) {									// Bu dolaþma esnasýnda matrisin satýrýndaki her bir elemanýný m deðeri ile eþit mi deðil mi kontrol eder.
					return false;
				}
			}
	return true;
	}	
	
	public static boolean sutunAyniMi(int[][] matris,int sutun,int m) {    // Bir üstteki satýr kontrolü gibi bu metodda ayný mantik çerçevesinde sütün kontrolü yapmaktadýr.
		for (int j = 0; j < matris[sutun].length; j++) {
			if(matris[j][sutun] !=m) {
				return false;
			}
		}
	return true;
	}
	
	public static boolean  sagUstKosegenAyniMi(int[][] matris,int m) {    // Sað üst köþegen elemanlarýnýn tamamý ayný mý kontrol eden metod.
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris.length; j++) {
				if(i+j == matris.length-1 && matris[i][j] != m) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean  solUstKosegenAyniMi(int[][] matris,int m) {   //Sol üst köþegen elemanlarýnýn tamamý ayný mý kontrol eden metod.
		for (int i = 0; i < matris.length; i++) {
			if( m != matris[i][i] ) {
				return false;
			}
		}
		return true;
	}

	public static void kosegenDurumYazdir(int[][] matris) {  // Köþegen kontrollerini yazdýran metod.
		for (int i = 0; i < 2; i++) {
			if(solUstKosegenAyniMi(matris,i)){
				System.out.println("Sol üst köþegenin hepsi "+i);
			}
			if(sagUstKosegenAyniMi(matris, i)) {
				System.out.println("Sað üst köþegenin hepsi "+i);
			}
		}
		if(!solUstKosegenAyniMi(matris, 0) && !solUstKosegenAyniMi(matris, 1)) {
			System.out.println("Sol üst köþegendeki sayýlar ayný deðil.");
		}
		if(!sagUstKosegenAyniMi(matris, 0) && !sagUstKosegenAyniMi(matris, 1)) {
			System.out.println("Sað üst köþegendeki sayýlar ayný deðil.");
		}
	}
	
}
