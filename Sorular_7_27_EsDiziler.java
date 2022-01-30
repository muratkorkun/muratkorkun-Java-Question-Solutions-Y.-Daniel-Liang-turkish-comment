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
		else if(birebirEsitMi(list1, list2)) {   // Bir �nceki soruyu ��zerken yazd���m�z methodu burada kulland�k. �ki dizi birerbir e�it ise kesinlikle bunlar e� de�illerdir.
			return false;
		}else {
	// �lk dizinin her bir eleman� i�in di�er dizide e�i var m� diye kontrol ettik.Bu kontrol� yaparken ikinci dizinin j'inci eleman�na denk geldi�imizde bu eleman�n�n di�er d�ng�lerde tekrar kontrol edilmesini �nlemeye �al��t�k.
			//Bunun  i�in boolean bir dizi olu�turduk ve her e�itlik do�rulamas�nda bu boolean dizinin j'inci eleman�n� true'ya de�i�tirdik. Bunu yaparken ayn� zamanda listedeVarSayaci'mizi 1 art�rd�k. 
			//ListedeVarSayac'�m�z e�er dizi uzunlu�u kadar bir say�ya eri�ti ise bu 2 dizinin her eleman�n�n e�lik durumu kontrol edilmi� ve do�rulanm�� demektir.
			//Bir di�er ��z�m y�ntemi olarak kontrolEdilmeDurumu dizisinin her eleman� true oldu ise bu  diziler e� dizilerdir diyebilirdik.
			boolean[] kontrolEdilmeDurumu=new boolean[a];     
			int listedeVarSayaci=0;
			for (int i = 0; i < kontrolEdilmeDurumu.length; i++) {
				for (int j = 0; j < kontrolEdilmeDurumu.length; j++) {
					if(list1[i] == list2[j] && kontrolEdilmeDurumu[j]==false) {
						kontrolEdilmeDurumu[j]=true;
						listedeVarSayaci++;
						
					}
				}
			}
			if(listedeVarSayaci == a) {
				return true;     // Sayac�m�z e�er dizi uzunlu�una ula�t�ysa diziler e�tir. True d�nd�k.
			}
		}
		return false;  // Yukar�daki kontrollerden dizilerin e� oldu�u sonucu ��kmad� ise false return ettik.
	}
	
	public static boolean birebirEsitMi(int[] list1, int[] list2) {   // Yard�mc� method olarak kulland�k.
		int a=list1.length;
		int b=list2.length;
		
		if(list1==list2) {   // iki dizi ayn� referans� g�steriyorsa  zaten birebir ayn�d�r. True d�nderdik.
			return true;
		}
		else if(a != b) {   // �ki dizi uzunlu�u biribirinden farkl�ise kesinlikle bunlar birerbir ayn� de�ildir. False d�nderdik.
			return false;
		}
		else if( a==b ) {			// iki dizi uzunlu�u birbirine e�it ise for d�ng�s� ile her bir dizinin ayn� indisindeki de�erleri kar��la�t�rd�k.Bunun sonucunda e�er bir defa bile de�erler birbirine e�it de�il sonucu ��k�yorsa false d�nderdik.
			for (int i = 0; i < a; i++) {
				if(list1[i] != list2[i]) {
					return false;
				}
			}
		}						//Hi� bir zaman buraya kadar false de�eri gelmedi ise true de�erini d�nderdik. Yani yanl��lamalardan sonra false de�eri gelmiyorsa true d�nd�k. 
									//En ba�taki referans e�itli�i durumunu (true durumu en sonda olacak zaten ne gerek var en ba�ta kontrol etmeye diye sorarsan�z) kontrol etmemizin sebebi cpu ya gereksiz y�k bindirmemek i�indir.
		return true;
	}
	
	public static int[] scannerdanListeAl(Scanner klavye) { // Yard�mc� method ile scannerdan dizi olu�turduk.Olu�turdu�umuz diziyi d�nderdik.
		int[] list=new int[klavye.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i]=klavye.nextInt();
		}
		return list;
	}
	public static void main(String[] args) {
		
			System.out.println("L�tfen ilk  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
			
			Scanner klavye= new Scanner(System.in);
			
			int[] list1 = scannerdanListeAl(klavye);  // Scanner nesnesini alan ve bu nesne ile dizi �reten ve diziyi d�nd�ren methot kulland�k.
			
			System.out.println("L�tfen ikinci  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
			int[] list2=scannerdanListeAl(klavye);
			
			klavye.close();
			
			System.out.println("�ki dizi birbirine "+(esMi(list1, list2)?"e�tir.":"e� de�ildir.")); 
									// Ternary ifadeyi String i�inde kullanabilmek i�in ifadenin tamam�n� parantezlere ald�k. 
									//E�er bir String de�i�kene atay�p kullanmak isteseydik parantezlere gerek olmayacakt�.
	}
}

