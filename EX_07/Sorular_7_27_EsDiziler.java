package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_27_EsDiziler {
	/*
(E� diziler) Ayn� elemanlara sahip olan list1 ve list2 dizilerine e� diziler denir. E�er  list1 ve list2  e� dizilerse true d�nen a�a��daki bildirime sahip bir metod yaz�n�z.

public static boolean esMi(int[] list1, int[] list2)

Kullan�c�dan iki tam say� dizisi girmesini isteyen ve bu dizilerin e� olup olmad���n� kontrol eden bir test program� yaz�n�z. Program�n �rnek ak���n� inceleyiniz: Girilen ilk say�n�n dizinin eleman say�s�n� g�sterece�ini unutmay�n�z. Bu say� dizinin bir eleman� olmayacakt�r.

                     Dizi1�i giriniz:   5  2  5  6  6  1

                     Dizi2�yi giriniz: 5  5  2  6  1  6

                     Iki dizi birbirine estir


                     Dizi1�i giriniz:   5  5  5  6  6  1

                     Dizi2�yi giriniz: 5  2  5  6  1  6

                     Iki dizi birbirine es degildir
	 */

	public static void main(String[] args) {
		
		System.out.println("L�tfen ilk  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
		
		Scanner klavye= new Scanner(System.in);
		
		int[] list1 = scannerdanListeAl(klavye);  // Scanner nesnesini alan ve bu nesne ile dizi �reten ve diziyi d�nd�ren methot kulland�k.
		
		System.out.println("L�tfen ikinci  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
		int[] list2=scannerdanListeAl(klavye);
		
		klavye.close();
		
		System.out.println("�ki dizi birbirine "+(ikiDiziEsMi(list1, list2)?"e�tir.":"e� de�ildir.")); // �ki dizi biribirini kontrol etmek zorundad�r.Aksi halde do�ru sonu� alamy�z.
								// Ternary ifadeyi String i�inde kullanabilmek i�in ifadenin tamam�n� parantezlere ald�k. 
								//E�er bir String de�i�kene atay�p kullanmak isteseydik parantezlere gerek olmayacakt�.
}
	
	
	public static boolean ikiDiziEsMi(int[] m1, int[] m2) {
		
		if(esMi(m1, m2) && esMi(m2, m1)) {
			return true;
		}
		return false;
	}
	
	public static boolean esMi(int[] list1,int[] list2) {
		
		int a=list1.length;
		int b=list2.length;
		
		if(list1 == list2) {  // iki dizinin referans� e�it ise yani ikiside ayn� nesneyi g�steriyorsa kesinlikle bunlar e� de�ildir. 
					//Bu soruya �zel olarak dizileri kullan�c�dan ald���m�z i�in dizilerin referans� ayn� olmayacakt�r fakat main methodda olu�turulmu� ve referans� birbirine atanm�� dizilerde test edilme ihtimaline y�nelik bu kontrol k�sm�n�da ekledik.
			return false;
		}
		else if(a != b) {	//�ki dizinin uzunlu�u e�it de�il ise bu diziler e� de�ildir.
			return false;
		}
		else {
	// �lk dizinin her bir eleman� i�in di�er dizide e�i var m� diye kontrol ettik.Bu kontrol� yaparken ikinci dizinin j'inci eleman�na denk geldi�imizde bu eleman�n�n di�er d�ng�lerde tekrar kontrol edilmesini �nlemeye �al��t�k.
			//Bunun  i�in boolean bir dizi olu�turduk ve her e�itlik do�rulamas�nda bu boolean dizinin j'inci eleman�n� true'ya de�i�tirdik. Bunu yaparken ayn� zamanda listedeVarSayaci'mizi 1 art�rd�k. 
			//ListedeVarSayac'�m�z e�er dizi uzunlu�u kadar bir say�ya eri�ti ise bu 2 dizinin her eleman�n�n e�lik durumu kontrol edilmi� ve do�rulanm�� demektir.
			//Bir di�er ��z�m y�ntemi olarak kontrolEdilmeDurumu dizisinin her eleman� true oldu ise bu  diziler e� dizilerdir diyebilirdik.
			boolean[] bulunmaDurumu=new boolean[a];     
			int bulunduSayaci=0;
			for (int i = 0; i < bulunmaDurumu.length; i++) {
				for (int j = 0; j < bulunmaDurumu.length; j++) {
					if(list1[i] == list2[j] && bulunmaDurumu[j]==false) {
						bulunmaDurumu[j]=true;
						bulunduSayaci++;
					}
				}
			}
			if(bulunduSayaci == a) {
				return true;     // Sayac�m�z e�er dizi uzunlu�una ula�t�ysa diziler e�tir. True d�nd�k.
			}
		}
		return false;  // Yukar�daki kontrollerden dizilerin e� oldu�u sonucu ��kmad� ise false return ettik.
	}
	
	public static int[] scannerdanListeAl(Scanner klavye) { // Yard�mc� method ile scannerdan dizi olu�turduk.Olu�turdu�umuz diziyi d�nderdik.
		int[] list=new int[klavye.nextInt()];
		for (int i = 0; i < list.length; i++) {
			list[i]=klavye.nextInt();
		}
		return list;
	}
}
/*
 *    				Liste1�i giriniz:   51  22  25  6  1  4  24  54  6

                   Liste2�yi giriniz:   51  22  25  6  1  4  24  54  6
                   
                   //  51 51 51 51 51 51 51 51 51
*/
