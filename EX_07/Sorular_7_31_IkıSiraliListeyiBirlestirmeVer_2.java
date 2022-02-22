package Bolum07_DersteYazilanKodlar;

import java.util.Scanner;

public class Sorular_7_31_Ik�SiraliListeyiBirlestirmeVer_2 {
	/*
	 * 7.31 (S�ral� iki diziyi birle�tirme) �ki s�ral� diziyi birle�tirip yeni bir
	 * s�ral� dizi olu�turan a�a��daki bildirime sahip bir metot yaz�n�z.
	 * 
	 * public static int[] merge(int[] list1, int[] list2)
	 * 
	 * Metodu en fazla list1.length + list2. length toplam say�s�n� ge�meyecek kadar
	 * kar��la�t�rma yapacak �ekilde yaz�n�z. Kullan�c�dan iki s�ral� dizi girmesini
	 * isteyen ve birle�tirilmi� diziyi g�steren bir test program� yaz�n�z. �rnek
	 * ak��� inceleyiniz. Girilen ilk say�n�n dizinin eleman say�s�n� g�sterece�ini
	 * unutmay�n�z. Bu say� dizinin bir eleman� olmayacakt�r.
	 * 
	 * Dizi1�i giriniz:     5 1 5 16 61 111                                �rneklem     //   10 -334 -67 -67 -34  -23 -12  -5 -5  0  999
	 * 																			     	// 	 15  1 2 4 5 5 6  09 16 34 56 61 67 98 111 447 
	 * Dizi2�yi giriniz:    4 2 4 5 6                                   
	 * 
	 * Birlestirilmis dizi  1 2 4 5 5 6 16 61 111                           		    //  -334 -67 -67 -34 -23 -12 -5 -5 0 1 2 4 5 5 6 9 16 34 56 61 67 98 111 447 999 
	 */
	public static void main(String[] args) {
		System.out.println("Dizi1'i giriniz ilk say� dizinin eleman say�s� olacakt�r.");
		Scanner klavye = new Scanner(System.in);

		int[] list1 = new int[klavye.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = klavye.nextInt();
		}

		System.out.println("Dizi2'i giriniz ilk say� dizinin eleman say�s� olacakt�r.");
		int[] list2 = new int[klavye.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = klavye.nextInt();
		}
		klavye.close();

		int[] listBirlesik = birlestir(list1, list2);
		for (int i = 0; i < listBirlesik.length; i++) {
			System.out.print(listBirlesik[i] + " ");
		}
	}

	public static int[] birlestir(int[] list1, int[] list2) {
		int isaretci_1 = 0;
		int isaretci_2 = 0;
		int birlesikListeIndis = 0;
		int[] birlesikListe = new int[list1.length + list2.length];

		while (birlesikListeIndis < list1.length + list2.length) {   // D�ng�m�z� liste 1 ve  liste 2 nin toplam�na kadar  olacak �ekilde ayarlad�k.  Listeleri pointerlar ile izleyerek dizi elemlar�n� kar��la�t�rd�k. 

			if (list1[isaretci_1] <= list2[isaretci_2] && isaretci_1 < list1.length - 1) {  //Burada liste1 de i�aret�inin g�sterdi�i de�er liste2 nin i�aret�isinin g�sterdi�i de�erden k���k m� yada e�it mi k�yaslad�k .E�er do�ru ise birlesik listemize atad�k ve i�aret�imizi bir ilerlettik.
				birlesikListe[birlesikListeIndis] = list1[isaretci_1];
				isaretci_1++;
			} else if (list1[isaretci_1] <= list2[isaretci_2] && isaretci_1 == list1.length) {//Burada e�er liste1 in sonuna  ula��ld� ise son eleman�n birle�ik listeye atamas�n� yapt�k. Ve di�er listede kalan elmanlar�n hepsini birlesik listeye atad�k. 
				birlesikListe[birlesikListeIndis] = list1[isaretci_1];
				while(isaretci_2 <list2.length) {
				
					birlesikListe[list1.length+isaretci_2]=list2[isaretci_2];  // Liste1'in yaz�lmas� zaten bittiyse liste1'in indis says�na liste2'nin i�aret�isinin say�s�n� ekleyerek birlesikListe'nin indisine gereken atamay� yapt�k.
					birlesikListeIndis++;						//Her atamadan sonra birlesikIndis'i bir art�rd�k . B�y�k d�ng�ye  birlesikListe dizimiz haz�rland� tamam i� bitti  diyebilmek i�in bunu yapt�k.
					isaretci_2++;                            //Yine i�aretciyi bir ilerletttik.
				}
				
			} else if (list1[isaretci_1] > list2[isaretci_2] && isaretci_2 < list2.length - 1) {  // E�er liste1'in i�aret edilen eleman� b�y�kse liste2'nin i�aret edilen eleman�ndan  ve i�aret�i_2 k���kse liste2'nin son indisinden bu blok �al��s�n dedik. 
				birlesikListe[birlesikListeIndis] = list2[isaretci_2];								//��nki son elemana denk gelen i�aret�iyi ayr�ca denetledik.
				isaretci_2++;
			}
			else if (list1[isaretci_1] > list2[isaretci_2] && isaretci_2 == list2.length - 1) {  // Burada i�aret�i_2 i�in son eleman� g�sterme durumunu denetledik.
				birlesikListe[birlesikListeIndis] = list2[isaretci_2];						// liste2'nin son atamas�n� yapt�k
				while(isaretci_1 <list1.length) {											//liste1'de kalan elemanlar�n hepsi birlesikListe'ye yaz�lana kadar d�ng� kulland�k.
																								
					birlesikListe[list2.length+isaretci_1]=list1[isaretci_1];
					birlesikListeIndis++;
					isaretci_1++;
				}
			}

			birlesikListeIndis++;
		}

		return birlesikListe;

	}
}

