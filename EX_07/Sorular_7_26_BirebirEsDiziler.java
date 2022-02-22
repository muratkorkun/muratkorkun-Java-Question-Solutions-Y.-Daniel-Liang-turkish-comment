package Bolum07_DersteYazilanKodlar;
import java.util.Scanner;
public class Sorular_7_26_BirebirEsDiziler {
/*
(Birebir e� diziler) Kar��l�klar� elemanlar� birebir e�it olan  list1 ve list2 dizilerine birebir e� diziler denir. E�er list1 ve list2 birebir e� dizilerse true d�nen a�a��daki bildirime sahip bir metot yaz�n�z.
public static boolean birebirEsitMi	(int[] list1, int[] list2)
Kullan�c�dan iki tam say� dizisi girmesini isteyen ve bu dizilerin birebir e� olup olmad���n� kontrol eden bir test program� yaz�n�z. Program�n �rnek ak���n� inceleyiniz. Girilen ilk say�n�n dizinin eleman say�s�n� g�sterece�ini unutmay�n�z. Bu say� dizinin bir eleman� olmayacakt�r.

                     Dizi1�i giriniz:   5  2  5  6  1  6

                     Dizi2�yi giriniz: 5  2  5  6  1  6

                     Iki dizi birebir aynidir


                     Dizi1�i giriniz:   5  2  5  6  6  1

                     Dizi2�yi giriniz: 5  2  5  6  1  6

                     Iki dizi birebir ayni degildir
 */

	public static boolean birebirEsitMi(int[] list1, int[] list2) {
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
	
	public static void main(String[] args) {
		System.out.println("L�tfen ilk  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
		
		Scanner klavye= new Scanner(System.in);
		
		int[] list1 = scannerdanListeAl(klavye);  // Scanner nesnesini alan ve bu nesne ile dizi �reten ve diziyi d�nd�ren methot kulland�k.
		
		System.out.println("L�tfen ikinci  dizinin eleman say�s�n� ve de�erlerini s�ras� ile giriniz.");
		int[] list2=scannerdanListeAl(klavye);
		
		klavye.close();
		
		System.out.println("�ki dizi birebir "+(birebirEsitMi(list1, list2)?"ayn�d�r":"ayn� de�ildir."));  // Ternary ifadeyi String i�inde kullanabilmek i�in ifadenin tamam�n� parantezlere ald�k. 
																										//E�er bir String de�i�kene atay�p kullanmak isteseydik parantezlere gerek olmayacakt�.
	}

	public static int[] scannerdanListeAl(Scanner klavye) {
		int[] list=new int[klavye.nextInt()];
		
		for (int i = 0; i < list.length; i++) {
			list[i]=klavye.nextInt();
		}
		return list;
	}
	
}

