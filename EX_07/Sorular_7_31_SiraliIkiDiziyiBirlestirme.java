package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

import chapter07.BinarySearch;

public class Sorular_7_31_SiraliIkiDiziyiBirlestirme {
	/*
	 * 7.31 
(S�ral� iki diziyi birle�tirme) �ki s�ral� diziyi birle�tirip yeni bir s�ral� dizi olu�turan a�a��daki bildirime sahip bir metot yaz�n�z.

public static int[] merge(int[] list1, int[] list2)

Metodu en fazla  list1.length + list2. length toplam say�s�n� ge�meyecek kadar kar��la�t�rma yapacak �ekilde yaz�n�z. Kullan�c�dan iki s�ral� dizi girmesini isteyen ve birle�tirilmi� diziyi g�steren bir test program� yaz�n�z. �rnek ak��� inceleyiniz. Girilen ilk say�n�n dizinin eleman say�s�n� g�sterece�ini unutmay�n�z. Bu say� dizinin bir eleman� olmayacakt�r.

                    Dizi1�i giriniz:  5  1  5  16  61  111 

                    Dizi2�yi giriniz: 4  2  4  5  6 

                    Birlestirilmis dizi 1  2  4  5  5  6  16  61  111
	 */

	
	
	public static void main(String[] args) {
		System.out.println("Dizi1'i giriniz ilk say� dizinin eleman say�s� olacakt�r.");
		Scanner klavye=new Scanner(System.in);
		
		int[] list1=new int[klavye.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i]=klavye.nextInt();
		}
		
		System.out.println("Dizi2'i giriniz ilk say� dizinin eleman say�s� olacakt�r.");
		int[] list2=new int[klavye.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i]=klavye.nextInt();
		}
		klavye.close();
		
		int[] listBirlesik=ikiDiziyiBirlestir(list1,list2);
		for (int i = 0; i < listBirlesik.length; i++) {
			System.out.print(listBirlesik[i]+" ");
		}
	}

	private static int[] ikiDiziyiBirlestir(int[] list1, int[] list2) {  // �ki diziyi �nce birle�tirdik. Sonra yard�mc� method ile s�ralad�k.
		int[] listBirlesik=new int[list1.length+list2.length];
		
		for (int i = 0; i < list1.length; i++) {
			listBirlesik[i]=list1[i];
		}
		for (int i = 0; i < list2.length; i++) {
			listBirlesik[list1.length+i]=list2[i];
		}
		secimliSiralama(listBirlesik); // Yard�mc� metod k���kten b�y��e s�ralamak i�in.
		
		return listBirlesik;
	}

	public static void secimliSiralama(int[] listBirlesik) {  // Y.Daniel.Liang.-.Introduction.to.Java pdf kitapta  sorting arrays b�l�m�nde selectionSort methodu bulunmaktad�r.
		for (int i = 0; i < listBirlesik.length-1; i++) {
			int enKucuk=listBirlesik[i];
			int enKucukIndis=i;
			for (int j = i+1; j < listBirlesik.length; j++) {
				if(enKucuk > listBirlesik[j] ) {
					enKucuk=listBirlesik[j];
					enKucukIndis=j;
				}
			}
			if(enKucuk !=listBirlesik[i]) {
				listBirlesik[enKucukIndis]=listBirlesik[i];
				listBirlesik[i]=enKucuk;
			}
		}
	}
}


