package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

import chapter07.BinarySearch;

public class Sorular_7_31_SiraliIkiDiziyiBirlestirme {
	/*
	 * 7.31 
(Sýralý iki diziyi birleþtirme) Ýki sýralý diziyi birleþtirip yeni bir sýralý dizi oluþturan aþaðýdaki bildirime sahip bir metot yazýnýz.

public static int[] merge(int[] list1, int[] list2)

Metodu en fazla  list1.length + list2. length toplam sayýsýný geçmeyecek kadar karþýlaþtýrma yapacak þekilde yazýnýz. Kullanýcýdan iki sýralý dizi girmesini isteyen ve birleþtirilmiþ diziyi gösteren bir test programý yazýnýz. Örnek akýþý inceleyiniz. Girilen ilk sayýnýn dizinin eleman sayýsýný göstereceðini unutmayýnýz. Bu sayý dizinin bir elemaný olmayacaktýr.

                    Dizi1’i giriniz:  5  1  5  16  61  111 

                    Dizi2’yi giriniz: 4  2  4  5  6 

                    Birlestirilmis dizi 1  2  4  5  5  6  16  61  111
	 */

	
	
	public static void main(String[] args) {
		System.out.println("Dizi1'i giriniz ilk sayý dizinin eleman sayýsý olacaktýr.");
		Scanner klavye=new Scanner(System.in);
		
		int[] list1=new int[klavye.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i]=klavye.nextInt();
		}
		
		System.out.println("Dizi2'i giriniz ilk sayý dizinin eleman sayýsý olacaktýr.");
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

	private static int[] ikiDiziyiBirlestir(int[] list1, int[] list2) {  // Ýki diziyi önce birleþtirdik. Sonra yardýmcý method ile sýraladýk.
		int[] listBirlesik=new int[list1.length+list2.length];
		
		for (int i = 0; i < list1.length; i++) {
			listBirlesik[i]=list1[i];
		}
		for (int i = 0; i < list2.length; i++) {
			listBirlesik[list1.length+i]=list2[i];
		}
		secimliSiralama(listBirlesik); // Yardýmcý metod küçükten büyüðe sýralamak için.
		
		return listBirlesik;
	}

	public static void secimliSiralama(int[] listBirlesik) {  // Y.Daniel.Liang.-.Introduction.to.Java pdf kitapta  sorting arrays bölümünde selectionSort methodu bulunmaktadýr.
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


